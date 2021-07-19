package com.cmc.evaluacion.fase2.test;


import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.servicios.AdminClientes;

import junit.framework.TestCase;

public class TestClientesDuplicados extends TestCase {
	private static final String ROOT="D:\\Proyecto JAVA ECUADOR\\Evaluacion\\Documentos\\archivos\\Clientes2.txt";
	
	public void testLeer(){
		Cartera cartera=AdminClientes.armarCartera(ROOT);
		assertEquals(4,cartera.getClientes().size());
		assertEquals("Rolando",cartera.getClientes().get(3).getNombre());
	}
}
