package com.cmc.evaluacion.fase2.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import com.cmc.commons.util.DateUtil;

import junit.framework.TestCase;

public class TestConvertirFecha extends TestCase {
	public void testFecha1(){
		String fecha="2020/25/02";
		Date fechaConvertida=null;
		Calendar calendar=Calendar.getInstance();
		try {
			fechaConvertida=DateUtil.convertir(fecha);
			calendar.setTime(fechaConvertida);
			System.out.println(fechaConvertida);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		assertNotNull(fechaConvertida);
		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(1, calendar.get(Calendar.MONTH));
		assertEquals(25, calendar.get(Calendar.DAY_OF_MONTH));
	}
	public void testFecha2(){
		String fecha="2018/30/01";
		Date fechaConvertida=null;
		Calendar calendar=Calendar.getInstance();
		try {
			fechaConvertida=DateUtil.convertir(fecha);
			calendar.setTime(fechaConvertida);
			System.out.println(fechaConvertida);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		assertNotNull(fechaConvertida);
		assertEquals(2018, calendar.get(Calendar.YEAR));
		assertEquals(0, calendar.get(Calendar.MONTH));
		assertEquals(30, calendar.get(Calendar.DAY_OF_MONTH));
	}
}
