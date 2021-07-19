package com.cmc.evaluacion.fase2.commons;

import java.text.ParseException;
import java.util.Date;

import com.cmc.commons.util.DateUtil;

public class TestDate {

	public static void main(String[] args) {
		
		String fecha="2020/05/17";
		Date fechaDate= new Date();
		try {
			fechaDate=DateUtil.convertir(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PAUSA");
		
		
	}

}
