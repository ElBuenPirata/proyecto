package com.proyecto.entity;

public class DetalleAccesorios {
	private int cantidadAccesorios;
	private int precioAccesorios;
	private int codigoAccesorios;
	private int codigoProducto;
	

	public DetalleAccesorios(int cantidadAccesorios, int precioAccesorios, int codigoAccesorios, int codigoProducto) {
		this.cantidadAccesorios = cantidadAccesorios;
		this.precioAccesorios = precioAccesorios;
		this.codigoAccesorios = codigoAccesorios;
		this.codigoProducto = codigoProducto;
	}
	
	public int getCodigoAccesorios() {
		return codigoAccesorios;
	}

	public void setCodigoAccesorios(int codigoAccesorios) {
		this.codigoAccesorios = codigoAccesorios;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidadAccesorios() {
		return cantidadAccesorios;
	}
	public void setCantidadAccesorios(int cantidadAccesorios) {
		this.cantidadAccesorios = cantidadAccesorios;
	}
	public int getPrecioAccesorios() {
		return precioAccesorios;
	}
	public void setPrecioAccesorios(int precioAccesorios) {
		this.precioAccesorios = precioAccesorios;
	}

	@Override
	public String toString() {
		return "DetalleAccesorios [cantidadAccesorios=" + cantidadAccesorios + ", precioAccesorios=" + precioAccesorios
				+ ", codigoAccesorios=" + codigoAccesorios + ", codigoProducto=" + codigoProducto + "]";
	}
}
