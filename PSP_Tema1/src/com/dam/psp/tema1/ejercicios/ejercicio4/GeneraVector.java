package com.dam.psp.tema1.ejercicios.ejercicio4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GeneraVector {

	public static List<Integer> generaVector(int tamanyo) {

		List<Integer> lista = new LinkedList<Integer>();

		Random r = new Random(System.currentTimeMillis());

		for (int i = 0; i < tamanyo; i++) {
			lista.add(Integer.valueOf(r.nextInt()));

		}

		return lista;
	}

	public static List<Integer> generaVectorConThread(int tamanyo) {
		List<Integer> lista = new LinkedList<Integer>();

		//Calculamos el tamaño de cada parte
		int tamanio_parte = tamanyo / 3;
		
		//El tamaño de la ultima parte es igual al resto de los demás, mas el resto
		int tamanio_parte_final = tamanio_parte + (tamanyo % 3);

		
		//Instanciamos las 3 tareas de generación del vector
		GeneraVectorConThreadRunnable g1 = new GeneraVectorConThreadRunnable(
				tamanio_parte);
		GeneraVectorConThreadRunnable g2 = new GeneraVectorConThreadRunnable(
				tamanio_parte);
		GeneraVectorConThreadRunnable g3 = new GeneraVectorConThreadRunnable(
				tamanio_parte_final);

		//Instanciamos los hilos que ejecutarán las tareas
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		Thread t3 = new Thread(g3);
		
		//Lanzamos los hilos
		t1.start(); t2.start(); t3.start();
		
		//Le decimos al hilo principal que espere a todos estos hilos.
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
		//Montamos una gran lista a partir de la lista creada anteriormente.
		lista.addAll(g1.getResultado());
		lista.addAll(g2.getResultado());
		lista.addAll(g3.getResultado());

		return lista;
	}

}
