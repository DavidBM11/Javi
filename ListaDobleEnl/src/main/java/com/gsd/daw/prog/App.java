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
		
		ListaDobleEnl l = new ListaDobleEnl();
		
		l.add("1");
		l.add("2");
		
		l.add("4");
		
		l.add("3", 2);
		
		System.out.println(l.get(2));
		
		l.remove(2);
		
		System.out.println(l.get(2));
		
		System.out.println(l.search("1"));
		
		System.out.println(l.size());
		l.print();
		
	}
}
