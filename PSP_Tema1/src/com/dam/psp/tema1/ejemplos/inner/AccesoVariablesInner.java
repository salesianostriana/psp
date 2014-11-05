package com.dam.psp.tema1.ejemplos.inner;

public class AccesoVariablesInner {

	String saludo = "Hola!!!!";
	final String nombre = "Luismi";

	public void print() throws InterruptedException {
		final String despedida = "Adios!!!";

		new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				String saludo = "Hello men, ";
				System.out.println(saludo + " " + nombre);

				if (despedida != null) {
					System.out.println(despedida + " " + nombre);
				}
			}

		}).start();
		Thread.sleep(2000);
		System.out.println(saludo);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AccesoVariablesInner a = new AccesoVariablesInner();
		a.print();
	}

}
