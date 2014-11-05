package com.dam.psp.tema1.ejercicios.ejercicio2;

import java.util.List;

public class Main {

	
	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> lista = GeneraVector.generaVector(120000);
		
		List<Integer> l1 = lista.subList(0, lista.size()/2);
		List<Integer> l2 = lista.subList(lista.size()/2, lista.size());
		
		SumaVector s1 = new SumaVector(l1);
		SumaVector s2 = new SumaVector(l2);
		
		Thread hilo1 = new Thread(s1);
		Thread hilo2 = new Thread(s2);
		
		hilo1.start();
		hilo2.start();
		
		hilo1.join();
		hilo2.join();
		
		System.out.println("El resultado de la suma es: "+ (s1.getAcumulador()+s2.getAcumulador()));
	}

}
