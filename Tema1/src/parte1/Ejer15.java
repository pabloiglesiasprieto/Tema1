package parte1;

import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa en el que declares una constante IVA de valor igual a 21.
		 * A continuación, pídele un precio al usuario (recuerda que los precios
		 * contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
		 */
		// Declaramos las variables
		float precio;
		// Declaramos la constante de IVA.
		final double IVA = 0.21;
		// Creamos un Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos por el precio.
		System.out.println("¿Cuanto vale el producto?");
		// Leemos
		precio = input.nextFloat();
		// Calculamos el añadido por el IVA.
		double precioIVA = IVA * precio;
		double precioTotal = precioIVA + precio;
		// Imprimimos el resultado.
		System.out.println("El precio de producto es de: " + precioTotal);
		// Cerramos el Scanner.
		input.close();
	}
}
