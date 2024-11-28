package com.gsd.daw.prog;

public class Reala {
	
	private Perro[] reala;
	
	public Reala() {
		reala = new Perro [0];
	}
	
	
	
	public void aniadirPerro(Perro a) {
		if("Cocker".equalsIgnoreCase(a.getRaza()) || "Galgo".equalsIgnoreCase(a.getRaza())) {
			if(a.getEdad()>1 && a.getEdad()<7) {
				Perro [] aux = new Perro [reala.length+1];
				System.arraycopy(reala, 0, aux, 0, reala.length);
				aux[reala.length]=a;
				reala =aux;
			}
		}
		else
		System.out.println("No se ha añaidio");
	}
	
	public void mostrarPerros() {
		for(int i =0; i< reala.length;i++) {
			System.out.println(reala[i].toString());
		}
	}
	
	public Perro[] eliminarPerros(int n) {
		if(n>reala.length) {
		System.err.println("No puedo borrar tantos, porque no hay");
		return null;
		}
		Perro[] devolver = new Perro [n];
		for(int i = reala.length -1; i>= reala.length-n;i--) {
			devolver[i-n+1]=reala[i];
			reala[i]=null;
		}
		
		Perro [] aux = new Perro[reala.length-n];
		System.arraycopy(reala, 0, aux,0, reala.length-n);
		reala=aux;
		return devolver;
	}
	
}
	

