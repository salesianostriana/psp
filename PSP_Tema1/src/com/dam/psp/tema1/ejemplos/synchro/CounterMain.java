package com.dam.psp.tema1.ejemplos.synchro;

public class CounterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterSynchronized c = new CounterSynchronized();
		
		new Thread(new Incrementador(c)).start();
		
		new Thread(new Decrementador(c)).start();
		
		
	}

}
