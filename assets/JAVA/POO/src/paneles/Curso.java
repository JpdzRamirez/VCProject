/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import paneles.Estudiante;
/**
 *
 * @author doble
 */
public class Curso {

    String nombreCurso;
    int tamañoCurso,posicion;
    private DefaultTableModel modeloTabla;

    private String[] cabeceraTabla;
    private String[] filaTabla;
    
    private List<Estudiante> listaPersonas;
     //MODELO DE LISTA PARA AGREGAR A JLIST
    
    public Curso(){
    this.modeloTabla = new DefaultTableModel();
    this.iniciarTabla();
    this.listaPersonas = new ArrayList<Estudiante>(2);
    }
    public Curso( String _nombreCurso) {
        this.nombreCurso=_nombreCurso;
        this.posicion=0;
       
        this.modeloTabla = new DefaultTableModel();
        this.listaPersonas = new ArrayList<Estudiante>(2);
        this.tamañoCurso=0;
    }
    public List<Estudiante> getListaEstudiantes(){
    
    return listaPersonas;
    }
    public DefaultTableModel getModeloTabla(){
    
    return this.modeloTabla;
    }
    public String getNombreCurso() {
        return this.nombreCurso;
    }
    public int getTamañoCurso() {
        return tamañoCurso;
    }
    public int getPosicion() {
        return posicion;
    }
    public void iniciarTabla(){
    
        cabeceraTabla = new String[2];
        cabeceraTabla[0] = "ID.";
        cabeceraTabla[1] = "Nombres y Apellidos";
        modeloTabla.setColumnIdentifiers(cabeceraTabla);
     
    }
    public void agregarFila(Estudiante pTemp){
    modeloTabla.addRow(crearFila(pTemp, listaPersonas.indexOf(pTemp)));
    }
     private Object[] crearFila(Estudiante p, int indice) {
        filaTabla = new String[2];
        filaTabla[0] = (p.getId()) + "";
        filaTabla[1] = p.getNombre() + " " + p.getApellido(); 
        return filaTabla;
    }
     
    public void setPosicion(int posicion) {
        this.posicion = posicion;
        
    }
    public void setTamañoCurso(int tamañoCurso) {
        this.tamañoCurso = tamañoCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

}
