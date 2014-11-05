package com.dam.psp.tema1.ejercicios.ejercicio1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new HiloPar()).start();
		new Thread(new HiloImpar()).start();
	}

}
