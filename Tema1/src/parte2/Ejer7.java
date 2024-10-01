package parte2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Una empresa que gestiona un parque acuático te solicita una aplicación que
		 * les ayude a calcular el importe que hay que cobrar en la taquilla por la
		 * compra de una serie de entradas (cuyo número será introducido por el
		 * usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de
		 * adultos, que cuestan 20€. En el caso de que el importe total sea igual o
		 * superior a 100€, se aplicará automáticamente un bono descuento del 5%.
		 */
		// Declaramos las variables.
		int entrada1;
		int entrada2;
		final double PRECIO_ENTRADA1 = 20;
		final double PRECIO_ENTRADA2 = 15.50;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos cuantas entradas de adulto quiere comprar.
		System.out.println("¿Cuántas entradas de adulto?");
		// Leemos entrada de teclado.
		entrada1 = sc.nextInt();
		// Preguntamos cuantas entradas infantiles quiere comprar.
		System.out.println("¿Cuantas entradas infantiles?");
		// Leemos lectura de teclado.
		entrada2 = sc.nextInt();
		// Calculamos el precio. si el condicional no se cumple
		double precioTotal = ((entrada1 * PRECIO_ENTRADA1) + (entrada2 * PRECIO_ENTRADA2));
		// Calculamos el descuento
		double descuento = (precioTotal * 0.05);
		// Creamos un condicional
		if (precioTotal > 100) {
			// Si la condición se cumple, se descontará el 5% del precio total.
			System.out.println("El precio es de: " + (precioTotal - descuento) + "€");
		} else {
			// Si la condición no se cumple, no se aplicará ningún descuento.
			System.out.println("El precio final es de: " + precioTotal + "€");
		}
		// Cerramos el Scanner.
		sc.close();
	}

}
