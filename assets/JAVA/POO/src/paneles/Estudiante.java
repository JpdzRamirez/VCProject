/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import java.util.Date;
import javax.swing.JOptionPane;
import paneles.Curso;

public class Estudiante extends Curso {
 
    private String nombre, apellido, direccion, telefono, email, foto, edad, curso,sexo;
    private int id;
    private Date fechaNacimiento;
    float promedio;
    float[ ] notas = new float[4];
    
    public Estudiante(){
    foto="/resources/usuario.png";
    }
    
   
    public Estudiante(String _nombre, String _apellido, String _curso, String _direccion, String _telefono, String _email)  {
        super(_curso);
       this.setNombre(_nombre, _apellido);
       this.direccion= _direccion;
       this.curso = _curso;
       this.telefono= _telefono;
       this.email= _email;
    }
    public void setEdad(String _edad){
    
    this.edad= _edad;
    }
    public void setNacimiento(Date _fechaNacimiento){
    this.fechaNacimiento = _fechaNacimiento;
    }
    public void setSexo(String _sexo){
    this.sexo= _sexo;
    }
    public void setCurso(String _curso){
    this.curso = _curso;
    }
    public void setNombre(String _nombre, String _apellido) {
        int largoNom, largoApe;
        
        largoNom = _nombre.length();
        largoApe = _apellido.length();
        
        if (largoNom>0 && largoApe>0){
        this.nombre= _nombre;
        this.apellido = _apellido;
        } else{
            JOptionPane.showMessageDialog(null,"El nombre no debe venir en blanco");
            
        }
        
    }
    public void setNotas(float nota1,float nota2,float nota3, float nota4){
    notas[0]=nota1;
    notas[1]=nota2;
    notas[2]=nota3;
    notas[3]=nota4;
    }
    public void setPromedio(){
        float notasSuma=0;
        notasSuma=notas[0]+notas[1]+notas[2]+notas[3];
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
    
    
    public String getEdad(){
    return this.edad;
    }
    public String getSexo(){
    return this.sexo;
    }
    public String getCurso(){
    return this.curso;
    }
    public Date getNacimiento(){
    return this.fechaNacimiento;
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
    
    
}


