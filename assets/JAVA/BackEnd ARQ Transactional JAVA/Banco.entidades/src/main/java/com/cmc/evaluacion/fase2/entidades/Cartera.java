package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.commons.UncheckedException;


public class Cartera {

	private ArrayList<Cliente> clientes;
	private Logger logger=LogManager.getLogger(Cartera.class);
	private HashMap<String, ArrayList<Pago>> pagos;
	
	public Cartera(){
		clientes=new ArrayList<Cliente>();
		pagos =new HashMap<String,ArrayList<Pago>>();
	}
	
	
	public void agregarPago(Pago _pago){
		ArrayList<Pago> tempPagos=new ArrayList<Pago>();
		if(pagos.get(_pago.getNumeroPrestamo())==null){
			tempPagos.add(_pago);
			pagos.put(_pago.getNumeroPrestamo(), tempPagos);
		}else{
			tempPagos=pagos.get(_pago.getNumeroPrestamo());
			tempPagos.add(_pago);
		}
		
	}
	public ArrayList<Balance> calcularBalances(){
		ArrayList<Balance> ListaBalanceTemp= new ArrayList<Balance>();
		Balance balanceTemp=null;
		ArrayList<Pago> tempPagos=new ArrayList<Pago>();
		double valoresPrestadosTemp=0;
		double valoresPagadoTemp=0;
		double saldo=0;
		for(Cliente _clienteTemp:clientes){
			balanceTemp=new Balance();
			valoresPrestadosTemp=0;
			valoresPagadoTemp=0;
			saldo=0;
			for(Prestamo _prestamoTemp:_clienteTemp.getPrestamos()){
				valoresPrestadosTemp+=_prestamoTemp.getMonto();
				if(pagos.get( _prestamoTemp.getNumero())!=null){
					tempPagos=pagos.get( _prestamoTemp.getNumero());
					for(Pago _pago:tempPagos){
						valoresPagadoTemp+=_pago.getMonto();
					}
				}
				
			}
			saldo=valoresPrestadosTemp-valoresPagadoTemp;
			balanceTemp.setValorPrestamos(valoresPrestadosTemp);
			balanceTemp.setValorPagado(valoresPagadoTemp);
			balanceTemp.setNumeroCedula(_clienteTemp.getCedula());
			balanceTemp.setSaldo(saldo);
			ListaBalanceTemp.add(balanceTemp);
		}
		return ListaBalanceTemp;
	}
	public ArrayList<Pago> consultarPagos(String _prestamoCodigo){
		ArrayList<Pago> tempPagos=new ArrayList<Pago>();
		if(pagos.get(_prestamoCodigo)!=null){
			tempPagos=pagos.get(_prestamoCodigo);
		}
		return tempPagos;
	}
	public void colocarPrestamo(Prestamo _prestamo){
		Cliente temp=buscarCliente(_prestamo.getCedulaCliente());
		temp.setPrestamos(_prestamo);
		
	}
	public Cliente buscarCliente(String _cedula){
		
		try{
			if(clientes!=null){
				for(Cliente tempCliente: clientes){
					if(tempCliente.getCedula().equals(_cedula)){
						return tempCliente;
					}
				}
				
			}
			else{
				logger.info("No hay registros");
				return null;
			}
		}catch(NullPointerException e){
			logger.error("No hay clientes",e);
			 throw new UncheckedException("No hay clientes registrados");
		}
		return null;
		
	}
	
	public boolean agregarCliente(Cliente _cliente){
		
		if(buscarCliente(_cliente.getCedula())==null){
			clientes.add(_cliente);
			return true;
		}else{
			return false;
		}
		
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
	
	
	
	
	
}
