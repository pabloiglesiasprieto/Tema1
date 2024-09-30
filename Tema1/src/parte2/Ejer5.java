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
		double horas = (tiempoSegundos / 3600);
		if (horas<0) {
			double minutos = horas * 60;
		} else {
			double minutos = 0; 	
		double minutosCasteados = (int) minutos;
		double segundos = (minutos - minutosCasteados);
		System.out.println(
				"El tiempo es de :" + (int) horas + " horas, " + (int) minutosCasteados + " minutos," + " y " + (int) (segundos*100) + " segundos.");
		input.close();
	}
}
}
