package parte1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
	//Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. Debe calcular su edad.
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Definimos la variable que declarará el año actual.
		int añoActual;
		// Definimos la variable que declarará el año de nacimiento.
		int añoNacimiento;
		// Le preguntamos al usuario el año actual.
		System.out.println("Introduce el año actual");
		// Le pedimos al usuario que especifique el año actual.
		añoActual = input.nextInt();
		// Preguntamos el año de nacimiento.
		System.out.println("Introduce el año de tu nacimiento");
		// El usuario escribirá el año de nacimiento.
		añoNacimiento = input.nextInt();
		// Imprimimos el resultado.
		System.out.println("Tu edad es de " + (añoActual - añoNacimiento));
		// Cerramos el Scanner.
		input.close();
	}
}
