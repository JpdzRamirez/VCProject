package com.cmc.evaluacion.fase2.test;

import java.util.ArrayList;
import java.util.Date;

import com.cmc.evaluacion.fase2.entidades.Balance;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Pago;
import com.cmc.evaluacion.fase2.servicios.AdminClientes;
import com.cmc.evaluacion.fase2.servicios.AdminPrestamos;

import junit.framework.TestCase;

public class TestCalcularBalances extends TestCase {
	private static final String ROOT="D:\\Proyecto JAVA ECUADOR\\Evaluacion\\Documentos\\archivos";
	private static final String ARCHIVO_CLIENTES=ROOT+"\\Clientes1.txt";
	private static final String ARCHIVO_PRESTAMOS=ROOT+"\\Prestamos1.txt";

	public void test(){
		Cartera cartera=AdminClientes.armarCartera(ARCHIVO_CLIENTES);
		AdminPrestamos adminPrestamos=new AdminPrestamos();
		adminPrestamos.colocarPrestamos(ARCHIVO_PRESTAMOS,cartera);
		
		
		Pago pago1=new Pago("H5643245");
		pago1.setFechaPago(new Date());
		pago1.setMonto(400);
		
		
		Pago pago2=new Pago("H5643245");
		pago2.setFechaPago(new Date());
		pago2.setMonto(600);
		
		Pago pago3=new Pago("Q4543245");
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
		
		ArrayList<Balance> balances=cartera.calcularBalances();
		assertEquals(4, balances.size());
		
		Balance balance1=balances.get(0);
		balance1.getValorPrestamo();
		assertEquals(16500.23,balance1.getValorPrestamo());
		assertEquals(1200.0,balance1.getValorPagado());
		assertEquals(15300.23,balance1.getSaldo());
	}

}
