package com.dam.psp.tema1.ejercicios.ejercicio7;

public class BuscarMaximoRunnable implements Runnable{

	
	private byte[][] matriz;
	private byte maximo;
	private int iniF, iniC, finF, finC;
	
	public BuscarMaximoRunnable(byte[][] _matriz, int inicio_filas, int inicio_columnas, int fin_filas, int fin_columnas) {
		matriz = _matriz;
		iniF = inicio_filas;
		iniC = inicio_columnas;
		finF = fin_filas;
		finC = fin_columnas;
		maximo = matriz[iniF][iniC];
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		for(int filas = iniF; filas <= finF; filas++) {
			for(int col = iniC; col <= finC; col++) {
				if (matriz[filas][col] > maximo) {
					maximo = matriz[filas][col]; 
				}
			}
		}
	}
	
	public int getMaximo() {
		return maximo+128;
	}

}
