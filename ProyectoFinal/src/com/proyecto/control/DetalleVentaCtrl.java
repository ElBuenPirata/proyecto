package com.proyecto.control;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.proyecto.entity.DetalleVenta;

public class DetalleVentaCtrl implements Control<DetalleVenta> {

private Conexion conexion;
	
	public DetalleVentaCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public int generadorC�digoVenta() throws Throwable{
		ResultSet rs;
		int c�digoVenta = 0;
		conexion.SQL("SELECT * FROM venta ORDER BY venta.c�digo DESC LIMIT 1");
		rs=conexion.resultSet();
		
		while(rs.next()){
		c�digoVenta = rs.getInt("c�digo");
		}
		return c�digoVenta;
		
	}

	/*
	 * *****************************************************************************
	 * List
	 ******************************************************************************/
	public ArrayList<DetalleVenta> list() throws Throwable {
		ArrayList<DetalleVenta> DetalleVenta = new ArrayList<DetalleVenta>();
		ResultSet rs;
		int c�digoProducto;
		int cantidad;

		conexion.SQL("Select * from detalleventa");

		rs = conexion.resultSet();

		while (rs.next()) {
			c�digoProducto = rs.getInt("c�digoProducto");
			cantidad = rs.getInt("cantidad");
			DetalleVenta.add(new DetalleVenta(c�digoProducto, cantidad));
		}

		return DetalleVenta;

	}

	/*
	 * *****************************************************************************
	 * Insert
	 ******************************************************************************/
	public void insert(DetalleVenta DetalleVenta) throws Throwable {

		conexion.SQL("Insert into detalleventa(c�digoVenta,c�digoProducto,cantidad) VALUES(?,?,?)");
		conexion.preparedStatement().setInt(1, generadorC�digoVenta());
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
		int c�digoProducto;
		int cantidad;
		if (DetalleVenta != null) {
			c�digoProducto = DetalleVenta.getCodigo_producto();
			cantidad = DetalleVenta.getCantidad();

			conexion.SQL("Update detalleventa set c�digoProducto = ?, cantidad = ? where c�digo=?");
			conexion.preparedStatement().setInt(1, c�digoProducto);
			conexion.preparedStatement().setInt(2, cantidad);
			conexion.CUD();
		}
	}

	
}

