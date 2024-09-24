package parte1;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Declaramos la variable numero.
		int numero;
		// Creamos Scanner
		Scanner input = new Scanner(System.in);
		// Pidamos al usuario que introduzca un numero.
		System.out.println("Introduce un numero");
		/* Establecemos que el valor de la variable sea la siguiente entrada del
		teclado.*/
		numero = input.nextInt();
		// Imprimimos en pantalla el resultado.
		System.out.println("El número que has elegido es " + numero);
		// Cerramos el Scanner.
		input.close();
	}
}
