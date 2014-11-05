package com.dam.psp.tema1.ejercicios.ejercicio6;

import java.util.Random;

public class EquipoRelevos implements Runnable {

	String calle;
	String[] corredores_calle;
	int n_corredor;

	
	
	public EquipoRelevos(String[] _corredores_calle, String _calle) {
		calle = _calle;
		corredores_calle = _corredores_calle;
		n_corredor = 1;
	}

	public EquipoRelevos(String[] _corredores_calle, String _calle,
			int _n_corredor) {
		calle = _calle;
		corredores_calle = _corredores_calle;
		n_corredor = _n_corredor;
	}

	
	
	public void run() {
		// TODO Auto-generated method stub
		if (n_corredor <= corredores_calle.length) {
			System.out.println(corredores_calle[n_corredor - 1]
					+ " comienza su relevo en la calle " + calle);
			Random r = new Random(System.currentTimeMillis());
			for (int i = 0; i < 400; i++) {
				try {
					Thread.sleep(r.nextInt(10));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("--- " + corredores_calle[n_corredor - 1]
					+ " finaliza su relevo en la calle " + calle);
			new Thread(new EquipoRelevos(corredores_calle,calle,n_corredor+1)).start();
		}

	}

}
