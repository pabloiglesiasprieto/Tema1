package parte1;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
		 * aspectos que influirán en esta decisión: solo podremos salir a la calle si no
		 * está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
		 * que, indistintamente de lo anterior, podremos salir a la calle: el hecho de
		 * tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si
		 * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
		 * algoritmo debe mostrar mediante un booleano (true o false) si es posible que
		 * se le otorgue permiso para salir a la calle.
		 */
		// Declaramos las variables.
		// La variable a servirá para saber si está lloviendo.
		boolean rain;
		// La variable b servirá para saber si hemos terminado las tareas.
		boolean work;
		// La variable c servirá para saber si tenemos que ir a la biblioteca.
		boolean library;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos si está lloviendo
		System.out.println("¿Está lloviendo?(True or False)");
		// Leemos la entrada del teclado.
		rain = input.nextBoolean();
		// Preguntamos si terminó la tarea.
		System.out.println("¿Terminaste la tarea?(True or false)");
		// Leemos entrada de teclado.
		work = input.nextBoolean();
		// Preguntamos si tiene que ir a la biblioteca.
		System.out.println("¿Tienes que ir a la biblioteca?(True or false)");
		// Leemos entrada de teclado.
		library = input.nextBoolean();
		// Imprimimos resultado.
		System.out.println((!rain && work || library) ? "Puedes salir" : "No puedes salir");
		// Cerramos Scanner.
		input.close();

	}
}
