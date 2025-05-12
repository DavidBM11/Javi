package com.gsd.daw.prog;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {
	/**
	 * Punto de entrada de la aplicación
	 *
	 * @param args
	 *            no se espera ningún parámetro.
	 */
	public static void main(String[] args) {
		
		ColaStrings c = new ColaStrings();
		
		//c.enqueue("1");
		//c.enqueue("2");
		//c.enqueue("3");
		//c.enqueue("4");
		
		//System.out.println(c.dequeue()); 
		//System.out.println(c.size()); 
		//c.print();
		System.out.println(c.isEmpty());
	}
}
