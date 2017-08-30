package com.proyecto.entity;

public class Accesorios {
	private int codigo;

	public Accesorios(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Accesorios [codigo=" + codigo + "]";
	}
}

