package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.commons.EvaluacionException;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;

public class AdminClientes {

	private static Logger logger = LogManager.getLogger(AdminClientes.class);

	private static void armarCliente(String ruta, Cartera _cartera) {
		File file = new File(ruta);
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String partes[];
		String tempLinea;
		Cliente clienteTemp = null;
		int contadorLineas;
		try {
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			tempLinea = "";
			contadorLineas = 0;
			while ((tempLinea = buffer.readLine()) != null) {
				partes = tempLinea.split(",");
				if (partes.length < 3) {
					logger.warn(
							"El cliente de la linea: " + contadorLineas + " no ha podido ser agregado, reivsar campos");
				} else {
					clienteTemp = new Cliente(partes[0], partes[1], partes[2]);
					_cartera.agregarCliente(clienteTemp);
					contadorLineas++;
					logger.info("Cliente agregado exitosamente");
				}

			}
		} catch (FileNotFoundException e) {
			logger.error("No existe el archivo, no encontrado", e);
			throw new EvaluacionException("No existe el archivo, no encontrado en la ruta: " + ruta);
		} catch (IOException e) {
			logger.error("Error en lectura de linea", e);
			throw new EvaluacionException("Error en la lectura del archivo:  " + ruta);

		} finally {
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

	public static Cartera armarCartera(String ruta) {
		Cartera carteraTemp = new Cartera();
		armarCliente(ruta, carteraTemp);
		return carteraTemp;
	}

}
