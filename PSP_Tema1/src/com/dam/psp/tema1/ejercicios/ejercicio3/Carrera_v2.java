package com.dam.psp.tema1.ejercicios.ejercicio3;

/*
 * Ejercicio 3. Carrera (versiones 1 y 2)
 *
 * En este ejercicio vamos a realizar un experimento: si lanzamos 8 hilos que realizan 
 * la misma tarea, y el planificador le asigna el mismo tiempo de ejecución a cada uno, 
 * debería finalizar primero el primer hilo que se lanzó, y así sucesivamente, ¿no?. 
 * Lo comprobaremos de la siguiente forma: supongamos que tendremos una carrera del gran premio de 
 * atletismo (la de 1500 metros). 
 * 
 * Tendremos que crear la clase corredor, que tendrá que implementar un bucle que 
 * cuente desde 0 a 1500 (una iteración por metro recorrido). 
 * Cuando finalice el bucle, deberá mostrar un mensaje por pantalla indicando el 
 * nombre del corredor y que ha finalizado (El corredor Fermín Cacho ha finalizado la prueba).
 * 
 * Como versión 2 de este ejercicio, tendremos que generalizarlo, para poder ejecutarlo al menos 
 * 50 veces seguidas, para comprobar si el orden de finalización es siempre el mismo.
 * 
 * NOTA: Si los corredores realizan la carrera muy rápido, se puede introducir, dentro del bucle, 
 * un pequeño lapso de tiempo (5 o 10 ms) de sueño, mediante el uso del méetodo sleep.
 *
 * @author Luis Miguel López Magaña
 *
 */

public class Carrera_v2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos un array con los ocho corredores
		String[] corredores = { "Hicham El Guerrouj", "Noah Ngeny",
				"Mohamed Farah", "Bernard Lagat", "Rashid Ramzi",
				"Ryan Gregson", "Fermín Cacho", "Teddy Flack" };

		// Instanciamos y lanzamos los ocho corredores, pero 50 veces

		for (int n = 0; n < 50; n++) {
			System.out.println("Iteración num. " + n);
			System.out.println("--------------------");
		
			try {
				
				//En este caso, no usamos un bucle, ya que para diferenciar
				//entre una iteración y la siguiente, tenemos que esperar
				//a todos los hilos y, con el formato anterior, no funcionaría
				
				Thread t1 = new Thread(new Corredor(corredores[0]));
				t1.start();
				Thread t2 = new Thread(new Corredor(corredores[1]));
				t2.start();
				Thread t3 = new Thread(new Corredor(corredores[2]));
				t3.start();
				Thread t4 = new Thread(new Corredor(corredores[3]));
				t4.start();
				Thread t5 = new Thread(new Corredor(corredores[4]));
				t5.start();
				Thread t6 = new Thread(new Corredor(corredores[5]));
				t6.start();
				Thread t7 = new Thread(new Corredor(corredores[6]));
				t7.start();
				Thread t8 = new Thread(new Corredor(corredores[7]));
				t8.start();
				
				t1.join();
				t2.join();
				t3.join();
				t4.join();
				t5.join();
				t6.join();
				t7.join();
				t8.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// }
			System.out.println("---------------------");
		}

	}

}
