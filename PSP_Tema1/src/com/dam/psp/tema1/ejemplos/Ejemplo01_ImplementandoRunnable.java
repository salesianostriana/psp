package com.dam.psp.tema1.ejemplos;

public class Ejemplo01_ImplementandoRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciamos la clase que implementa Runnable
		//HelloRunnable h = new HelloRunnable();
		//Instanciamos un nuevo hilo, pasándole al constructor
		//la instancia de HelloRunnable
		//Thread t = new Thread(h);
		//Pasamos el hilo a estado "ejecutable"
		//t.start();
		
		
		//Thread t = new Thread(new HelloRunnable());
		//t.start();
		
		new Thread(new HelloRunnable()).start();
		
	}

}
