package parte2;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida como entrada un número con decimales y lo
		 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
		 */
		// Declaramos variable.
		double numero;
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos el número.
		System.out.println("Introduce el número");
		// Leemos entrada de teclado.
		numero = input.nextDouble();
		// Imprimimos la respuesta.
		System.out.println("El número redondeado es de " + ((int) (0.5 + numero)));
		// Cerramos el Scanner.
		input.close();
	}
}
