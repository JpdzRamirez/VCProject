package lib;

public class Vehiculo {

	// Atributos y caracteristicas
	private String marca;
	private String modelo;
	
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