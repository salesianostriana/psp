package com.dam.psp.tema1.ejercicios.ejercicio5;

import java.util.Random;

import com.googlecode.lanterna.terminal.Terminal;


public class Pelota implements Runnable {

		Terminal terminal;
		
		public Pelota(Terminal t) {
			this.terminal = t;
		}
		
		
		public void run() {
			// TODO Auto-generated method stub
		    int x = new Random().nextInt(80);
		    int y = new Random().nextInt(24);
		    int incX = 1;
		    int incY = 1;
		    
	    	terminal.moveCursor(x, y);
	    	terminal.putCharacter('*');
		    
		    while(true) {
		    	terminal.moveCursor(x, y);
		    	terminal.putCharacter(' ');
		    	//terminal.clearScreen();
		    	
		    	if ((x+incX > 78) || (x+incX < 0))
		    		incX = -incX;
		    	if ((y+incY > 23) || (y+incY < 0))
		    		incY = -incY;
		    	try {
			    	Thread.sleep(25);	
		    	} catch (InterruptedException e) {
		    		e.printStackTrace();
		    	}
		    	x+=incX;
		    	y+=incY;
		    	System.out.println("("+x+","+y+")");
		    	terminal.moveCursor(x, y);
		    	terminal.putCharacter('*');
		    }
			
		}
		
	}


