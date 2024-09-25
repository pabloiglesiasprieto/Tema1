package parte1;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		/*
		 * Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
		 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
		 * de la conversión.(1€ = 166 ptas).
		 */
		double euros;
		double pesetas;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos
		System.out.println("¿Cuantas ptas quieres pasar a euros?");
		// Leemos entrada de teclado
		pesetas = input.nextDouble();
		euros = pesetas / 166;
		// Cerramos Scanner.
		input.close();
		// Imprimimos el resultado.
		System.out.println("Tienes " + euros + " euros");
	}

}
