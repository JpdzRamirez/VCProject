/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import java.util.*;
/**
 *
 * @author doble
 */
public class pnlHerramientas extends javax.swing.JPanel {

    /**
     * Creates new form pnlHerramientas
     */
    public pnlHerramientas() {
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

        jPanel1 = new javax.swing.JPanel();
        Title_Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Primer_Label = new javax.swing.JLabel();
        Segundo_Label = new javax.swing.JLabel();
        Primer = new javax.swing.JTextField();
        Segundo = new javax.swing.JTextField();
        Lista = new javax.swing.JComboBox<>();
        Calcular = new rsbuttom.RSButtonMetro();
        Resultado_Label = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));

        Title_Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title_Label.setForeground(new java.awt.Color(255, 255, 255));
        Title_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Herramientas.png"))); // NOI18N
        Title_Label.setText("HERRAMIENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        Primer_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Primer_Label.setText("Primer Numero");

        Segundo_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Segundo_Label.setText("Segundo Numero");

        Primer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimerActionPerformed(evt);
            }
        });

        Lista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A. Suma el primer y el segundo número dejando el valor como resultado.", "B. Resta el segundo número del primero dejando el valor como resultado.", "C. Multiplica el primer y el segundo número dejando el valor como resultado.", "D. Divide el primer número entre el segundo dejando el valor como resultado .", "E. Deja la raíz del primer número como resultado.", "F. Deja la raíz del segundo número como resultado.", "G. Deja el valor mayor de ambos números como resultado.", "H. Limpia el contenido de todos los campos." }));
        Lista.setBorder(null);

        Calcular.setBackground(new java.awt.Color(255, 255, 255));
        Calcular.setForeground(new java.awt.Color(0, 0, 0));
        Calcular.setText("Calcular");
        Calcular.setColorHover(new java.awt.Color(51, 153, 255));
        Calcular.setColorNormal(new java.awt.Color(255, 255, 255));
        Calcular.setColorPressed(new java.awt.Color(204, 204, 204));
        Calcular.setColorTextHover(new java.awt.Color(0, 0, 0));
        Calcular.setColorTextNormal(new java.awt.Color(0, 0, 0));
        Calcular.setColorTextPressed(new java.awt.Color(0, 0, 0));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Resultado_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resultado_Label.setText("Resultado");

        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Primer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Primer_Label))
                        .addGap(189, 189, 189)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Segundo_Label)
                            .addComponent(Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Resultado_Label)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Primer_Label)
                    .addComponent(Segundo_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Primer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado_Label))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void PrimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrimerActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        int index=Lista.getSelectedIndex();
        String resultado="";
        Double primero,segundo;
        
        switch(index)
{
   // declaración case
   // los valores deben ser del mismo tipo de la expresión
   case 0 :
        primero= Double.parseDouble(Primer.getText());
        segundo= Double.parseDouble(Segundo.getText());
        resultado=String.valueOf(primero+segundo);
        Resultado.setText(resultado);
      break; // break es opcional
   
   case 1 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
        resultado=String.valueOf(primero-segundo);
        Resultado.setText(resultado);
      break; // break es opcional
   
    case 2 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
        resultado=String.valueOf(primero*segundo);
        Resultado.setText(resultado);
      break; // break es opcional
      case 3 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
        resultado=String.valueOf(primero*segundo);
        Resultado.setText(resultado);
      break; // break es opcional
      case 4 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
        resultado=String.valueOf(primero/segundo);
        Resultado.setText(resultado);
      break; // break es opcional
       case 5 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
      
        resultado=String.valueOf(Math.sqrt(primero));
        Resultado.setText(resultado);
      break; // break es opcional
        case 6 :
      primero= Double.parseDouble(Primer.getText());
      segundo= Double.parseDouble(Segundo.getText());
      
        resultado=String.valueOf(Math.sqrt(segundo));
        Resultado.setText(resultado);
      break; // break es opcional
       case 7 :
      Primer.setText("");
        Resultado.setText("");
        Segundo.setText("");
      break; // break es opcional
      
}
        
        
    }//GEN-LAST:event_CalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro Calcular;
    private javax.swing.JComboBox<String> Lista;
    private javax.swing.JTextField Primer;
    private javax.swing.JLabel Primer_Label;
    private javax.swing.JTextField Resultado;
    private javax.swing.JLabel Resultado_Label;
    private javax.swing.JTextField Segundo;
    private javax.swing.JLabel Segundo_Label;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
