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

public class Carrera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos un array con los ocho corredores
		String[] corredores = { "Hicham El Guerrouj", "Noah Ngeny",
				"Mohamed Farah", "Bernard Lagat", "Rashid Ramzi",
				"Ryan Gregson", "Fermín Cacho", "Teddy Flack" };

		// Instanciamos y lanzamos los ocho corredores
		for (int i = 0; i < corredores.length; i++) {
			new Thread(new Corredor(corredores[i])).start();
		}

	}

}
