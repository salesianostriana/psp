package com.dam.psp.tema1.ejercicios.ejercicio3;

import java.util.Random;

public class Corredor implements Runnable {

	private String nombre;
	
	
	public Corredor(String _nombre) {
		nombre = _nombre;
	}
	
	
	public void run() {
		// TODO Auto-generated method stub

		Random r = new Random();
		for (int i = 0; i < 1500; i++) {
			try {
				Thread.sleep(r.nextInt(3));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("El corredor " + nombre + " ha terminado");
		
		
	}

}
