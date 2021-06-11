<H1 align="center"> Multi-Software JAVA SWING</a>

<div align="center" class="author">
<a align="center">
<img align="center" alt="Jeremy´s JpdzSoft" width="700px" src="https://user-images.githubusercontent.com/66846214/121622635-f9525f00-ca33-11eb-92ab-047fa0822d26.png" /></a>
</div>


### Conceptos aplicados
✅Arreglos unidimensionales.<br>
✅Estructuras de almacenamiento <br>
✅Programación orientada a objetos arreglos Java<br>


```
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
```
> _Clase Padre Curso_

```
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

```
> _Clase Hija Estudiante_

```
    
    ArrayList<Curso> ListaCurso;
    DefaultListModel estudiantesPanel= new DefaultListModel(); // MODELO DE LISTADO, VARIABLE DE PIVOTE
    Timer timer=new Timer(); // TEMPORIZADOR PARA ALERTA EN MENSAJES
    //*************************************
    TimerTask tarea= new TimerTask() {
        @Override
        public void run() {
            alertaMsg.setVisible(true);
        }
    };
   //******************************************
    int indexCur;
    /**
     * Creates new form pnlArreglos
     */
    public pnlArreglos() {
        
        initComponents();
       
        estudiantesPanel = new DefaultListModel();
        indexCur=0; 
        ListaCurso=new ArrayList<Curso>();
        timer.schedule(tarea,500 );
        lista.setModel(estudiantesPanel);
        
    }
```
> _Variables Locales en instancia de Panel Arreglos en JAVA-SWING_
