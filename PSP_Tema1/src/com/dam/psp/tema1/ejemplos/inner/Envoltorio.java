package com.dam.psp.tema1.ejemplos.inner;

public class Envoltorio {

	private String s;

	public Envoltorio() {
		s = "Hello!!!";
	}

	public void sayHello() {

		/*
		 * class SaludadorRunnable implements Runnable {
		 * 
		 * public void run() { // TODO Auto-generated method stub
		 * System.out.println(s); }
		 * 
		 * }
		 * 
		 * new Thread(new SaludadorRunnable()).start();
		 */

		final int numero_saludos = 10;

		class Saludador {

			public Saludador() {

				for (int i = 0; i < numero_saludos; i++) {
					System.out.println(s);
				}

			}

		}

		new Saludador();
		
		
		new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				
			}
			
			
		}).start();

	}

}
