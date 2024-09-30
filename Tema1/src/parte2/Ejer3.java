package parte2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio anterior para que, indicando dos números, por ejemplo,
		 * num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo
		 * de num2.
		 */
		// Declaramos las variables
		int num1;
		int num2;
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos por el primer número.
		System.out.println("¿Cual es el primer número?");
		// Leemos entrada de teclado.
		num1 = input.nextInt();
		// Preguntamos el segundo número.
		System.out.println("¿Cual es el segundo número?");
		num2 = input.nextInt();
		// Indicaremos cuanto hay que sumarle a num1 para que sea multiplo de num2.
		int suma = (num2 - (num1 % num2)) % num2;
		System.out.println("Hay que sumarle a " + num1 + ", " + suma + " para que sea multiplo del segundo número");
		input.close();
	}
}
