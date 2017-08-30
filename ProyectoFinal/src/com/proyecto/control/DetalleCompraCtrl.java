package com.proyecto.control;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.proyecto.entity.DetalleCompra;

public class DetalleCompraCtrl implements Control<DetalleCompra> {

private Conexion conexion;
	
	public DetalleCompraCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public int generadorCódigoCompra() throws Throwable{
		ResultSet rs;
		int codigoCompra = 0;
		conexion.SQL("SELECT * FROM compra ORDER BY compra.codigo_compra DESC LIMIT 1");
		rs=conexion.resultSet();
		
		while(rs.next()){
		codigoCompra = rs.getInt("codigo_compra");
		}
		return codigoCompra;
		
	}

	/*
	 * *****************************************************************************
	 * List
	 ******************************************************************************/
	public ArrayList<DetalleCompra> list() throws Throwable {
		ArrayList<DetalleCompra> DetalleCompra = new ArrayList<DetalleCompra>();
		ResultSet rs;
		int precioCompra;
		int cantidadCompra;
		int codigoAccesorio;

		conexion.SQL("Select * from detalle_compra");

		rs = conexion.resultSet();

		while (rs.next()) {
			precioCompra = rs.getInt("precio");
			cantidadCompra = rs.getInt("cantidad");
			codigoAccesorio = rs.getInt("codigoAccesorio");
			DetalleCompra.add(new DetalleCompra(precioCompra,cantidadCompra,codigoAccesorio));
		}

		return DetalleCompra;

	}

	/*
	 * *****************************************************************************
	 * Insert
	 ******************************************************************************/
	public void insert(DetalleCompra DetalleCompra) throws Throwable {

		conexion.SQL("Insert into detalle_compra(codigo_compra,cantidad,precio) VALUES(?,?,?)");
		conexion.preparedStatement().setInt(1, generadorCódigoCompra());
		conexion.preparedStatement().setInt(2, DetalleCompra.getCantidad());
		conexion.preparedStatement().setInt(3, DetalleCompra.getPrecio());
		conexion.CUD();

	}

	/*
	 * *****************************************************************************
	 * Search
	 ******************************************************************************/

	public void search(DetalleCompra DetalleCompra) throws Throwable {

		ResultSet rs;

		conexion.SQL("Select * from detalle_compra where código=?");
		DetalleCompra.setPrecio(0);
		DetalleCompra.setCantidad(0);
		DetalleCompra.setCodigoAccesorio(0);
		
		rs = conexion.resultSet();

		while (rs.next()) {

			DetalleCompra.setCodigoAccesorio(rs.getInt("codigoAccesorio"));
			DetalleCompra.setCantidad(rs.getInt("cantidad"));
			DetalleCompra.setPrecio(rs.getInt("Precio"));
			
		}

		rs.close();

	}

	/*
	 * *****************************************************************************
	 * Update
	 ******************************************************************************/

	public void update(DetalleCompra DetalleCompra) throws Throwable {
		int codigoAccesorio;
		int precio;
		int cantidad;
		if (DetalleCompra != null) {
			codigoAccesorio = DetalleCompra.getCodigoAccesorio();
			cantidad = DetalleCompra.getCantidad();
			precio = DetalleCompra.getPrecio();

			conexion.SQL("Update detalle_compra set codigoAccesorio = ?, cantidad = ?, precio = ? where codigo=?");
			conexion.preparedStatement().setInt(1, codigoAccesorio);
			conexion.preparedStatement().setInt(2, cantidad);
			conexion.preparedStatement().setInt(3, precio);
			conexion.CUD();
		}
	}
	
}

