package parte1;

import java.util.Scanner;

public class Ejer9Enhanced {
	public static void main(String[] args) {
		/*
		 * Realizar una aplicación que solicite al usuario su edad y le indique si es
		 * mayor de edad (mediante un literal booleano: true o false).
		 */
		// Declaramos la variable.
		int edad;
		// Creamos Scanner
		Scanner input = new Scanner(System.in);
		// Preguntamos al usuario su edad
		System.out.println("¿Cuál es tu edad?");
		// Leemos entrada de teclado.
		edad = input.nextInt();
		// Creamos condicional.
		if (edad <= 18) {
			// Ejecución si la condición se cumple.
			System.out.println("Eres menor de edad");
		} else {
			// Ejecución si la condición no se cumple
			System.out.println("Eres mayor de edad");
		}
		// Cerramos el Scanner.
		input.close();
	}
}