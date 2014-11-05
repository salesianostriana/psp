package com.dam.psp.tema1.ejercicios.ejercicio7;

public class MaximoMatriz {

	public static void main(String args[]) {

		if (args.length != 2) {
			System.err
					.println("Error de sintaxis. java MaximoMatriz <n_filas> <n_columnas>");
			return;

		}

		// Obtener la matriz.
		int nfilas = Integer.parseInt(args[0]);
		int ncolumnas = Integer.parseInt(args[1]);

		byte[][] matriz = RandomIntMatrix.randomByteMatrix(nfilas, ncolumnas);

		// Creamos las 4 tareas y ""dividimos"" la matriz

		BuscarMaximoRunnable m1 = new BuscarMaximoRunnable(matriz, 0, 0,
				(nfilas / 2) - 1, (ncolumnas / 2) - 1);

		BuscarMaximoRunnable m2 = new BuscarMaximoRunnable(matriz, 0,
				(ncolumnas / 2), (nfilas / 2) - 1, (ncolumnas - 1));

		BuscarMaximoRunnable m3 = new BuscarMaximoRunnable(matriz,
				(nfilas / 2), 0, (nfilas - 1), (ncolumnas / 2) - 1);

		BuscarMaximoRunnable m4 = new BuscarMaximoRunnable(matriz,
				(nfilas / 2), (ncolumnas / 2), nfilas - 1, ncolumnas - 1);

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		Thread t4 = new Thread(m4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			System.err.println("Error en la ejecucion de algún hilo");
			e.printStackTrace();
		}

		System.out.printf(
				"El valor máximo es %d",
				Math.max(
						m1.getMaximo(),
						Math.max(m2.getMaximo(),
								Math.max(m3.getMaximo(), m4.getMaximo()))));

	}
}
