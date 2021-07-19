package com.cmc.evaluacion.fase2.entidades;

import java.util.Date;

public class Prestamo {

	private String numero;
	private Date fecha;
	private double monto;
	private String tipo;
	private String cedulaCliente;
	
	public Prestamo(String numero, String cedulaCliente) {
		super();
		this.numero = numero;
		this.cedulaCliente = cedulaCliente;
	}
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCedulaCliente() {
		return cedulaCliente;
	}


	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	@Override
	public String toString() {
		return "Prestamo [numero=" + numero + ", fecha=" + fecha + ", monto=" + monto + ", tipo=" + tipo
				+ ", cedulaCliente=" + cedulaCliente + "]";
	}



	
}
