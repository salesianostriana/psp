package com.dam.psp.tema1.ejemplos.nested;

public class Outer {

	private String s;
	
	public Outer() {
		s = "Hello world!";
	}
	
	private class Nested {
		
		private String getMessage() {
			return s;
		}
		
	}
	
	
	

}
