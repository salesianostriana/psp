package com.dam.psp.tema1.ejemplos.synchro;

import java.util.Random;

public class Decrementador implements Runnable {

	CounterSynchronized c;
	
	public Decrementador(CounterSynchronized _c) {
		c = _c;
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10000; i++) {
			c.decrement();
			System.out.println(c.value());
		}

	}

}
