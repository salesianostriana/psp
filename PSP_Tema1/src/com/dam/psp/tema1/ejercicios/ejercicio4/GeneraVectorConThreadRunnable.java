package com.dam.psp.tema1.ejercicios.ejercicio4;

import java.util.List;

public class GeneraVectorConThreadRunnable implements Runnable {

	List<Integer> resultado;
	int n_elementos = 0;
	
	public GeneraVectorConThreadRunnable(int n) {
		n_elementos = n;
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		resultado = GeneraVector.generaVector(n_elementos);
	}


	public List<Integer> getResultado() {
		return resultado;
	}
	
	
	

}
