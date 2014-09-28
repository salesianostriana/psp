package com.dam.psp.tema1.ejemplos.cuantomasprimo;

import java.util.Random;

public class GeneraPrimo implements Runnable {

	long resultado;

	public GeneraPrimo() {
		resultado = -1;
	}

	public void run() {
		// TODO Auto-generated method stub
		long ini = System.currentTimeMillis();
		Random r = new Random();
		resultado = Math.abs(r.nextLong());
		while (!Utils.esPrimo(resultado)) {
			resultado = Math.abs(r.nextLong());
		}
		long fin = System.currentTimeMillis();

		System.out.println("Tiempo utilizado en generar el número: "
				+ (fin - ini) / 1000.0);

	}

	public long getResultado() {
		return resultado;
	}

}
