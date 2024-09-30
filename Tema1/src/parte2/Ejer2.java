package parte2;

import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		/*
		 * Escribe un programa que tome como entrada un número entero e indique qué
		 * cantidad hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que
		 * sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1.
		 * Usa el operador módulo (%) para calcularlo.
		 */
		int numero;
		int suma;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el número");
		numero = input.nextInt();
		suma = (7 - (numero % 7)) % 7;
		System.out.println("Tienes que sumarle a " + numero + ", " + suma + " para que sea multiplo de 7");
		input.close();
	}
}
