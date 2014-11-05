package com.dam.psp.tema1.ejercicios.ejercicio4;

import java.util.List;


/*
 * Ejercicio 4. Mejor de la clase GeneraVector
 *
 * Mejorar la clase GeneraVector proporcionada en el repositorio (añadiendo otro método con firma 
 * similar, llamado generaConThread) para que dicha generación de valores también se realice usando 
 * varios hilos en paralelo.
 * 
 * Se utilizará un número fijo de hilos (usar para ello una constante), que en nuestro caso serán 3.
 * 
 * Testear este nuevo método a través de una clase que implemente el método main y reciba el número 
 * de elementos a generar a través de la línea de argumentos.
 *
 * @author Luis Miguel López Magaña
 *
 */

public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.err.println("Error en la sintaxis. java Ejercicio4 <num_elementos>");
		} else {
			int n_elementos;
			try {
				n_elementos = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				n_elementos = 100;
			}
			
			List<Integer> lista = GeneraVector.generaVectorConThread(n_elementos);
			
			for(Integer i : lista) {
				System.out.println(i.toString());
			}
			
			
		}
		
		
		
	}

}
