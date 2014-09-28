package com.dam.psp.tema1.ejemplos;

public class Ejemplo02_ExtendiendoThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloThread hello = new HelloThread();
		hello.start();
		
		new HelloThread().start();
		
	}

}
