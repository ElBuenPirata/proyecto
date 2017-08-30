package com.proyecto.entity;

import java.util.Date;

public class Producto {
	private int numCds;
	private double precioUnidad;
	private String tipoProducto;
	private Date fechaEstreno;
	private int codigo_Producto;
	private int codigo_Sección;
	
	
	public Producto(int numCds, double precioUnidad, String tipoProducto, Date fechaEstreno, int codigoProducto,
			int codigoSección) {
		this.numCds = numCds;
		this.precioUnidad = precioUnidad;
		this.tipoProducto = tipoProducto;
		this.fechaEstreno = fechaEstreno;
		this.codigo_Producto = codigoProducto;
		this.codigo_Sección = codigoSección;
	}
	
	public int getCodigoProducto() {
		return codigo_Producto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigo_Producto = codigoProducto;
	}

	public int getCodigoSección() {
		return codigo_Sección;
	}

	public void setCodigoSección(int codigoSección) {
		this.codigo_Sección = codigoSección;
	}

	public int getNumCds() {
		return numCds;
	}
	public void setNumCds(int numCds) {
		this.numCds = numCds;
	}
	public double getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	@Override
	public String toString() {
		return "Producto [numCds=" + numCds + ", precioUnidad=" + precioUnidad + ", tipoProducto=" + tipoProducto
				+ ", fechaEstreno=" + fechaEstreno + ", codigoProducto=" + codigo_Producto + ", codigoSección="
				+ codigo_Sección + "]";
	}
	
}
