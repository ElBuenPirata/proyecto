package com.proyecto.entity;

import java.util.Date;

public class Compra {
	private int codigo_compra;
	private int codigo_proveedor;
	private Date fecha;
	
	public Compra(int codigo_compra, int codigo_proveedor, Date fecha) {
	
		this.codigo_compra = codigo_compra;
		this.codigo_proveedor = codigo_proveedor;
		this.fecha = fecha;
	}
	public Compra(Date fecha) {
		this.fecha = fecha;
	}
	
	public Compra(int codigo_compra) {
		this.codigo_compra = codigo_compra;
	}

	public int getCodigo_compra() {
		return codigo_compra;
	}

	public void setCodigo_compra(int codigo_compra) {
		this.codigo_compra = codigo_compra;
	}

	public int getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Compra [codigo_compra=" + codigo_compra + ", codigo_proveedor=" + codigo_proveedor + ", fecha=" + fecha
				+ "]";
	}
	
	
	

}
