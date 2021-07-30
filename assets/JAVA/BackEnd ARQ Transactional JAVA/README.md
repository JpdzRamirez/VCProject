# Backend for bank project💲📀 
> Conocimientos estudiados y adquiridos en semillero de programación en ClearMinds
## Conocimientos aplicados
<details>
	<summary> 
		Conceptos Basicos
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126988667-824247b9-1e46-4daa-90ff-64cbb9526673.png"/>
	</a>
</details>
<details>
	<summary> 
		Composicion de objetos
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126988788-087e7dee-ef8a-4dfc-97be-3953d8bb9733.png"/>
	</a>
</details>
<details>
	<summary> 
	Colecciones
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126992444-8a262609-9d0e-4e15-bee2-62b6e1e1f1bb.png"/>
	</a>
</details>
<details>
	<summary> 
	Estaticos
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126992590-6a3d8735-7519-43f3-8816-1a1ec732b63c.png"/>
	</a>
</details>
<details>
	<summary> 
	Log4j
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126992805-5cf039b5-d058-4ef5-ae64-cb0c8ba19182.png"/>
	</a>
</details>
<details>
	<summary> 
	Maven
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126993040-61c0a0f8-5397-4a32-98d2-ea215d04df91.png"/>
	</a>
</details>
<details>
	<summary> 
	Excepciones
	</summary>
	<a>
	<img src="https://user-images.githubusercontent.com/66846214/126993134-b2e7aa06-4be5-4778-8311-6f8e8505fe91.png"/>
	</a>
</details>


### Layout scheme🖼
![image](https://user-images.githubusercontent.com/66846214/126203596-92923612-4902-46d2-bd43-6bb1e0ee27ef.png)

## JUNIT Testing

![9ba5304c-2921-4f29-b1bf-c26ef27d0336](https://user-images.githubusercontent.com/66846214/126214671-1750fa69-a0b3-4407-ba39-68fbcc392205.png)


### Clients Control 🧏‍♂️

<details>
	<summary>
	Desplegar
	</summary>
	<code>
		
```
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
`````
	</code>
</details>


## Lending Control
	
<a align="center">
	<details>
	<summary>
	Desplegar
	</summary>
	<code>

```
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
``
</code>
	</a>




