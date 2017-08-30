package com.proyecto.entity;

public class Proveedor {
	
	private int codigo_proveedor;
	private String nombre;
	private int telefono;
	private String direccion;
	
	public Proveedor(int codigo_proveedor, String nombre, int telefono, String direccion) {
		
		this.codigo_proveedor = codigo_proveedor;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(int codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [codigo_proveedor=" + codigo_proveedor + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
		
}
