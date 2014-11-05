package com.dam.psp.tema1.ejercicios.ejercicio2;

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

}
