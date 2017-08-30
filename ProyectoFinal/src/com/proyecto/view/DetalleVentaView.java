package com.proyecto.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.control.DetalleCompraCtrl;
import com.proyecto.control.Conexion;
import com.proyecto.entity.DetalleVenta;
import com.proyecto.view.Menu.MenusDetalleVenta;


public class DetalleVentaView {

	
	private Scanner scanner;
	private DetalleVenta DetalleVenta;
	private DetalleCompraCtrl DetalleVentaCtrl;
	
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public DetalleVentaView(Conexion conexion, Scanner scanner) {
	
		this.scanner = scanner;
		DetalleVentaCtrl = new  DetalleCompraCtrl(conexion);
		
	}
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void insertar() {
		int códigoProducto;
		int cantidad;

		códigoProducto = ReadTypes.leerEntero(scanner, "Ingrese el código del producto: ");
		cantidad = ReadTypes.leerEntero(scanner, "Ingrese la cantidad: ");

		DetalleVenta = new DetalleVenta(códigoProducto, cantidad);
		
		try {
			DetalleVentaCtrl.insert(DetalleVenta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

	}
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void listar() {
		ArrayList<DetalleVenta> DetalleVenta;

		try {
			DetalleVenta = DetalleVentaCtrl.list();
			for (int i = 0; i < DetalleVenta.size(); i++) {
				System.out.println(DetalleVenta.get(i));
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void buscar(int codigo_venta) {
		DetalleVenta = new DetalleVenta(codigo_venta);
		try {
			DetalleVentaCtrl.search(DetalleVenta);
			System.out.println(DetalleVenta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/

	public void actualizar() {
		int código;
		
		código = ReadTypes.leerEntero(scanner, "Ingrese el código de la venta a modificar: ");
		DetalleVenta = new DetalleVenta(código);
		try {
			DetalleVentaCtrl.search(DetalleVenta);
		} catch (Throwable e1) {
			System.out.println(e1.getMessage());
		}

		MenusDetalleVenta.menuModificar(scanner, DetalleVenta);

		try {
			DetalleVentaCtrl.update(DetalleVenta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

}
