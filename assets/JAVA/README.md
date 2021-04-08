# Evidencia Actividad 2: Clases y Objetos.
<p align="center">
  <img width="200px" src="https://user-images.githubusercontent.com/66846214/113966949-a7077e80-97f5-11eb-997d-ac629735ae25.png"/> 
</p>


## Evidencia: Construcción de una clase
Se le ha encomendado el diseño de una clase, la cual debe tener atributos, métodos
constructores y un método que permita mostrar los datos en un objeto de esa clase. Para
desarrollar correctamente esta evidencia, tenga en cuenta los siguientes pasos: • Elabore
un programa en Java que va a crear dos objetos de la clase Vehículo: miVehiculo y
tuVehiculo.
miVehiculo será un objeto que utilice un método constructor por defecto
tuVehiculo tendrá los datos de marca, modelo y año que Usted quiera ingresar.
• El método constructor por defecto siempre va a ingresar los siguientes datos en el objeto
que está creando: Marca: Chevrolet Modelo: Sonic Año: 2019
• La clase Vehiculo deberá tener los tres atributos mencionados anteriormente, los dos
constructores y el método mostrarDatos() el cual mostrara por pantalla los datos guardados
en el objeto. 

<H1 alingn="center">
  main.JAVA
  </H1>

```
import lib.Vehiculo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.InputMismatchException;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		String Ma,Mo;
		Vehiculo X= new Vehiculo();
		Vehiculo Y;
		while(!salir)
		{
			
			System.out.println("Hola escoja el menú: \n");
			System.out.println("1. Ingresar a clase miVehiculo: \n");
			System.out.println("2. Ingresar a clase tuVehiculo \n");
			try {
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("La información del vehiculo es \n "+"Marca: "+X.getInformacionMarca()+"\n Modelo: "+X.getInformacionModelo()+" \n");
				break;
			case 2:
				System.out.println("La ingresa la marca: ");
				Ma= sc.nextLine();
				System.out.println("La ingresa el modelo: ");
				Mo= sc.nextLine();
				Y.setInformación(Ma, Mo);
			case 3:
				salir=true;
			
			}
			}
				catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
		}
		
		
	}

}
	}

```


## Evidencia: Métodos Set y Get de una clase
Se le ha encomendado continuar con el diseño de la clase Vehiculo, la cual debe tener sus
respectivos métodos set y get. Para desarrollar correctamente esta evidencia, tenga en
cuenta los siguientes pasos:
• La clase Vehiculo deberá tener los métodos set y get de todos los atributos. 

<H1 alingn="center">
  VEHICULO.JAVA
  </H1>
  
```
package lib;

public class Vehiculo {

	// Atributos y caracteristicas
	private String marca;
	private String modelo;
	
	public void Vehiculo() {
		
		this.marca="Chevrolet.";
		this.modelo="Sonic Año: 2019";
			
	}
	
	public void Vehiculo(String Ma, String Mo) {
		
		this.marca=Ma;
		this.modelo=Mo;
			
	}
	public void setInformación(String Ma, String Mo) 
	{
		this.marca=Ma;
		this.modelo=Mo;
			
	}
	
	public String getInformacionMarca(){
		
		return this.marca;
	
	}
	public String getInformacionModelo(){
		
		return this.modelo;
	
	}
}

```
