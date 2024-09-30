package parte2;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Dado el siguiente polinomio de segundo grado: y=ax2+bx+c Crea un programa que
		 * pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
		 * correspondiente de y.
		 */
		// Declaramos las variables.
		int a;
		int b;
		int c;
		int x;
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos el valor de ax2.
		System.out.println("¿Cuánto valo a?");
		// Leemos entrada de teclado.
		a = input.nextInt();
		// Preguntamos el valor de b.
		System.out.println("¿Cuánto vale b?");
		// Leemos entrada de teclado.
		b = input.nextInt();
		// Preguntamos el valor de c.
		System.out.println("¿Cuánto vale c?");
		// Leemos entrada de teclado.
		c = input.nextInt();
		// Preguntamos el valor de x
		System.out.println("¿Cuánto vale x?");
		x = input.nextInt();
		// Calculamos cuanto vale y
		int y = (a * (x * x)) + (b * x) + (c);
		// Imprimimos el resultado.
		System.out.println("El resultado de la ecuación es de: " + y);
		// Cerramos el Scanner.
		input.close();
	}
}