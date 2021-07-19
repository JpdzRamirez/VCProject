package com.cmc.evaluacion.fase2.test;

import java.util.ArrayList;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;

import junit.framework.TestCase;

public class TestCartera extends TestCase {
	
	
	public void testAgregarSimple(){
		Cartera cartera=new Cartera();
		boolean resultado=cartera.agregarCliente(new Cliente("1723453421","Marco","Perez"));
		assertTrue(resultado);
	}
	
	public void testAgregarVarios(){
		Cartera cartera=new Cartera();
		cartera.agregarCliente(new Cliente("1723453421","Marco","Perez"));
		cartera.agregarCliente(new Cliente("0232456789","Soraya","Ramirez"));
		cartera.agregarCliente(new Cliente("1183245609","Rocio","Durcal"));
		ArrayList<Cliente> clientes=cartera.getClientes();
		assertEquals(clientes.size(), 3);
	}
	
	public void testAgregarDuplicado(){
		Cartera cartera=new Cartera();
		cartera.agregarCliente(new Cliente("1723453421","Marco","Perez"));
		cartera.agregarCliente(new Cliente("0232456789","Soraya","Ramirez"));
		cartera.agregarCliente(new Cliente("1723453421","Rocio","Durcal"));
		ArrayList<Cliente> clientes=cartera.getClientes();
		assertEquals(clientes.size(), 2);
	}
}