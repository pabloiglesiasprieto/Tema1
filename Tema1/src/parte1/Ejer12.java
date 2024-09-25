package parte1;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		/*
		 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
		 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
		 * solicite las ventas (en kilos, tanto de las peras como de las manzanas). La
		 * aplicación mostrará el importe total sabiendo que el precio del kilo de
		 * manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		 */
		// Declaramos las variables.
		int peras;
		int manzanas;
		double perasPrecio = 1.95;
		double manzanasPrecio = 2.35;
		// Creamos Scanner
		Scanner input = new Scanner(System.in);
		// Preguntamos cantidad de peras.
		System.out.println("¿Cuántos kilos de peras has vendido?");
		// Leemos entrada de teclado.
		peras = input.nextInt();
		// Preguntamos cantidad de manzanas
		System.out.println("¿Cuántos kilos de manzana has vendido?");
		manzanas = input.nextInt();
		// Imprimimos el resultado
		System.out.println("Has obtenido " + (peras * perasPrecio) + "€ de las peras");
		System.out.println("Has obtenido " + (manzanas * manzanasPrecio) + "€ de las manzanas");
		// Cerramos el Scanner.
		input.close();
	}
}
