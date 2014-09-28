package com.dam.psp.tema1.ejemplos.cuantomasprimo;

public class GeneraNRSA {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Primer número
		GeneraPrimo g = new GeneraPrimo();
		Thread t = new Thread(g);
		t.start();

		//Segundo número
		GeneraPrimo g2 = new GeneraPrimo();
		Thread t2 = new Thread(g2);
		t2.start();
		
		t.join(); t2.join();

		long res = g.getResultado()* g2.getResultado();
		System.out.println("El número resultado es: " + res);

	}

}
