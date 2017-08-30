package com.proyecto.control;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.proyecto.entity.DetalleVenta;

public class DetalleVentaCtrl implements Control<DetalleVenta> {

private Conexion conexion;
	
	public DetalleVentaCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public int generadorCódigoVenta() throws Throwable{
		ResultSet rs;
		int códigoVenta = 0;
		conexion.SQL("SELECT * FROM venta ORDER BY venta.código DESC LIMIT 1");
		rs=conexion.resultSet();
		
		while(rs.next()){
		códigoVenta = rs.getInt("código");
		}
		return códigoVenta;
		
	}

	/*
	 * *****************************************************************************
	 * List
	 ******************************************************************************/
	public ArrayList<DetalleVenta> list() throws Throwable {
		ArrayList<DetalleVenta> DetalleVenta = new ArrayList<DetalleVenta>();
		ResultSet rs;
		int códigoProducto;
		int cantidad;

		conexion.SQL("Select * from detalleventa");

		rs = conexion.resultSet();

		while (rs.next()) {
			códigoProducto = rs.getInt("códigoProducto");
			cantidad = rs.getInt("cantidad");
			DetalleVenta.add(new DetalleVenta(códigoProducto, cantidad));
		}

		return DetalleVenta;

	}

	/*
	 * *****************************************************************************
	 * Insert
	 ******************************************************************************/
	public void insert(DetalleVenta DetalleVenta) throws Throwable {

		conexion.SQL("Insert into detalleventa(códigoVenta,códigoProducto,cantidad) VALUES(?,?,?)");
		conexion.preparedStatement().setInt(1, generadorCódigoVenta());
		conexion.preparedStatement().setInt(2, DetalleVenta.getCodigo_producto());
		conexion.preparedStatement().setInt(3, DetalleVenta.getCantidad());
		conexion.CUD();

	}

	/*
	 * *****************************************************************************
	 * Search
	 ******************************************************************************/

	public void search(DetalleVenta DetalleVenta) throws Throwable {

		ResultSet rs;

		conexion.SQL("Select * from DetalleVenta where codigo=?");
		DetalleVenta.setCodigo_producto(0);
		DetalleVenta.setCantidad(0);
		
		rs = conexion.resultSet();

		while (rs.next()) {

			DetalleVenta.setCodigo_producto(rs.getInt("codigo_producto"));
			DetalleVenta.setCantidad(rs.getInt("cantidad"));
			
		}

		rs.close();

	}

	/*
	 * *****************************************************************************
	 * Update
	 ******************************************************************************/

	public void update(DetalleVenta DetalleVenta) throws Throwable {
		int códigoProducto;
		int cantidad;
		if (DetalleVenta != null) {
			códigoProducto = DetalleVenta.getCodigo_producto();
			cantidad = DetalleVenta.getCantidad();

			conexion.SQL("Update detalleventa set códigoProducto = ?, cantidad = ? where código=?");
			conexion.preparedStatement().setInt(1, códigoProducto);
			conexion.preparedStatement().setInt(2, cantidad);
			conexion.CUD();
		}
	}

	
}

