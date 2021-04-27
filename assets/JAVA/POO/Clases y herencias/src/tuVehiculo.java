package src.main.java;


/**
 *
 * @author doble
 */
public class tuVehiculo extends Vehiculo {
    // Atributos y caracteristicas

		
		public tuVehiculo(){
		    
		}

		@Override
		public String getInformacion(){
			
			return "El vehiculo tiene la marca: "+super.getInformacionMarca()+" Y modelo: " + super.getInformacionModelo();
		
		}

}
