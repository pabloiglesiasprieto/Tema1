package parte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		 * segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en
		 * el número de segundos introducidos por el usuario.
		 */
		// Declaramos las variables.
		double tiempoSegundos;
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos los segundos.
		System.out.println("¿Cuántos segundos quieres convertir?");
		// Leemos entrada de teclado.
		tiempoSegundos = input.nextInt();
		// Calculamos las horas,
		double horas = tiempoSegundos / 3600;
		// Calculamos los minutos.
		double minutos = tiempoSegundos % 3600 / 60;
		// Calculamos los segundos
		double segundos = minutos % 60;
		// Imprimimos el resultado
		System.out.println((int) horas + " horas, " + (int) minutos + " minutos y " + (int) segundos + " segundos");
		// Cerramos el Scanner.
		input.close();
	}
}
