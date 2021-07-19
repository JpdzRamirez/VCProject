package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.commons.UncheckedException;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;


public class AdminClientes {

		private static Logger logger = LogManager.getLogger(AdminClientes.class);
		
		
		private static void armarCliente(String _dato, Cartera _cartera){
			File file = new File(_dato);
			String tempLinea;
			BufferedReader buffer = null;
			FileReader fileReader = null;
			String[] partes;
			Cliente tempCliente;
			int contadorLineas=0;
			try {
				fileReader = new FileReader(file);
				buffer = new BufferedReader(fileReader);
				tempLinea = "";
				while ((tempLinea = buffer.readLine()) != null) {
					partes=tempLinea.split(",");
					try{
						if(partes.length<3){
							logger.error("error al armar cliente en la linea");
							throw new UncheckedException("Error al armar cliente en la linea"+contadorLineas);
						}else{
							tempCliente=new Cliente(partes[0],partes[1],partes[2]);
							_cartera.agregarCliente(tempCliente);
							contadorLineas++;
						}
					
					}
					catch(UncheckedException e){
						logger.error("error al armar cliente en la linea",e);
					}
					
				}
			} catch (FileNotFoundException e) {
				logger.error("Error al leer el archivo, archovo no encontrado", e);
				throw new UncheckedException("Nose pudo leer el archivo" + _dato);
			} catch (IOException i) {
				logger.error("Error al leer el archivo, archovo no encontrado", i);
				throw new UncheckedException("Nose pudo leer el archivo" + _dato);
			} finally {
				try {
					if (buffer != null) {
						buffer.close();
						logger.info("El buffer ha sido cerrado");
					}

				} catch (IOException e) {
					logger.error("Error al cerrar el archivo", e);
				}
				try {
					if (fileReader != null) {
						fileReader.close();
						logger.info("El buffer ha sido cerrado");
					}

				} catch (IOException e) {
					logger.error("Error al cerrar el archivo", e);
				}

			}
		}
		
		
		//String cedula,String nombre, String apellido
		public static Cartera armarCartera(String _rutaArchivo) throws UncheckedException {
			
			 Cartera cartera1=new Cartera();
			 AdminClientes.armarCliente(_rutaArchivo,cartera1);
			 return cartera1;
		}
		
	}

