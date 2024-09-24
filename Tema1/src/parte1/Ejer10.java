package parte1;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida un número al usuario e indique mediante un
		 * literal booleano (true o false) si el número es par.
		 */
		// Declaramos la variable.
		int numero;
		// Creamos el Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos el número al usuario.
		System.out.println("¿Cuál es el número?");
		// Leemos entrada de teclado.
		numero = input.nextInt();
		// Imprimimos el resultado.
		System.out.println(numero % 2 == 0);
		// Cerramos el Scanner.
		input.close();
	}
}
