package com.dam.psp.tema1.ejemplos.synchro;

public class CounterSynchronized  {

	private int c = 0;
	
	public synchronized void increment() {
		c++;
	}
	
	public synchronized void decrement() {
		c--;
	}
	
	public synchronized int value() {
		return c;
	}
	
	
}
