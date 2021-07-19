package com.cmc.evaluacion.fase2.test;

import com.cmc.commons.util.TipoPrestamo;

import junit.framework.TestCase;

public class TestConstantes extends TestCase {
	public void test(){
		assertEquals("H", TipoPrestamo.HIPOTECARIO);
		assertEquals("Q", TipoPrestamo.QUIROGRAFARIO);
		assertEquals("O", TipoPrestamo.OTRO);
	}
}
