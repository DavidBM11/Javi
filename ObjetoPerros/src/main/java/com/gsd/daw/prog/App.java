package com.gsd.daw.prog;

import java.util.Arrays;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {

	public static void main(String[] args) {
		 Perro p1 = new Perro ("Cocker","Firulais",4,"Verde");
		 
		 Perro p2 = new Perro ("Galgo","Laika",4,"Marron");
		 
		 Perro p3 = new Perro ("Dalmata","Goofy",4,"Blanco-negro");
		 
		 Perro p4 = new Perro ("Cocker","Pluto",4,"Negro");
		
		 
		 Reala r1 = new Reala();
		 r1.aniadirPerro(p4);
		 r1.aniadirPerro(p3);
		 r1.aniadirPerro(p2);
		 r1.aniadirPerro(p1);
		 r1.mostrarPerros();
		 
		 Perro[] calle = r1.eliminarPerros(2);
		 System.out.println("Estos perros estan en la calle");
		 System.out.println(Arrays.toString(calle));
		 
	}
	

}
