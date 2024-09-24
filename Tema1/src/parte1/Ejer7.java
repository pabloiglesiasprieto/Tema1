package parte1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
		 * Guarda cada dato en variables distintas. A continuación, muestra los datos de
		 * la siguiente forma: Nombre: Elena Dirección: Calle Inventada Teléfono:
		 * 987654321
		 */
		// Declaramos las variables
		String nombre;
		String direccion;
		String telefono;
		// Creamos Scanner
		Scanner input = new Scanner(System.in);
		// Preguntamos al usuario su nombre.
		System.out.println("¿Cuál es su nombre?");
		// Leemos entrada de teclado
		nombre = input.nextLine();
		// Preguntamos por dirección.
		System.out.println("¿Cuál es su dirección?");
		// Leemos entrada de teclado.
		direccion = input.nextLine();
		// Preguntamos por el teléfono.
		System.out.println("¿Cual es su teléfono?");
		// Leemos entrada de teclado.
		telefono = input.nextLine();
		// Imprimimos en pantalla el resultado.
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		// Cerramos Scanner.
		input.close();
	}
}
