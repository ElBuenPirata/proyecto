package com.proyecto.view.Menu;
import java.util.Scanner;
import com.proyecto.view.ReadTypes;

public class MenusDetalleVenta {
public static int opcionesModificar(Scanner scanner) {

		int opcion;

		while (true) {
			try {
				System.out.println("Ingrese una opcion: ");
				System.out.println("------------------- ");
				System.out.println("1. Actualizar código del producto");
				System.out.println("2. Actualizar cantidad");
				System.out.println("0. Salir");
				System.out.println();

				opcion = scanner.nextInt();
				scanner.nextLine();

				if (opcion >= 0 && opcion <= 4) {
					return opcion;
				}

			} catch (java.util.InputMismatchException e) {
				System.out.println("Ingrese solo valores numéricos");
				System.out.println();
				scanner.nextLine();
			}
		}
}

	public static void menuModificar(Scanner scanner, com.proyecto.entity.DetalleVenta detalleVenta) {
		boolean salir = false;

		while (!salir) {
			switch (opcionesModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.print("código anterior: ");
				System.out.println(detalleVenta.getCodigo_producto());
				int codigo_producto = ReadTypes.leerEntero(scanner, "Ingrese el nuevo código del producto: ");
				detalleVenta.setCodigo_producto(codigo_producto);
				break;
			case 2:
				System.out.print("cantidad anterior: ");
				System.out.println(detalleVenta.getCantidad());
				int cantidad = ReadTypes.leerEntero(scanner, "Ingrese la nueva cantidad: ");
				detalleVenta.setCantidad(cantidad);
				break;
			}
	}

}
}