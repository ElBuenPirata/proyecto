package com.proyecto.entity;

import java.util.Date;

public class Empleados {
	private int codigo_Empleado;
	private String nombre;
	private Date fecha_nacimiento;
	private String direccion;
	private int telefono;
	
	public Empleados(int codigo_Empleado, String nombre, Date fecha_nacimiento, String direccion, int telefono) {
		
		this.codigo_Empleado = codigo_Empleado;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public int getCodigo_Empleado() {
		return codigo_Empleado;
	}
	public void setCodigo_Empleado(int codigo_Empleado) {
		this.codigo_Empleado = codigo_Empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Empleados [codigo_Empleado=" + codigo_Empleado + ", nombre=" + nombre + ", fecha_nacimiento="
				+ fecha_nacimiento + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	

}
