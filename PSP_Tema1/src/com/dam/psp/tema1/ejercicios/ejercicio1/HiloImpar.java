package com.dam.psp.tema1.ejercicios.ejercicio1;

public class HiloImpar implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10000000; i += 2) {
			System.out.println(i);
		}
	}

}
