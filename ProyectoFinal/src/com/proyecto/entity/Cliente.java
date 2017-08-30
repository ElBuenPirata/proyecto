package com.proyecto.entity;

import java.util.Date;

public class Cliente {
	
	private String nombre;
	private String NIT;
	private int telefono;
	private Date fecha_nacimiento; 
	
	public Cliente(String NIT, String nombre, int telefono, Date fecha_nacimiento) {
		
		this.fecha_nacimiento = fecha_nacimiento;
		this.NIT = NIT;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Cliente(String nIT) {
		NIT = nIT;
	}

	public Cliente(String nombre, String nIT) {
		this.nombre = nombre;
		NIT = nIT;
	}

	public String getNIT() {
		return NIT;
	}
	
	public void setNIT(String nIT) {
		NIT = nIT;
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
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", NIT=" + NIT + ", telefono=" + telefono + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	
	
	}



