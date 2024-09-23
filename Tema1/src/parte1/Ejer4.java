package parte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
	/*Crear una aplicación que calcule la media aritmética de dos notas enteras. 
	 Hay que tener en cuenta que la nota media puede tener decimales.*/
		// Creamos un Scanner
		Scanner input = new Scanner(System.in);
		// Declaramos la variable nota1.
		double nota1;
		// Declaramos la variable nota2.
		double nota2;
		// Pedimos al usuario que introduzca su primera nota.
		System.out.println("Introduce tu primera nota");
		// Leemos la entrada del teclado.
		nota1 = input.nextDouble();
		// Pedimos la segunda nota.
		System.out.println("Introduce tu segunda nota");
		// Leemos la entrada del teclado.
		nota2 = input.nextDouble();
		// Imprimimos el resultado.
		System.out.println("Tu media es de " + (nota1 + nota2)/2);
		// Cerramos el Scanner.
		input.close();
		
		
		
		
		
		
		
		
		
		

	}
}
