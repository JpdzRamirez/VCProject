/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author doble
 */
public class InfoPOS extends javax.swing.JPanel {

    /**
     * Creates new form InfoPOS
     */
    public InfoPOS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextPane1.setText("\n\nElabore un applet o un programa usando Java Swing, el cual tome dos números,realizando las operaciones expresadas en los botones de la siguiente manera:\na. Suma el primer y el segundo número, dejando el valor como resultado.\nb. Resta el segundo número del primero, dejando el valor como resultado.\nc. Multiplica el primer y el segundo número, dejando el valor como resultado.\nd. Divide el primer número entre el segundo, dejando el valor como resultado.\ne. Deja la raíz del primer número como resultado.\nf. Deja la raíz del segundo número como resultado.\ng. Deja el valor mayor de ambos números como resultado.\nh. Limpia el contenido de todos los campos.");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   
}