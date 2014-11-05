package com.dam.psp.tema1.ejercicios.ejercicio5;

import java.io.IOException;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal; 


public class Ejercicio5Sync {

		
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Terminal terminal = TerminalFacade.createSwingTerminal(80,24);
		
		terminal.enterPrivateMode();
		
		
		new Thread(new PelotaSync(terminal)).start();
		new Thread(new PelotaSync(terminal)).start();
		new Thread(new PelotaSync(terminal)).start();


		

	}

}
