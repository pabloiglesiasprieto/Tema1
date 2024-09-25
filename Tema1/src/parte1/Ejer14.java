package parte1;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que solicite las notas del primer, segundo y tercer
		 * trimestre (notas enteras que se solicitarán al usuario). El programa debe
		 * mostrar la nota media del curso como se utiliza en el boletín de
		 * calificaciones (solo la parte entera) y como se usa en el expediente
		 * académico (con decimales).
		 */
		// Declararemos las variables
		double nota1;
		double nota2;
		double nota3;
		int notaMedia;
		double notaMediaDecimales;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos la primera nota.
		System.out.println("¿Primera nota?");
		// Leemos entrada de teclado.
		nota1 = input.nextInt();
		// Preguntamos segunda nota.
		System.out.println("¿Segunda nota?");
		// Leemos entrada de teclado.
		nota2 = input.nextInt();
		// Preguntamos tercera nota.
		System.out.println("¿Tercera nota?");
		// Leemos entrada de teclado.
		nota3 = input.nextInt();
		// Inicializamos las siguientes variables.
		notaMedia = (int) (nota1 + nota2 + nota3) / 3;
		notaMediaDecimales = (nota1 + nota2 + nota3) / 3;
		// Imprimimos los resultados.
		System.out.println("Tu nota con respecto al boletín es la siguiente: " + notaMedia);
		System.out.println("Tu nota en el expediente academico es la siguiente: " + notaMediaDecimales);
		// Cerramos el Scanner.
		input.close();
	}
}
