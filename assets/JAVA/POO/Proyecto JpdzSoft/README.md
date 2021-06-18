<H1 align="center"> Multi-Software JAVA SWING</a>

<div align="center" class="author">
<a align="center">
<img align="center" alt="Jeremy´s JpdzSoft" width="700px" src="https://user-images.githubusercontent.com/66846214/122216393-f9a68c00-ce71-11eb-9f8f-e684d93717de.png" /></a>
</div>

<br>

>_Conceptos aplicados de colectores_

<img align="center" alt="Jeremy´s JpdzSoft" width="700px" src="https://user-images.githubusercontent.com/66846214/122490384-7edf8d00-cfa7-11eb-93a6-587f5adf8e56.png" /></a>




<img align="left" src="https://user-images.githubusercontent.com/66846214/122216458-0c20c580-ce72-11eb-9ee9-318aa14ae654.gif" width="400px">
</div>
    
### Conceptos aplicados
✅Arreglos unidimensionales.<br>
✅Estructuras de almacenamiento <br>
✅Programación orientada a objetos bajo Java<br>
✅Colecciones de objetos y variables


<br><br><br><br>

```
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

```
> _Clase Padre Curso_

```
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
```
> _Clase Hija Estudiante_

```
    
   package paneles;


import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static paneles.Arreglos.adicionalesApellido;
import static paneles.Arreglos.adicionalesDir;
import static paneles.Arreglos.adicionalesEdad;
import static paneles.Arreglos.adicionalesEmail;
import static paneles.Arreglos.adicionalesId;
import static paneles.Arreglos.adicionalesN1;
import static paneles.Arreglos.adicionalesN2;
import static paneles.Arreglos.adicionalesN3;
import static paneles.Arreglos.adicionalesN4;
import static paneles.Arreglos.adicionalesNombre;
import static paneles.Arreglos.adicionalesTelf;
import rojeru_san.componentes.RSDateChooser;
import rsbuttom.RSButtonMetro;
import rsscalelabel.RSScaleLabel;
/**
 *
 * @author doble
 */
public class ListaSoftware extends javax.swing.JPanel {

    
    private Estudiante eTemp;
    private Curso cTemp;
    private List<Curso> listaCursos;
    private DefaultComboBoxModel modeloCurso;
    private DefaultTableModel modeloTablaInicial;
    int pivote;
    private String[] cabeceraTabla;
    private String[] filaTabla;
      Timer timer=new Timer();
    TimerTask tarea= new TimerTask() {
        @Override
        public void run() {
            alertaMsg.setVisible(true);
        }
    };
    /**
     * Creates new form ListaSoftware
     */
    
    
    
    public ListaSoftware() {
        initComponents();  
        cTemp= new Curso();
        eTemp= new Estudiante();
        pivote=0;
        //timer.schedule(tarea,250 );
       
        
        this.modeloTablaInicial = new DefaultTableModel();
                
        iniciarTabla();
        
        this.listaCursos = new ArrayList<Curso>(2);
        this.modeloCurso= new DefaultComboBoxModel();
        
        
        //this.formulario.setIconImage(new ImageIcon(getClass().getResource("Software.png")).getImage());
    }
//***************************************************************************
//***************************************************************************
    
        

    private void iniciarTabla() {
        cabeceraTabla = new String[2];
        cabeceraTabla[0] = "ID.";
        cabeceraTabla[1] = "Nombres y Apellidos";
        modeloTablaInicial.setColumnIdentifiers(cabeceraTabla);
        this.getTblEstudiantes().setModel(modeloTablaInicial);
        
    }

    private Estudiante obtenerPersona() {
       
        
        this.pivote= this.getCbxCurso().getSelectedIndex();
        
        eTemp = new Estudiante();
        eTemp.setNombre(this.getAdicionalesNombre().getText(),this.getAdicionalesApellido().getText());
        eTemp.setId(Integer.valueOf(this.getAdicionalesId().getText()));
        eTemp.setTelefono(this.getAdicionalesTelf().getText());
        eTemp.setEmail(this.getAdicionalesEmail().getText());
        eTemp.setDireccion(this.getAdicionalesDir().getText());
        eTemp.setEdad(this.getAdicionalesEdad().getText());
        eTemp.setSexo(this.getCbxSexo().getSelectedItem().toString());
        eTemp.setCurso(this.getCbxCurso().getItemAt(this.pivote));
        eTemp.setNacimiento(this.getAdicionalesFecha().getDatoFecha()); 
        eTemp.setNotas(Float.parseFloat(this.getAdicionalesN1().getText()),Float.parseFloat(this.getAdicionalesN2().
                getText()),Float.parseFloat(this.getAdicionalesN4().getText()), Float.parseFloat(this.getAdicionalesN4().getText()));
        eTemp.setPromedio();
        pivote=0;
        return eTemp;
    }
    
    private Curso obtenerCurso(){
        int tamañoCurso;    
        cTemp = new Curso();
             tamañoCurso= numeroCupos.getComponentCount();
             cTemp.setNombreCurso(datoNombreCurso.getText());
             cTemp.setTamañoCurso(tamañoCurso);
             limpiarCampos();
    return cTemp;  
    }
    
    private Curso obtCursoLista(String nombreCurso) {
        Curso salida = null;
        for (Curso c : listaCursos) {
            if (String.valueOf(c.getNombreCurso()).equals(nombreCurso)) {
                salida = c;
                break;
            }
        }
        return salida;
    }
    
    private Estudiante obtPersonaLista(String id) {
        Estudiante salida = null;
       
        
        this.pivote= this.getCbxCurso().getSelectedIndex();
        cTemp= listaCursos.get(pivote);
        
        for (Estudiante p : cTemp.getListaEstudiantes()) {
            if (String.valueOf(p.getId()).equals(id)) {
                salida = p;
                break;
            }
        }
        
        return salida;
    }
 
    private void limpiarCampos() {
        this.getAdicionalesNombre().setText("");
        this.getAdicionalesApellido().setText("");
        this.getAdicionalesId().setText("");
        this.getAdicionalesTelf().setText("");
        this.getAdicionalesDir().setText("");
        this.getAdicionalesEdad().setText("");
        this.getAdicionalesEmail().setText("");
        this.getAdicionalesN1().setText("");
        this.getAdicionalesN2().setText("");
        this.getAdicionalesN3().setText("");
        this.getAdicionalesN4().setText("");
        this.getCbxSexo().setSelectedIndex(0);
        this.getDatoNombreCurso().setText("");
        this.datoNombreCurso.setText("");
        this.numeroCupos.setValue(1);
        datoNom.setText("");
        datoDir.setText("");
        datoEmail.setText("");
        datoNaci.setText("");
        datoId.setText("");
        datoTelf.setText("");
        datoProme.setText("");
        datoEdad.setText("");
        datoSexo.setText("");
        datoCurso.setText("");
        datoFoto.setText("");
        fotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/usuario.png")));
    }
    ******************************************************************************************************
    ---------------------------------------------------------------------------------------------------
    private void crearListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearListaActionPerformed
        
        cTemp= this.obtCursoLista(datoNombreCurso.getText());
        if(cTemp==null){
            String NombreCurso= datoNombreCurso.getText();
              if(NombreCurso.length()>2){  
                              
                    cTemp = obtenerCurso();
                    listaCursos.add(cTemp);
                    modeloCurso.addElement(cTemp.getNombreCurso());
                    this.getCbxCurso().setModel(modeloCurso);
                    JOptionPane.showMessageDialog(null,"Curso "+datoNombreCurso.getText()+" agregado exitosamente");
                
                    limpiarCampos();
                    
        
        }else{
        JOptionPane.showMessageDialog(null,"El curso debe contener mas de dos (2) caracteres");
        limpiarCampos();
        }

        }    else{
                JOptionPane.showMessageDialog(null,"El curso ya se encuentra registrado");
        }
        
            cTemp = null;
    }//GEN-LAST:event_crearListaActionPerformed

    private void aceptarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarDatosActionPerformed
            
        
        int x,y;
        pivote= this.getCbxCurso().getSelectedIndex();
        cTemp= listaCursos.get(pivote);
        

        
        if(cTemp.getListaEstudiantes().size()==cTemp.getTamañoCurso()){
        JOptionPane.showMessageDialog(null,"El curso se encuentra lleno, no hay más cupos. Contacte con el administrador");
                    limpiarCampos();
                    ventanaAgregarDatos.setVisible(false);
                    ventanaAgregarDatos.dispose();
        }else{
        
        eTemp= this.obtPersonaLista(adicionalesId.getText());
         
        if(eTemp==null){
            String nombreEstudiante= this.getAdicionalesNombre().getText();
              if(nombreEstudiante.length()>2){  
                              
                    eTemp = obtenerPersona();
                    
                    cTemp.getListaEstudiantes().add(eTemp);

                    cTemp.agregarFila(eTemp);
                    this.getTblEstudiantes().setModel(cTemp.getModeloTabla());
                    JOptionPane.showMessageDialog(null,"Estudiante "+ eTemp.getNombre()+" agregado exitosamente");
                    
                    limpiarCampos();
                    
                    ventanaAgregarDatos.setVisible(false);
                    ventanaAgregarDatos.dispose();
                         
        
        }else{
        JOptionPane.showMessageDialog(null,"El estudiante debe tener un nombre de mas de 2 caracteres");
        limpiarCampos();
         pivote=0;
         eTemp = null;
         cTemp=null;
        }

        }    else{
                JOptionPane.showMessageDialog(null,"El estudiante ya se encuentra registrado");
                limpiarCampos();
                pivote=0;
                eTemp = null;
                cTemp=null;

        }
        
        }   
                    limpiarCampos();
                    pivote=0;
                    eTemp = null;
                    cTemp=null;
            
            
            
    }//GEN-LAST:event_aceptarDatosActionPerformed

    private void reiniciarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarListaActionPerformed
         limpiarCampos();
         pivote= this.getCbxCurso().getSelectedIndex();
         cTemp= this.listaCursos.get(pivote);
         pivote=cTemp.getModeloTabla().getRowCount()-1;
         for(int i=pivote;i>=0;i--){
         cTemp.getModeloTabla().removeRow(i);
         }
         this.tablaEstudiantes.setModel(cTemp.getModeloTabla());
    }//GEN-LAST:event_reiniciarListaActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
                    
               
                    
                    pivote= this.getCbxCurso().getSelectedIndex();
                    cTemp= this.listaCursos.get(pivote);
                    pivote= this.getTblEstudiantes().getSelectedRow();
                    eTemp= cTemp.getListaEstudiantes().get(pivote);
                    
                    
                    String id = JOptionPane.showInputDialog(
                    this.getRootPane(),
                    "Ingrese la identificación de la persona que desea eliminar",
                    "Eliminación de asistentes",
                    JOptionPane.WARNING_MESSAGE);
                    
                    eTemp = obtPersonaLista(id);
                    
                     if (eTemp == null) {
                JOptionPane.showMessageDialog(this.getRootPane(),
                        "La persona que ingresó no se encuentra registrada",
                        "Eliminación de asistentes",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                         
                int confirmacionEliminacion = JOptionPane.showConfirmDialog(
                        this.getRootPane(),
                        "¿Está seguro que desea eliminar la persona " + eTemp.getNombre() + " " + eTemp.getApellido() + "?",
                         "Eliminación de asistentes",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                
                if (confirmacionEliminacion == 0) {
                    int index = cTemp.getListaEstudiantes().indexOf(eTemp);
                    cTemp.getListaEstudiantes().remove(eTemp);
                    if(pivote==index){
                    cTemp.getModeloTabla().removeRow(pivote);
                    }else{
                    cTemp.getModeloTabla().removeRow(index);
                    }
                    
                    this.getTblEstudiantes().setModel(cTemp.getModeloTabla());
                }
            }
                     cTemp=null;
                     eTemp=null;
                     pivote=0;
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void cambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarFotoActionPerformed
    ventanaFoto.setVisible(true);
    }//GEN-LAST:event_cambiarFotoActionPerformed

    private void seleccionCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionCursoItemStateChanged
        
        
        if(evt.getStateChange()== ItemEvent.SELECTED){
            
            
            pivote=this.getCbxCurso().getSelectedIndex();
            
            cTemp=this.listaCursos.get(pivote);
            
            this.getTblEstudiantes().setModel(cTemp.getModeloTabla());
        
        }
        pivote=0;
        cTemp=null;
        
    }//GEN-LAST:event_seleccionCursoItemStateChanged

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        ventanaAgregarDatos.setVisible(false);
        ventanaAgregarDatos.dispose();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void tablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudiantesMouseClicked
                    
                    
                   
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    pivote= this.getCbxCurso().getSelectedIndex();
                    cTemp= this.listaCursos.get(pivote);
                    pivote=this.getTblEstudiantes().getSelectedRow();
                    
                    eTemp=cTemp.getListaEstudiantes().get(pivote);
                    datoDir.setText(eTemp.getDireccion());
                    datoEmail.setText(eTemp.getEmail());
                    String x =sdf.format(eTemp.getNacimiento());
                    datoNaci.setText(x);
                    datoId.setText(String.valueOf(eTemp.getId()));
                    datoTelf.setText(eTemp.getTelefono());
                    datoProme.setText(String.valueOf(eTemp.getPromedio()));
                    datoNom.setText(eTemp.getNombre()+" "+ eTemp.getApellido());
                    datoEdad.setText(eTemp.getEdad());
                    datoSexo.setText(eTemp.getSexo());
                    datoCurso.setText(eTemp.getCurso());
                    datoFoto.setText(eTemp.getFoto());
                    rsscalelabel.RSScaleLabel.setScaleLabel(this.fotoLabel, eTemp.getFoto());
                    
                    cTemp=null;
                    eTemp=null;
                    pivote=0;
    }//GEN-LAST:event_tablaEstudiantesMouseClicked

    private void aceptarInstructivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarInstructivoActionPerformed
       alertaMsg.setVisible(false);
       alertaMsg.dispose();
    }//GEN-LAST:event_aceptarInstructivoActionPerformed

    private void buscadorFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorFicheroActionPerformed

        int cursoIndex, estudianteIndex;
        cursoIndex=this.getCbxCurso().getSelectedIndex();
        cTemp=this.listaCursos.get(cursoIndex);
        estudianteIndex= this.getTblEstudiantes().getSelectedRow();
        eTemp= cTemp.getListaEstudiantes().get(estudianteIndex);
        
        buscadorFichero.setDialogTitle("Buscar Foto o Imagen");
        
        
        
       // int returnVal; //JFileChooser.APPROVE_OPTION
       // returnVal = buscadorFichero.showDialog(null, "Escoje la foto que desee: ");
        if(evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION) ) {
           
            JOptionPane.showMessageDialog(null,"Escogió este archivo: " + buscadorFichero.getSelectedFile().getName());
            
            //File archivo= new File(buscadorFichero.getSelectedFile().toString());
            
            rsscalelabel.RSScaleLabel.setScaleLabel(this.fotoLabel, buscadorFichero.getSelectedFile().toString());
            
            eTemp.setFoto(buscadorFichero.getSelectedFile().toString());
   
            ventanaFoto.setVisible(false);
            ventanaFoto.dispose();  
            //String.valueOf(returnVal)
        }else if(evt.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)){
            ventanaFoto.setVisible(false);
            ventanaFoto.dispose();  
        }
        
        cTemp=null;
        eTemp=null;
        ventanaFoto.setVisible(false);
        ventanaFoto.dispose();
    }//GEN-LAST:event_buscadorFicheroActionPerformed

    // CREACION DE GETTERS 
        // getters de textField
        public JTextField getDatoNombreCurso() {
           return datoNombreCurso;
       }
        public JTextField getAdicionalesNombre() {
           return adicionalesNombre;
       }
        public JTextField getAdicionalesApellido() {
           return adicionalesApellido;
       }
        public JTextField getAdicionalesDir() {
           return adicionalesDir;
       }
        public JTextField getAdicionalesEmail() {
           return adicionalesEmail;
       }
        public JTextField getAdicionalesId() {
           return adicionalesId;
       }
        public JTextField getAdicionalesTelf() {
           return adicionalesTelf;
       }
        public JTextField getAdicionalesN1() {
           return adicionalesN1;
       }
        public JTextField getAdicionalesN2() {
           return adicionalesN2;
       }
        public JTextField getAdicionalesN3() {
           return adicionalesN3;
       }
        public JTextField getAdicionalesN4() {
           return adicionalesN4;
       }
        public JTextField getAdicionalesEdad() {
           return adicionalesEdad;
       }
        public JTextField getNombreCurso(){
        return datoNombreCurso;
        }
        
        // Getters JTable
        public JTable getTblEstudiantes() {
        return tablaEstudiantes;
    }
        
       
        //Getters Cbox
        public JComboBox<String> getCbxCurso() {
        return seleccionCurso;
    }
        public JComboBox<String> getCbxSexo() {
        return seleccionSexo;
    }
        // Getters Spinner
        
        public JSpinner getCupos(){
        return numeroCupos;
        }
        
      // Getters de  JButton 
       public RSButtonMetro getBtnReiniciarLista() {
        return reiniciarLista;
    }
       public RSButtonMetro getBtnAñadirDatos() {
        return añadirDatos;
    }
       public RSButtonMetro getBtnCambiarFoto() {
        return cambiarFoto;
    }
       public RSButtonMetro getBtnCrearLista() {
        return crearLista;
    }
       public RSButtonMetro getBtnAceptarDatos() {
        return aceptarDatos;
    }
       public RSButtonMetro getBtnAceptarInstructivo() {
        return aceptarInstructivo;
    }
       public RSButtonMetro getBtnEliminar() {
        return eliminarBoton;
    }
       // GETTERS RSCALENDAR
       
       public RSDateChooser getAdicionalesFecha(){
       return adicionalesFecha;
       }
       
       // Setters 
        public void setTblEstudiantes(JTable tablaEstudiantes) {
        this.tablaEstudiantes = tablaEstudiantes;
        }
        public void setCbxCurso(JComboBox<String> cbCurso) {
        this.seleccionCurso = cbCurso;
    }
        public void setCbxSexo(JComboBox<String> cbSexo) {
        this.seleccionSexo = cbSexo;
    }
    
```
> _Jpanel de control donde se instancia el control y las variables del software bajo JAVA-SWING_
