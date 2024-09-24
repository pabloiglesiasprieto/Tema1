package parte1;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
		 * pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué
		 * mayor eres!”.
		 */
		// Declaramos la variable.
		String nombre;
		int edad;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos el nombre del usuario.
		System.out.println("¿Cuál es tu nombre?");
		// Leemos entrada de teclado.
		nombre = input.nextLine();
		// Preguntamos la edad del usuario.
		System.out.println("¿Cuál es tu edad?");
		// Leemos entrada de teclado.
		edad = input.nextInt();
		// Imprimimos el resultado.
		System.out.println("Hola " + nombre + "," + " tienes " + edad + " años, ¡qué mayor eres!");
		// Cerramos el Scanner.
		input.close();
	}
}
