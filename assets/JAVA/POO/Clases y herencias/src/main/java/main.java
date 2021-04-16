package src.main.java;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author doble
 */
public class main {
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
	
		miVehiculo X= new miVehiculo();
		tuVehiculo Y= new tuVehiculo();
               
		while(!salir)
		{
			
			System.out.println("Hola escoja el menú: \n");
			System.out.println("1. Ingresar a clase miVehiculo. \n");
			System.out.println("2. Ingresar a clase tuVehiculo. \n");
                        System.out.println("3. salir. \n");
			try {
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("La información del vehiculo es \n "+" Marca: "+X.getInformacionMarca()+"\n Modelo: "+X.getInformacionModelo()+" \n");
				break;
			case 2:
				System.out.println("La ingresa la marca:");
                                sc.nextLine();
				String Ma= sc.nextLine();
                                
				System.out.print(" La ingresa el modelo: \n");
				String Mo= sc.nextLine();
                                
				Y.setInformación(Ma, Mo);
                                
                                System.out.println(Y.getInformacion());
                                break;
			case 3:
				salir=true;
                                break;
			}
			}
				catch (InputMismatchException ex) {
                                System.out.println("Debes insertar un número");
                                sc.next();
		}
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
            }
    sc.close();
}
}