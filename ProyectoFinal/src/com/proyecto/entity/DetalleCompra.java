package com.proyecto.entity;

public class DetalleCompra {
	private int precioCompra;
	private int cantidadCompra;
	private int codigoAccesorio;
	private int codigo;
	
	
	public DetalleCompra(int precioCompra, int cantidadCompra, int codigoAccesorio, int codigo) {
		this.precioCompra = precioCompra;
		this.cantidadCompra = cantidadCompra;
		this.codigoAccesorio = codigoAccesorio;
		this.codigo = codigo;
	}
	

	public DetalleCompra(int precioCompra, int cantidadCompra, int codigoAccesorio) {
		this.precioCompra = precioCompra;
		this.cantidadCompra = cantidadCompra;
		this.codigoAccesorio = codigoAccesorio;
	}


	public int getCodigoAccesorio() {
		return codigoAccesorio;
	}


	public void setCodigoAccesorio(int codigoAccesorio) {
		this.codigoAccesorio = codigoAccesorio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getPrecio() {
		return precioCompra;
	}

	public void setPrecio(int precio) {
		this.precioCompra = precio;
	}

	public int getCantidad() {
		return cantidadCompra;
	}

	public void setCantidad(int cantidad) {
		this.cantidadCompra = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleCompra [precioCompra=" + precioCompra + ", cantidadCompra=" + cantidadCompra
				+ ", codigoAccesorio=" + codigoAccesorio + ", codigo=" + codigo + "]";
	}
}
