package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class DateUtil {

	private static final String FECHA="yyyy/dd/MM";
	
	public static Date convertir(String _fecha) throws ParseException{
		Date tempDate = null; 
		SimpleDateFormat formato = new SimpleDateFormat(FECHA);
		tempDate= formato.parse(_fecha);
		return tempDate;
	}
}
