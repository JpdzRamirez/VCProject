/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author RojeruSan
 */
public class pnlHome extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    public pnlHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(769, 507));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/home.png"))); // NOI18N
        jLabel7.setText("HOME");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Se quiere crear una aplicación para administrar las ventas de una empresa de\ncomidas rápidas. La empresa cuenta con tres locales a través de los cuales se venden\ntres productos: hamburguesas, empanadas y perros calientes Los precios de los\nproductos son los siguientes: Hamburguesas: $5.000 pesos Empanadas: $800\npesos Perros Calientes: $4.000 pesos La aplicación debe permitir: (1) Registrar una\nventa en alguno de los locales, (2) mostrar la información detallada de cada local\n(Número de Ventas, Cantidad de productos vendidos y el Total en pesos de las ventas\ny (3) mostrar un consolidado total de la información de todos los locales (Total Ventas,\nTotal de Cantidad de productos vendidos y el cálculo del precio promedio por producto\nsegún el total de ventas y el total de cantidad). Adicionalmente, la aplicación debe\npermitir (4) reiniciar los valores de las ventas por local, dejando todos sus valores en\ncero.");
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(" Elabore un applet o un programa usando Java Swing, el cual tome dos números,\nrealizando las operaciones expresadas en los botones de la siguiente manera:\na. Suma el primer y el segundo número, dejando el valor como resultado.\nb. Resta el segundo número del primero, dejando el valor como resultado.\nc. Multiplica el primer y el segundo número, dejando el valor como resultado.\nd. Divide el primer número entre el segundo, dejando el valor como resultado.\ne. Deja la raíz del primer número como resultado.\nf. Deja la raíz del segundo número como resultado.\ng. Deja el valor mayor de ambos números como resultado.\nh. Limpia el contenido de todos los campos. ");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}