/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import javax.swing.JOptionPane;
import paneles.Curso;

public class Estudiante extends Curso {
 
    private String nombre, apellido, direccion, telefono, email, foto;
    private int id;
    float promedio;
    float[ ] notas = new float[4];
 
    public Estudiante(String nombre, String apellido, String _curso)  {
        super(_curso);
        this.setNombre(nombre);
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        int largo;
        largo =nombre.length();
        if (largo>0){
        this.nombre=nombre;
        } else{
            JOptionPane.showMessageDialog(null,"El nombre no debe venir en blanco");
        }
        this.nombre = nombre;
    }
    public void setPromedio(float nota1,float nota2,float nota3, float nota4){
        float notasSuma=0;
        for(int i=0; i>4;i++){
        notasSuma=notasSuma+notas[i];
        }
        
        this.promedio= notasSuma/4;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFoto(String _Foto){
    this.foto=_Foto;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getPromedio(){
    return this.promedio;
    }
    public String getFoto(){
        return this.foto;
    }
    public int getId() {
        return id;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return this.nombre+" "+this.apellido;
    }
    @Override
     public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}

