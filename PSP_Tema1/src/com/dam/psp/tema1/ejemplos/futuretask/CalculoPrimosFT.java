package com.dam.psp.tema1.ejemplos.futuretask;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CalculoPrimosFT {

	
	public static boolean isPrime(final BigInteger number) {

		class CompruebaPrimos implements Callable<Boolean> {

			BigInteger number;

			public CompruebaPrimos(BigInteger n) {
				number = n;
			}

			public Boolean call() throws Exception {
				return new Boolean(Utils.computeIsPrime(number));
				// return new Boolean(true);
			}

		}

		
		/*
		 * FutureTask<Boolean> f = new FutureTask<Boolean>( new
		 * Callable<Boolean>() { public Boolean call() throws Exception { return
		 * new Boolean(Utils.computeIsPrime(number)); //return new
		 * Boolean(true); } });
		 */

		FutureTask<Boolean> f = new FutureTask<Boolean>(new CompruebaPrimos(
				number));

		new Thread(f).start();
		boolean valor = false;

		try {
			while (!f.isDone()) {
			}
			valor = f.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return valor;
	}

	public static void main(String[] args) {

		BigInteger n = BigInteger.probablePrime(128, new Random());
		if (CalculoPrimosFT.isPrime(n))
			System.out.println("El numero " + n.toString() + "es primo");
		else
			System.out.println("El numero " + n.toString() + "	no es primo");
	}
}
