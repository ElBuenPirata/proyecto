package com.proyecto.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.proyecto.control.VentaCtrl;
import com.proyecto.control.Conexion;
import com.proyecto.entity.Venta;
import com.proyecto.view.Menú.MenusVenta;


public class VentaView {

	
	private Scanner scanner;
	private Venta Venta;
	private VentaCtrl VentaCtrl;
	
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public VentaView(Conexion conexion, Scanner scanner) {
	
		this.scanner = scanner;
		VentaCtrl = new  VentaCtrl(conexion);
		
	}
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void insertar() {
		String NIT;
		Date fecha;

		NIT = ReadTypes.leerCadena(scanner, "Ingrese el NIT: ");
		fecha = new Date();

		Venta = new Venta(fecha, NIT);
		
		try {
			VentaCtrl.insert(Venta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

	}
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void listar() {
		ArrayList<Venta> Ventas;

		try {
			Ventas = VentaCtrl.list();
			for (int i = 0; i < Ventas.size(); i++) {
				System.out.println(Ventas.get(i));
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public void buscar(String NIT) {
		Venta.setNIT(NIT);
		try {
			VentaCtrl.search(Venta);
			System.out.println(Venta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/

	public void actualizar() {
		String NIT;
		
		NIT = ReadTypes.leerCadena(scanner, "Ingrese el NIT de la venta a modificar: ");
		Venta.setNIT(NIT);
		try {
			VentaCtrl.search(Venta);
		} catch (Throwable e1) {
			System.out.println(e1.getMessage());
		}

		MenusVenta.menuModificar(scanner, Venta);

		try {
			VentaCtrl.update(Venta);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

}
