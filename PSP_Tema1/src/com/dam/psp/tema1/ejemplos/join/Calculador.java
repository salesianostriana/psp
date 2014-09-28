package com.dam.psp.tema1.ejemplos.join;

public class Calculador implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		long acumulador = 0;
		
		for(long i = 0; i < Integer.MAX_VALUE; i++) {
			acumulador += i;
			
			if (acumulador % 100000 == 0) {
				System.out.println("Valor acumulador hasta ahora: " + acumulador);
			}
		}
	}

	
	
	
}
