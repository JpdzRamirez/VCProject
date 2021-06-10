/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import paneles.Estudiante;
/**
 *
 * @author doble
 */
public class Curso {

    String nombreCurso;
    int tamañoCurso,posicion;
    
    ArrayList<Estudiante> Estudi;
    DefaultListModel estudiantes= new DefaultListModel(); //MODELO DE LISTA PARA AGREGAR A JLIST
    
    public Curso( String _nombreCurso) {
        this.nombreCurso=_nombreCurso;
        this.posicion=0;
        this.estudiantes= new DefaultListModel();
        this.Estudi=new ArrayList();
        this.tamañoCurso=0;
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
