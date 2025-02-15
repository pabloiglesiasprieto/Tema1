package parte1;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Diseñar una aplicación que calcule la longitud y el área de una
		 * circunferencia. Para ello, el usuario debe introducir el radio, que puede
		 * contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 2πr,
		 * área=πr2)
		 */

		// Creamos el Scanner.
		Scanner input = new Scanner(System.in);
		// Declaramos la variable radio.
		double radio;
		// Pedimos al usuario que introduzca el radio.
		System.out.println("Introduce el radio de la circunferencia");
		// El usuario introduce el tamaño del radio.
		radio = input.nextDouble();
		// Imprimimos en consola la longitud y área de la circunferencia.
		System.out.println("La longitud de la circunferencia es de " + 2 * Math.PI * radio);
		System.out.println("El área de la circunferencia es de " + Math.PI * (radio * radio));
		// Cerramos el escáner.
		input.close();
	}
}
