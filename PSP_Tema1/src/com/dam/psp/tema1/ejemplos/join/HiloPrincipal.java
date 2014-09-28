package com.dam.psp.tema1.ejemplos.join;

public class HiloPrincipal {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t = new Thread(new Calculador());
		t.start();
		
		
		System.out.println("Este mensaje se imprime antes de empezar la espera al hilo");
		//t.join();
		System.out.println("FIN DEL PROGRAMA");
		
		
		
		
	}

}
