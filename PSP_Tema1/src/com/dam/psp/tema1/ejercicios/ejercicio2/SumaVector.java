package com.dam.psp.tema1.ejercicios.ejercicio2;

import java.util.List;

public class SumaVector implements Runnable{
	
	List<Integer> lista;
	int acumulador=0;
	
	public SumaVector(List<Integer> lista){
		this.lista=lista;
	}
	
	public void run(){	

		for(int i=0; i<lista.size(); i++){
			acumulador+=lista.get(i);
		}
	}

	public int getAcumulador(){
		return acumulador;
	}
}
