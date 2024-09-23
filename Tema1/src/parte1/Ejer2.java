package parte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
//Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.	
		// Declaramos la variable.
		int edad;
		// Añadimos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos la edad al usuario.
		System.out.println("¿Cual es tu edad?");
		// Inicializamos la variable.
		edad = input.nextInt();
		// Imprimimos el resultado en consola.
		System.out.println("Tu edad es " + edad);
		input.close();
	}
}
