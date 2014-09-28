package com.dam.psp.tema1.ejemplos.cuantomasprimo;

public class Utils {

	public static boolean esPrimo(long n) {

		long tope = (long) Math.ceil(Math.sqrt((double) n));
		boolean divisorEncontrado = false;
		long contador = 2;

		while (contador <= tope && !divisorEncontrado) {
			if (n % contador == 0) {
				divisorEncontrado = true;
			}
			contador++;
		}
		return !divisorEncontrado;

	}

}
