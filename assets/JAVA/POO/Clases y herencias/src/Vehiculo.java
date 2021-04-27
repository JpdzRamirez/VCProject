package src.main.java;

/**
 *
 * @author doble
 */
public class Vehiculo {

	// Atributos y caracteristicas
	private String marca;
	private String modelo;
	
	public Vehiculo() {
            this.marca="";
            this.modelo="";
	}
        public Vehiculo(String Ma, String Mo){
        this.marca=Ma;
        this.modelo=Mo;
        }
	public void setInformación(String Ma, String Mo) 
	{
		this.marca=Ma;
		this.modelo=Mo;
			
	}
	public String getInformacion(){
		
		return"El coche tiene la marca: " + this.marca + "Con modelo: "+ this.modelo;
	}
	public String getInformacionModelo(){
		
		return this.modelo;
	
	}
        public String getInformacionMarca(){
		
		return this.marca;
	
	}
}