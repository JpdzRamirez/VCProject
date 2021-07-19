package com.cmc.evaluacion.fase2.test;


import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.servicios.AdminClientes;

import junit.framework.TestCase;

public class TestClientes extends TestCase {
	private static final String ROOT="D:\\Proyecto JAVA ECUADOR\\Evaluacion\\Documentos\\archivos\\Clientes1.txt";
	//D:\Proyecto JAVA ECUADOR\Evaluacion\Documentos\archivos\Clientes.txt
	public void testLeer(){
		Cartera cartera=AdminClientes.armarCartera(ROOT);
		assertEquals(4,cartera.getClientes().size());
		assertEquals("Beatriz",cartera.getClientes().get(2).getNombre());
	}
}