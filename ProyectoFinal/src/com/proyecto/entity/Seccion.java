package com.proyecto.entity;

public class Seccion {
	private int codigoSeccion;
	private String descripcion;
	private int stock;
	private int edadPromedio;
	
	public Seccion(int codigoSeccion, String descripcion, int stock, int edadPromedio) {
		this.codigoSeccion = codigoSeccion;
		this.descripcion = descripcion;
		this.stock = stock;
		this.edadPromedio = edadPromedio;
	}
	
	public int getCodigoSeccion() {
		return codigoSeccion;
	}
	public void setCodigoSeccion(int codigoSeccion) {
		this.codigoSeccion = codigoSeccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getEdadPromedio() {
		return edadPromedio;
	}
	public void setEdadPromedio(int edadPromedio) {
		this.edadPromedio = edadPromedio;
	}
	@Override
	public String toString() {
		return "Seccion [codigoSeccion=" + codigoSeccion + ", descripcion=" + descripcion + ", stock=" + stock
				+ ", edadPromedio=" + edadPromedio + "]";
	}
}
