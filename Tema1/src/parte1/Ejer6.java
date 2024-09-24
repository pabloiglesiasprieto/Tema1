package parte1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que le pida dos números al usuario. A continuación, debe
		 * mostrar la suma, la resta, la multiplicación y la división de ambos números.
		 * Debe mostrarse el resultado de cada operación en una línea distinta.
		 */
		// Declaramos las variables.
		int num1;
		int num2;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos al usuario el primer número.
		System.out.println("Introduce el primer número");
		// El usuario introduce el primer número.
		num1 = input.nextInt();
		// Preguntamos al usuario el segundo número.
		System.out.println("Introduce el segundo número");
		// El usuario introduce el segundo número.
		num2 = input.nextInt();
		// Imprimimos el resultado.
		System.out.println("El resultado de la suma es de " + (num1 + num2));
		System.out.println("El resultado de la resta es de " + (num1 - num2));
		System.out.println("El resultado de la multiplicación es de " + num1 * num2);
		System.out.println("El resultado de la división es de " + num1 / num2);
		// Cerramos el Scanner.
		input.close();
	}
}
