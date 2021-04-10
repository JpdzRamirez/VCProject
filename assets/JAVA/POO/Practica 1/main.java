import lib.miVehiculo;
import lib.tuVehiculo;
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
		miVehiculo X= new miVehiculo();
		tuVehiculo Y;
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