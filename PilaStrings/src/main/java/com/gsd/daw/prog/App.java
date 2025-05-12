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
		
		PilaStrings p= new PilaStrings();
		
		p.push("1");
		p.push("2");
		p.push("3");
		p.push("4");
		p.push("5");
		
		
		p.pop();
		//p.print();
		//p.peek();
		//p.size();
		System.out.println(p.isEmpty()); 
	}
}
