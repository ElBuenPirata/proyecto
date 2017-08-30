package com.proyecto.entity;

import java.util.Date;

public class Venta {
	private int codigo_Venta;
	private int codigo_Empleado;
	private Date fecha;
	private String NIT;
	
	public Venta(int codigo_Venta, int codigo_Empleado, Date fecha, String nIT) {
		this.codigo_Venta = codigo_Venta;
		this.codigo_Empleado = codigo_Empleado;
		this.fecha = fecha;
		NIT = nIT;
	}




	public Venta(Date fecha, String nIT) {
		
		this.fecha = fecha;
		NIT = nIT;
	}




	public int getCodigo_Venta() {
		return codigo_Venta;
	}

	public void setCodigo_Venta(int codigo_Venta) {
		this.codigo_Venta = codigo_Venta;
	}

	public int getCodigo_Empleado() {
		return codigo_Empleado;
	}

	public void setCodigo_Empleado(int codigo_Empleado) {
		this.codigo_Empleado = codigo_Empleado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	@Override
	public String toString() {
		return "Venta [codigo_Venta=" + codigo_Venta + ", codigo_Empleado=" + codigo_Empleado + ", fecha=" + fecha
				+ ", NIT=" + NIT + "]";
	}
}
		
