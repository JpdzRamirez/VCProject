package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;

public class Cliente {

	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamos;
	

	public void agregarPrestamo(Prestamo _prestamo){
		this.prestamos.add(_prestamo);
	}
	
	public void setPrestamos(Prestamo _prestamo) {
		this.prestamos.add(_prestamo);
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public Cliente(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		prestamos=new ArrayList<Prestamo>();
	}
	
	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
