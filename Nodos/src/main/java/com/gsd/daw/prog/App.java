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
		
		ListaEnteros ln = new ListaEnteros();
		ListaOrdenados lo = new ListaOrdenados();
		
		
		lo.add(1);
		lo.add(2);
		lo.add(3);
		lo.add(4);
		lo.add(5);
		lo.add(6);
		
		
		//System.out.println(lo.size()); 
		lo.print();
		
		//System.out.println(lo.get(2)); 
		
		//System.out.println(ln.get(1));
		//ln.remove(0);
		//System.out.println(ln.size()); 
		//ln.print();
		//ln.sort();
		//ln.print();
		//System.out.println(ln.esVacia()); 
		
	
	}
}
