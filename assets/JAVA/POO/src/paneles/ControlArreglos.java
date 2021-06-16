/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;


/**
 *
 * @author Jeremy Pedraza
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlArreglos implements ActionListener {

    private Arreglos formulario;
    private Estudiante eTemp;
    private List<Estudiante> listaPersonas;
    private DefaultTableModel modeloTabla;
    private String[] cabeceraTabla;
    private String[] filaTabla;

    public ControlArreglos() {
        this.formulario = new Arreglos();
        this.modeloTabla = new DefaultTableModel();
        iniciarTabla();
        this.listaPersonas = new ArrayList<Estudiante>(2);
        this.formulario.setIconImage(new ImageIcon(getClass().getResource("Software.png")).getImage());
        this.formulario.getBtnAñadirDatos().addActionListener(this);
        this.formulario.getBtnAceptarDatos().addActionListener(this);
        this.formulario.getBtnAceptarInstructivo().addActionListener(this);
        this.formulario.getBtnCrearLista().addActionListener(this);
        this.formulario.getBtnCambiarFoto().addActionListener(this);
        this.formulario.getBtnReiniciarLista().addActionListener(this);
        this.formulario.getCbxCurso().addActionListener(this);

    }

    public void iniciar() {
        if (formulario == null) {
            formulario = new Arreglos();
            formulario.setVisible(true);
        } else {
            formulario.setVisible(true);
        }
    }

    private void iniciarTabla() {
        cabeceraTabla = new String[2];
        cabeceraTabla[0] = "ID.";
        cabeceraTabla[1] = "Nombres y Apellidos";
      //  cabeceraTabla[2] = "Identificación";
       // cabeceraTabla[3] = "Teléfono";
       // cabeceraTabla[4] = "Edad";
       // cabeceraTabla[5] = "Programa";
        //modeloTabla.setColumnIdentifiers(cabeceraTabla);
        formulario.getTblEstudiantes().setModel(modeloTabla);
    }

    private Object[] crearFila(Estudiante p, int indice) {
        filaTabla = new String[2];
        filaTabla[0] = (indice + 1) + "";
        filaTabla[1] = p.getNombre() + " " + p.getApellido();
        
        /**filaTabla[2] = p.getIdentificacion();
        filaTabla[3] = p.getTelefono();
        filaTabla[4] = String.valueOf(p.getEdad());
        filaTabla[5] = p.getPrograma();
        **/
        
        return filaTabla;
    }

    private Estudiante obtenerPersona() {
        int pivote;
        pivote= formulario.getCbxCurso().getSelectedIndex();
        eTemp = new Estudiante();
        eTemp.setNombre(formulario.getAdicionalesNombre().getText(),formulario.getAdicionalesApellido().getText());
        eTemp.setId(Integer.valueOf(formulario.getAdicionalesId().getText()));
        eTemp.setTelefono(formulario.getAdicionalesTelf().getText());
        eTemp.setDireccion(formulario.getAdicionalesDir().getText());
        eTemp.setEdad(formulario.getAdicionalesEdad().getText());
        eTemp.setSexo(formulario.getCbxSexo().getSelectedItem().toString());
        eTemp.setCurso(formulario.getCbxCurso().getItemAt(pivote));
        eTemp.setNacimiento(formulario.getAdicionalesFecha().getDatoFecha());
        
        return eTemp;
    }

    private Estudiante obtPersonaLista(String id) {
        Estudiante salida = null;
        for (Estudiante p : listaPersonas) {
            if (String.valueOf(p.getId()).equals(id)) {
                salida = p;
                break;
            }
        }
        return salida;
    }

    private void limpiarCampos() {
        formulario.getAdicionalesNombre().setText("");
        formulario.getAdicionalesApellido().setText("");
        formulario.getAdicionalesId().setText("");
        formulario.getAdicionalesTelf().setText("");
        formulario.getAdicionalesDir().setText("");
        formulario.getAdicionalesEdad().setText("");
        formulario.getCbxSexo().setSelectedIndex(0);
        formulario.getDatoNombreCurso().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formulario.getBtnAceptarDatos()) {
            eTemp = obtenerPersona();
            listaPersonas.add(eTemp);
            modeloTabla.addRow(crearFila(eTemp, listaPersonas.indexOf(eTemp)));
            formulario.getTblEstudiantes().setModel(modeloTabla);
            limpiarCampos();
            eTemp = null;
        } else if (e.getSource() == formulario.getBtnReiniciarLista()) {
            limpiarCampos();
        } else if (e.getSource() == formulario.getBtnEliminar()) {
            String id = JOptionPane.showInputDialog(
                    formulario.getRootPane(),
                    "Ingrese la identificación de la persona que desea eliminar",
                    "Eliminación de asistentes",
                    JOptionPane.WARNING_MESSAGE);
            eTemp = obtPersonaLista(id);
            if (eTemp == null) {
                JOptionPane.showMessageDialog(formulario.getRootPane(),
                        "La persona que ingresó no se encuentra registrada",
                        "Eliminación de asistentes",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                int confirmacionEliminacion = JOptionPane.showConfirmDialog(
                        formulario.getRootPane(),
                        "¿Está seguro que desea eliminar la persona " + eTemp.getNombre() + " " + eTemp.getApellido() + "?",
                         "Eliminación de asistentes",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (confirmacionEliminacion == 0) {
                    int index = listaPersonas.indexOf(eTemp);
                    listaPersonas.remove(eTemp);
                    modeloTabla.removeRow(index);
                    formulario.getTblEstudiantes().setModel(modeloTabla);
                }
            }
        }
    }
}