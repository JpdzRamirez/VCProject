package com.cmc.evaluacion.fase2.test;

import java.util.ArrayList;
import java.util.Date;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Pago;

import junit.framework.TestCase;

public class TestPagos extends TestCase {
	public void test(){
		Cartera cartera=new Cartera();
		
		Pago pago1=new Pago("H5643245");
		pago1.setFechaPago(new Date());
		pago1.setMonto(400);
		
		
		Pago pago2=new Pago("H5643245");
		pago2.setFechaPago(new Date());
		pago2.setMonto(600);
		
		Pago pago3=new Pago("H5643245");
		pago3.setFechaPago(new Date());
		pago3.setMonto(200);
		
	
		cartera.agregarPago(pago1);
		cartera.agregarPago(pago2);
		cartera.agregarPago(pago3);
		
		Pago pagoB1=new Pago("Q6743245");
		pagoB1.setFechaPago(new Date());
		pagoB1.setMonto(500);
		
		
		Pago pagoB2=new Pago("Q6743245");
		pagoB2.setFechaPago(new Date());
		pagoB2.setMonto(200);
		
		cartera.agregarPago(pagoB1);
		cartera.agregarPago(pagoB2);
		
		ArrayList<Pago> pagosH1=cartera.consultarPagos("H5643245");
		assertEquals(3, pagosH1.size());
		
		ArrayList<Pago> pagosH2=cartera.consultarPagos("Q6743245");
		assertEquals(2, pagosH2.size());
		
		ArrayList<Pago> pagosH3=cartera.consultarPagos("T5543245");
		assertEquals(0, pagosH3.size());
		
	}
}
