package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.commons.util.DateUtil;
import com.cmc.commons.util.TipoPrestamo;
import com.cmc.evaluacion.fase2.commons.EvaluacionException;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Prestamo;

public class AdminPrestamos {
	
	private static Logger logger=LogManager.getLogger(AdminPrestamos.class);
	
	private static void armarPrestamo(String ruta,Cartera cartera){
		
		File file=new File(ruta);
		BufferedReader buffer=null;
		FileReader fileReader=null;
		String partes[];
		String tempLinea;
		int contadorLineas;
		Prestamo prestamoTemp=null;
		char tempChar;
		String tipoPrestamo=null;
		Date fechaTemp=null;
		try {
			fileReader=new FileReader(file);
			buffer= new BufferedReader(fileReader);
			tempLinea="";
			contadorLineas=0;

			while((tempLinea=buffer.readLine())!=null){
				partes=tempLinea.split("-");
				if(partes.length<4){
					logger.warn(
							"El cliente de la linea: " + contadorLineas + " no ha podido ser agregado, reivsar campos");
				}else{
					tempChar=partes[1].charAt(0); //Instanciamos una variable con la primera letra del tipo de prestamo
					tipoPrestamo=Character.toString(tempChar);// Cast to string
					prestamoTemp=new Prestamo(partes[1],partes[0]);
					fechaTemp=DateUtil.convertir(partes[2]);
					prestamoTemp.setFecha(fechaTemp);
					prestamoTemp.setMonto(Double.parseDouble(partes[3]));
					if(tipoPrestamo.equals("H")){
						prestamoTemp.setTipo(TipoPrestamo.HIPOTECARIO);
					}else if(tipoPrestamo.equals("Q")){
						prestamoTemp.setTipo(TipoPrestamo.QUIROGRAFARIO);
					}else if(tipoPrestamo.equals("O")){
						prestamoTemp.setTipo(TipoPrestamo.OTRO);
					}
					
					cartera.colocarPrestamo(prestamoTemp);
				}
				
			}
		} catch (FileNotFoundException e) {
			logger.error("No se encuentra el archivo en la ruta",e);
			throw new EvaluacionException("No se encuentra el archivo en la ruta: "+ruta);
		} catch (IOException e) {
			logger.error("Error en lectura de linea", e);
			throw new EvaluacionException("Error en la lectura del archivo:  " + ruta);
		} catch (ParseException eu) {
			logger.error("Error en formato de fecha",eu);
			throw new EvaluacionException("Error en el formato de fecha en la linea ");
		}finally {
			try {
				if (buffer != null) {
					buffer.close();
					logger.info("El buffer ha sido cerrado");
				}

			} catch (IOException e) {
				logger.error("Error al cerrar el archivo", e);
				throw new EvaluacionException("Error al cerrar el buffer");
			}
			try {
				if (fileReader != null) {
					fileReader.close();
					logger.info("El buffer ha sido cerrado");
				}

			} catch (IOException e) {
				logger.error("Error al cerrar el archivo", e);
				throw new EvaluacionException("Error al cerrar el archivo ");
			}

		}
		
		
		
		
	}
	
	
	public void colocarPrestamos(String ruta, Cartera cartera){
		
		if(cartera!=null){
			armarPrestamo(ruta,cartera);
		}else{
			logger.error("Instancia de cartera null");
			
		}
		
		
		
	}
	
	
}

