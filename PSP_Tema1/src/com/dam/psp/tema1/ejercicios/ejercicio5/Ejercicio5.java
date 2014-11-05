package com.dam.psp.tema1.ejercicios.ejercicio5;

import java.io.IOException;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal; 


public class Ejercicio5 {

		
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Terminal terminal = TerminalFacade.createSwingTerminal(80,24);
		
		terminal.enterPrivateMode();
		
		Thread t = new Thread(new Pelota(terminal));
		Thread t2 = new Thread(new Pelota(terminal));
		t.start();
		t2.start();
		

	}

}
