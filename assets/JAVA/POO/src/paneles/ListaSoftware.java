/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
//JpdzSoftware only list

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
    
    
    
    
 //**************************************************************************
 //**************************************************************************
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAgregarDatos = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        adicionalesN1 = new javax.swing.JTextField();
        adicionalesN2 = new javax.swing.JTextField();
        adicionalesN3 = new javax.swing.JTextField();
        adicionalesN4 = new javax.swing.JTextField();
        adicionalesDir = new javax.swing.JTextField();
        adicionalesTelf = new javax.swing.JTextField();
        adicionalesEmail = new javax.swing.JTextField();
        adicionalesId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        adicionalesNombre = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        adicionalesApellido = new javax.swing.JTextField();
        aceptarDatos = new rsbuttom.RSButtonMetro();
        adicionalesEdad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        seleccionSexo = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        adicionalesFecha = new rojeru_san.componentes.RSDateChooser();
        cancelarBoton = new rsbuttom.RSButtonMetro();
        alertaMsg = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        aceptarInstructivo = new rsbuttom.RSButtonMetro();
        ventanaFoto = new javax.swing.JFrame();
        buscadorFichero = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        numeroCupos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        datoNombreCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        reiniciarLista = new rsbuttom.RSButtonMetro();
        añadirDatos = new rsbuttom.RSButtonMetro();
        crearLista = new rsbuttom.RSButtonMetro();
        seleccionCurso = new javax.swing.JComboBox<>();
        eliminarBoton = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        datoTelf = new javax.swing.JLabel();
        datoNaci = new javax.swing.JLabel();
        datoId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fotoLabel = new javax.swing.JLabel();
        datoDir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        datoProme = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        datoEmail = new javax.swing.JLabel();
        cambiarFoto = new rsbuttom.RSButtonMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datoNom = new javax.swing.JLabel();
        datoEdad = new javax.swing.JLabel();
        datoSexo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        datoCurso = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        datoFoto = new javax.swing.JLabel();

        ventanaAgregarDatos.setLocation(new java.awt.Point(700, 400));
        ventanaAgregarDatos.setMinimumSize(new java.awt.Dimension(787, 350));
        ventanaAgregarDatos.setUndecorated(true);

        jLabel16.setText("Nota 3");

        jLabel17.setText("Dirección");

        jLabel18.setText("Nota 4");

        jLabel19.setText("Telefono");

        jLabel20.setText("Id");

        jLabel21.setText("Correo");

        jLabel22.setText("Nota 1");

        jLabel23.setText("Nota 2");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/chulitos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel25.setText("Nombres ");

        jLabel26.setText("Apellidos");

        aceptarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/verificacion.png"))); // NOI18N
        aceptarDatos.setText("OK");
        aceptarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarDatosActionPerformed(evt);
            }
        });

        jLabel27.setText("Edad");

        seleccionSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jLabel28.setText("Edad");

        jLabel29.setText("Fecha de nacimiento");

        adicionalesFecha.setColorBackground(new java.awt.Color(255, 204, 0));
        adicionalesFecha.setColorButtonHover(new java.awt.Color(255, 0, 0));
        adicionalesFecha.setColorForeground(new java.awt.Color(0, 0, 0));

        cancelarBoton.setText("Cancelar");
        cancelarBoton.setColorHover(new java.awt.Color(255, 204, 0));
        cancelarBoton.setColorNormal(new java.awt.Color(255, 51, 0));
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaAgregarDatosLayout = new javax.swing.GroupLayout(ventanaAgregarDatos.getContentPane());
        ventanaAgregarDatos.getContentPane().setLayout(ventanaAgregarDatosLayout);
        ventanaAgregarDatosLayout.setHorizontalGroup(
            ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaAgregarDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(aceptarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(19, 19, 19))
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel17)
                                    .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesNombre)
                                            .addComponent(adicionalesEdad))
                                        .addGap(18, 18, 18)
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaAgregarDatosLayout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaAgregarDatosLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(18, 18, 18)))
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seleccionSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaAgregarDatosLayout.createSequentialGroup()
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(adicionalesDir, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesTelf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionalesN2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adicionalesN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adicionalesN3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adicionalesN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adicionalesFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
        );
        ventanaAgregarDatosLayout.setVerticalGroup(
            ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaAgregarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(adicionalesFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seleccionSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(23, 23, 23)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(62, 62, 62)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(adicionalesN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionalesN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(adicionalesN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ventanaAgregarDatosLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(ventanaAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(adicionalesN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(32, 32, 32)
                .addComponent(aceptarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        alertaMsg.setBackground(new java.awt.Color(255, 102, 102));
        alertaMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alertaMsg.setLocation(new java.awt.Point(700, 400));
        alertaMsg.setMinimumSize(new java.awt.Dimension(485, 300));
        alertaMsg.setUndecorated(true);
        alertaMsg.setPreferredSize(new java.awt.Dimension(485, 300));

        jTextPane2.setBackground(new java.awt.Color(255, 204, 51));
        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("INSTRUCTIVO:\n✅ TODO CURSO DEBE SER INGRESADO EN MAYUSCULA SOSTENIDA.\n✅ TODO NOMBRE DEBE SER INGRESADO EN MAYUSCULA SOSTENIDA.\n");
        jTextPane2.setFocusable(false);
        jScrollPane5.setViewportView(jTextPane2);

        aceptarInstructivo.setText("Ok");
        aceptarInstructivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarInstructivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alertaMsgLayout = new javax.swing.GroupLayout(alertaMsg.getContentPane());
        alertaMsg.getContentPane().setLayout(alertaMsgLayout);
        alertaMsgLayout.setHorizontalGroup(
            alertaMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alertaMsgLayout.createSequentialGroup()
                .addGroup(alertaMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alertaMsgLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alertaMsgLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(aceptarInstructivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        alertaMsgLayout.setVerticalGroup(
            alertaMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alertaMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptarInstructivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ventanaFoto.setLocation(new java.awt.Point(700, 400));
        ventanaFoto.setMinimumSize(new java.awt.Dimension(694, 500));
        ventanaFoto.setUndecorated(true);
        ventanaFoto.setPreferredSize(new java.awt.Dimension(694, 500));

        buscadorFichero.setMinimumSize(new java.awt.Dimension(623, 397));
        buscadorFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorFicheroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaFotoLayout = new javax.swing.GroupLayout(ventanaFoto.getContentPane());
        ventanaFoto.getContentPane().setLayout(ventanaFotoLayout);
        ventanaFotoLayout.setHorizontalGroup(
            ventanaFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaFotoLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(buscadorFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ventanaFotoLayout.setVerticalGroup(
            ventanaFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaFotoLayout.createSequentialGroup()
                .addComponent(buscadorFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        numeroCupos.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        numeroCupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Nombre del Curso");

        jLabel2.setText("Numero de Cupos");

        tablaEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombres y Apellidos"
            }
        ));
        tablaEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        reiniciarLista.setBackground(new java.awt.Color(204, 204, 204));
        reiniciarLista.setText("Reiniciar Lista");
        reiniciarLista.setColorHover(new java.awt.Color(0, 153, 153));
        reiniciarLista.setColorNormal(new java.awt.Color(204, 204, 204));
        reiniciarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(reiniciarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(reiniciarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        añadirDatos.setBackground(new java.awt.Color(204, 204, 204));
        añadirDatos.setText("Añadir Estudiante");
        añadirDatos.setColorHover(new java.awt.Color(255, 204, 51));
        añadirDatos.setColorNormal(new java.awt.Color(204, 204, 204));
        añadirDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDatosActionPerformed(evt);
            }
        });

        crearLista.setBackground(new java.awt.Color(204, 204, 204));
        crearLista.setText("Crear Lista");
        crearLista.setColorHover(new java.awt.Color(255, 204, 0));
        crearLista.setColorNormal(new java.awt.Color(204, 204, 204));
        crearLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearListaActionPerformed(evt);
            }
        });

        seleccionCurso.setMaximumRowCount(10);
        seleccionCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionCursoItemStateChanged(evt);
            }
        });

        eliminarBoton.setText("Eliminar");
        eliminarBoton.setColorHover(new java.awt.Color(255, 204, 0));
        eliminarBoton.setColorNormal(new java.awt.Color(204, 204, 204));
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(añadirDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(datoNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(numeroCupos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(crearLista, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seleccionCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datoNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroCupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearLista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        datoTelf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datoNaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datoId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Estudiante: ");

        jLabel13.setText("Email:");

        jLabel12.setText("Telefono:");

        jLabel11.setText("Dirección:");

        jLabel14.setText("Id:");

        fotoLabel.setBackground(new java.awt.Color(255, 255, 255));
        fotoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/usuario.png"))); // NOI18N
        fotoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        datoDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Datos:");

        datoProme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datoProme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setText("Promedio de Notas");

        datoEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cambiarFoto.setText("Cambiar Foto");
        cambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarFotoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("Edad");

        datoNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datoEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datoSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Sexo");

        datoCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setText("Curso");

        datoFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cambiarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(datoProme, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(datoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel10)))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datoId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(datoTelf, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(datoDir, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(datoNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datoSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(datoNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(datoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(datoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cambiarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datoId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(datoNaci, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(9, 9, 9))
                                            .addComponent(datoDir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(datoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(datoTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(5, 5, 5)
                                        .addComponent(datoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datoProme, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void añadirDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDatosActionPerformed
        ventanaAgregarDatos.setVisible(true);
    }//GEN-LAST:event_añadirDatosActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro aceptarDatos;
    private rsbuttom.RSButtonMetro aceptarInstructivo;
    public static javax.swing.JTextField adicionalesApellido;
    public static javax.swing.JTextField adicionalesDir;
    public static javax.swing.JTextField adicionalesEdad;
    public static javax.swing.JTextField adicionalesEmail;
    private rojeru_san.componentes.RSDateChooser adicionalesFecha;
    public static javax.swing.JTextField adicionalesId;
    public static javax.swing.JTextField adicionalesN1;
    public static javax.swing.JTextField adicionalesN2;
    public static javax.swing.JTextField adicionalesN3;
    public static javax.swing.JTextField adicionalesN4;
    public static javax.swing.JTextField adicionalesNombre;
    public static javax.swing.JTextField adicionalesTelf;
    private javax.swing.JDialog alertaMsg;
    private rsbuttom.RSButtonMetro añadirDatos;
    public javax.swing.JFileChooser buscadorFichero;
    private rsbuttom.RSButtonMetro cambiarFoto;
    private rsbuttom.RSButtonMetro cancelarBoton;
    private rsbuttom.RSButtonMetro crearLista;
    public static javax.swing.JLabel datoCurso;
    public static javax.swing.JLabel datoDir;
    public static javax.swing.JLabel datoEdad;
    public static javax.swing.JLabel datoEmail;
    public static javax.swing.JLabel datoFoto;
    public static javax.swing.JLabel datoId;
    public static javax.swing.JLabel datoNaci;
    public static javax.swing.JLabel datoNom;
    private javax.swing.JTextField datoNombreCurso;
    public static javax.swing.JLabel datoProme;
    public static javax.swing.JLabel datoSexo;
    public static javax.swing.JLabel datoTelf;
    private rsbuttom.RSButtonMetro eliminarBoton;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JSpinner numeroCupos;
    private rsbuttom.RSButtonMetro reiniciarLista;
    private javax.swing.JComboBox<String> seleccionCurso;
    private javax.swing.JComboBox<String> seleccionSexo;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JFrame ventanaAgregarDatos;
    private javax.swing.JFrame ventanaFoto;
    // End of variables declaration//GEN-END:variables
}
