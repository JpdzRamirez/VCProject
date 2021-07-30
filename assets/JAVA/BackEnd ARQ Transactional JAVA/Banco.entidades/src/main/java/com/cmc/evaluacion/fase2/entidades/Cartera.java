package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cartera {

	private ArrayList<Cliente> clientes;
	private HashMap<String ,ArrayList<Pago>> pagos;
	
	
	public void agregarPago(Pago _pago){
		
		ArrayList<Pago> pagosTemp=new ArrayList<Pago>();
		if(pagos.get(_pago.getNumeroPrestamo())==null){
			pagosTemp.add(_pago);
			pagos.put(_pago.getNumeroPrestamo(), pagosTemp);
		}else{
			pagosTemp=pagos.get(_pago.getNumeroPrestamo());
			pagosTemp.add(_pago);
		}
	}
	public ArrayList<Balance> calcularBalances(){
		Balance balanceTemp;
		ArrayList<Balance> listaBalances=new ArrayList<Balance>();
		double sumaPrestamos;
		double sumaPagos;
		double saldo;
		for (Cliente clienteTemp: clientes){
			balanceTemp=new Balance();
			sumaPrestamos=0;
			sumaPagos=0;
			saldo=0;
			for(Prestamo prestamoTemp:clienteTemp.getPrestamos()){
				sumaPrestamos+=prestamoTemp.getMonto();
				for(Pago pagosTemp:consultarPagos(prestamoTemp.getNumero())){
					sumaPagos+=pagosTemp.getMonto();
				}
			}
			balanceTemp.setNumeroCedula(clienteTemp.getCedula());
			balanceTemp.setValorPrestamos(sumaPrestamos);
			balanceTemp.setValorPagado(sumaPagos);
			saldo=sumaPrestamos-sumaPagos;
			balanceTemp.setSaldo(saldo);
			listaBalances.add(balanceTemp);
		}
		
		return listaBalances;
	}
	public ArrayList<Pago> consultarPagos(String prestamoCodigo){
		ArrayList<Pago> pagosTemp=new ArrayList<Pago>();
		if(pagos.get(prestamoCodigo)!=null){
			pagosTemp=pagos.get(prestamoCodigo);
		}
		return pagosTemp;
	}
	
	private static Logger logger=LogManager.getLogger(Cartera.class);
	
	
	
	public Cartera() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.pagos=new HashMap<String,ArrayList<Pago>>();
	}





	public ArrayList<Cliente> getClientes() {
		return clientes;
	}





	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}





	public Cliente buscarCliente(String _cedula){
		
		for (Cliente clienteTemp : clientes){
			
			if(clienteTemp.getCedula().equals(_cedula)){
				
				return clienteTemp;
			}
		}
		
		return null;
	}
	
	
	public boolean agregarCliente(Cliente _clienteTemp){
		
		if(this.buscarCliente(_clienteTemp.getCedula())==null){
			this.clientes.add(_clienteTemp);
			return true;
		}else{
			logger.warn("El cliente ya registrado");
		}
	
		return false;
	}
	
	public void colocarPrestamo(Prestamo prestamo){
		
		Cliente clienteTemp=null;
		clienteTemp=buscarCliente(prestamo.getCedulaCliente());
		if(clienteTemp!=null){
			clienteTemp.getPrestamos().add(prestamo);
		}
		
	}
	
}
