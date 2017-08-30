package com.proyecto.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.proyecto.entity.Venta;

public class VentaCtrl implements Control<Venta> {

private Conexion conexion;
	
	public VentaCtrl (Conexion conexion) {
		this.conexion = conexion;
	}

	/*
	 * *****************************************************************************
	 * List
	 ******************************************************************************/
	public ArrayList<Venta> list() throws Throwable {
		ArrayList<Venta> Ventas = new ArrayList<Venta>();
		ResultSet rs;
		int codigo_Venta;
		Date fecha;
		String nIT;
		int codigo_Empleado;

		conexion.SQL("Select * from Venta");

		rs = conexion.resultSet();

		while (rs.next()) {
			codigo_Empleado = rs.getInt("codigo_Empleado");
			codigo_Venta = rs.getInt("codigo_Venta");
			fecha = rs.getDate("fecha");
			nIT = rs.getString("NIT");
			Ventas.add(new Venta(codigo_Empleado,codigo_Venta,fecha,nIT));
		}

		return Ventas;

	}

	/*
	 * *****************************************************************************
	 * Insert
	 ******************************************************************************/
	public void insert(Venta Venta) throws Throwable {

		conexion.SQL("Insert into Venta(NIT,fecha) VALUES(?,?)");

		conexion.preparedStatement().setDate(2, new java.sql.Date (Venta.getFecha().getTime()));
		conexion.preparedStatement().setString(1, Venta.getNIT());
		conexion.CUD();

	}

	/*
	 * *****************************************************************************
	 * Search
	 ******************************************************************************/

	public void search(Venta Venta) throws Throwable {

		ResultSet rs;

		conexion.SQL("Select * from Venta where NIT=?");
		Venta.setNIT(null);
		Venta.setFecha(null);
		
		rs = conexion.resultSet();

		while (rs.next()) {

			Venta.setFecha((java.util.Date) rs.getDate("fecha"));
			Venta.setNIT(rs.getString("NIT"));
			
		}

		rs.close();

	}

	/*
	 * *****************************************************************************
	 * Update
	 ******************************************************************************/

	public void update(Venta Venta) throws Throwable {
		Date fecha;
		String NIT;
		if (Venta != null) {
			fecha = Venta.getFecha();
			NIT = Venta.getNIT();

			conexion.SQL("Update Venta set fecha = ?, NIT = ? where código=?");
			conexion.preparedStatement().setDate(1, (java.sql.Date) fecha);
			conexion.preparedStatement().setString(2, NIT);
			conexion.CUD();
		}
	}

	
}

