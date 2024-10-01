package parte2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
		 * competición donde cada participante escribe un algoritmo en un papel y lo
		 * lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso
		 * es que la longitud del lanzamiento se mide en metros (con tantos decimales
		 * como se desee), pero para el ranking solo se tiene en cuenta la longitud en
		 * centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m,
		 * que son 1234,56 cm solo se contabilizan 1234 cm. Realiza un programa que
		 * solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
		 * correspondiente en centímetros. Utiliza la conversión de tipos.
		 */
		// Declaramos las variables.
		double longitud;
		double longitudCentimetros;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos la longitud.
		System.out.println("¿Cuántos metros?");
		// Leemos entrada de teclado
		longitud = sc.nextDouble();
		// Calculamos la distancia en centimetros.
		longitudCentimetros = longitud * 100;
		// Imprimimos el resultado.
		System.out.println("La distancia es de : " + (int)longitudCentimetros + " centimetros");
		// Cerramos el Scanner.
		sc.close();
	}
}
