package parte1;

import java.util.Scanner;

public class Ejer9 {
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
		// Imprimimos el resultado.
		System.out.println(edad >= 18);
		// Cerramos el Scanner.
		input.close();
	}
}
