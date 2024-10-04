package parte2;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Solicita al usuario tres distancias: La primera, medida en milímetros. La
		 * segunda, medida en centímetros. La última, medida en metros. Diseña un
		 * programa que muestre la suma de las tres longitudes introducidas (medida en
		 * centímetros).
		 */
		// Declaramos las variables.
		double milimetros;
		double centimetros;
		double metros;
		double distanciaTotal;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos los milimetros.
		System.out.println("¿Cuántos milimetros?");
		// Leemos lectura de teclado.
		milimetros = sc.nextDouble();
		// Pregutamos los centimetros.
		System.out.println("¿Cuántos centimetros?");
		// Leemos lectura de teclado.
		centimetros = sc.nextDouble();
		// Preguntamos los metros.
		System.out.println("¿Cuántos metros?");
		// Leemos lectura de teclado.
		metros = sc.nextDouble();
		// Calculamos la distancia total.
		distanciaTotal = (metros * 100) + centimetros + (milimetros / 10);
		// Imprimimos el resultado.
		System.out.println("La distancia total es de: " + distanciaTotal + " centimetros.");
		// Cerramos el Scanner.
		sc.close();
	}
}
