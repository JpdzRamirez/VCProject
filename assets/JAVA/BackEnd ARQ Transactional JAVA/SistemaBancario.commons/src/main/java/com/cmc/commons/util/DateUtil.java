package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DateUtil {
	
	private static Logger logger=LogManager.getLogger(DateUtil.class);
	private static final String FECHA="yyyy/dd/MM";
	
	public static Date convertir(String fecha) throws ParseException {
		Date dateTemp=null;
		SimpleDateFormat formato= new SimpleDateFormat(FECHA);
		try {
			dateTemp= formato.parse(fecha);
		} catch (ParseException e) {
			logger.warn("Error en el formato de la fecha",e);
		}
		return dateTemp;
	}
	
}
