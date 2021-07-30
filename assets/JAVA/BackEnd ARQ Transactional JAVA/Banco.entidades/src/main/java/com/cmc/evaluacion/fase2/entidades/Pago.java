package com.cmc.evaluacion.fase2.entidades;

import java.util.Date;

public class Pago {

	
	private String numeroPrestamo;
	private Date fechaPago;
	private double monto;
	
	
	
	public String getNumeroPrestamo() {
		return numeroPrestamo;
	}



	public void setNumeroPrestamo(String numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}



	public Date getFechaPago() {
		return fechaPago;
	}



	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}



	public double getMonto() {
		return monto;
	}



	public void setMonto(double monto) {
		this.monto = monto;
	}



	public Pago(String numeroPrestamo) {
		super();
		this.numeroPrestamo = numeroPrestamo;
	}
	
	
}
