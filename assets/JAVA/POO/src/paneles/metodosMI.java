/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco.guerrero
 */
public class metodosMI {
    
    List<String> lista;
    public List<String> crearLista (){
        List<String> lista = new ArrayList<String>(2);
        return lista;
    }
    
    public boolean insertData(String d){
        boolean salida =false;
       for(String data : lista){
           if(!data.equals(d)){
               lista.add(d);    
               salida = true;
           }
       }
       return salida;
    }
            
    
}
