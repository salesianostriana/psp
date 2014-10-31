package com.dam.psp.tema1.ejemplos.futuretask;

import java.math.BigInteger;

public class Utils {

	public static boolean computeIsPrime(BigInteger n) {		
		boolean tieneDivisor = false;
		BigInteger divisor = BigInteger.ONE.add(BigInteger.ONE);
		BigInteger tope = n.divide(divisor); 
		while (!tieneDivisor && (divisor.compareTo(tope) < 0)) {
			if (n.mod(divisor).equals(BigInteger.ZERO)) {
				tieneDivisor = true;
			} else {
				divisor = divisor.add(BigInteger.ONE);
			}
		}
		return !tieneDivisor;
		
	}

}
