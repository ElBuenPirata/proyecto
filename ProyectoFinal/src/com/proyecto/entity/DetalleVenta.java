package com.proyecto.entity;

public class DetalleVenta {
	private int codigo_venta;
	private int codigo_producto;
	private int cantidad;
	private double precio_venta;
    private double descuento;
	public DetalleVenta(int codigo_venta, int codigo_producto, int cantidad, double precio_venta, double descuento) {
		
		this.codigo_venta = codigo_venta;
		this.codigo_producto = codigo_producto;
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
		this.descuento = descuento;
	}
	
	public DetalleVenta(int codigo_venta) {
		super();
		this.codigo_venta = codigo_venta;
	}

	public DetalleVenta(int codigo_producto, int cantidad) {
		
		this.codigo_producto = codigo_producto;
		this.cantidad = cantidad;
	}

	public int getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public int getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "DetalleVenta [codigo_venta=" + codigo_venta + ", codigo_producto=" + codigo_producto + ", cantidad="
				+ cantidad + ", precio_venta=" + precio_venta + ", descuento=" + descuento + "]";
	}
    
}
