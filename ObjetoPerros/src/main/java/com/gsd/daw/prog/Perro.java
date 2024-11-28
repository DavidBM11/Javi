package com.gsd.daw.prog;

public class Perro {


	private String raza;
	private String nombre;
	private int edad;
	private String color;
	
	
	public Perro(String raza, String nombre, int edad, String color) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	public Perro() {
		super();
		this.raza = "raza";
		this.nombre = "nombre";
		this.edad = 1;
		this.color = "color";
	}
	
	
	
	public String getRaza() {
		return raza;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	
	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}

	
	
	
	

	
}
