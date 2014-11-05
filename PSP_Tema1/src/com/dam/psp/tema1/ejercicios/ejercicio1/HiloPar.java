package com.dam.psp.tema1.ejercicios.ejercicio1;

public class HiloPar implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100000000; i+=2) {
			System.out.println(i);
		}
	}

}
