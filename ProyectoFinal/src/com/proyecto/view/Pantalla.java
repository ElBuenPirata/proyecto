package com.proyecto.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.proyecto.control.Conexion;

public class Pantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		ClienteView clienteView = new ClienteView(conexion,scanner);
		VentaView ventaView = new VentaView(conexion, scanner);
			
		//clienteView.insertar();
		
		//clienteView.listar();
		
		//clienteView.buscar("777");
		
		//clienteView.actualizar();
		
		//clienteView.listar();
		
		//ventaView.insertar();
		//ventaView.listar();
		//ventaView.buscar("123");
		//ventaView.actualizar();
		
		
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
		
		
		scanner.close();
		
		
		
	}

	
	
}
