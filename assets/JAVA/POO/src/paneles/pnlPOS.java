/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author doble
 */
public class pnlPOS extends javax.swing.JPanel {

    /**
     * Creates new form pnlPOS
     */
    public pnlPOS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LetreroLabel = new javax.swing.JPanel();
        Letrero = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Listado = new javax.swing.JTree();
        ProgressBar = new javax.swing.JProgressBar();
        ContadorBar = new javax.swing.JSpinner();
        ProgressbarLabel = new javax.swing.JLabel();
        PanelImg = new javax.swing.JPanel();
        ImagenPNL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ImagenMenu = new javax.swing.JLabel();
        Categoría = new javax.swing.JLabel();
        Generar = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        LetreroLabel.setBackground(new java.awt.Color(255, 102, 102));

        Letrero.setBackground(new java.awt.Color(255, 255, 255));
        Letrero.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Letrero.setForeground(new java.awt.Color(255, 255, 255));
        Letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/datafono.png"))); // NOI18N
        Letrero.setText("POS VENTAS");

        javax.swing.GroupLayout LetreroLabelLayout = new javax.swing.GroupLayout(LetreroLabel);
        LetreroLabel.setLayout(LetreroLabelLayout);
        LetreroLabelLayout.setHorizontalGroup(
            LetreroLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LetreroLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Letrero, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LetreroLabelLayout.setVerticalGroup(
            LetreroLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetreroLabelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Letrero)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("MENU");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SEDE SAN ALONSO");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("HAMBURGUESA");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PERRO");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EMPANADA");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SEDE SAN FRANCISCO");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("HELADO");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MALTEADA");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CAFES");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SEDE CABECERA");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PIZZA");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PANCEROTI");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TALLARINES");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        Listado.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Listado.setScrollsOnExpand(false);
        Listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Listado);

        ProgressbarLabel.setText("Waiting");

        PanelImg.setBackground(new java.awt.Color(255, 204, 102));

        ImagenPNL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ImagenPNL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenPNL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ImagenPNL.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ImagenPNLPropertyChange(evt);
            }
        });

        jScrollPane1.setViewportView(ImagenMenu);

        javax.swing.GroupLayout PanelImgLayout = new javax.swing.GroupLayout(PanelImg);
        PanelImg.setLayout(PanelImgLayout);
        PanelImgLayout.setHorizontalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelImgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImagenPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(22, 22, 22))
        );
        PanelImgLayout.setVerticalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelImgLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(ImagenPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29))
        );

        Categoría.setBackground(new java.awt.Color(0, 0, 0));
        Categoría.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Categoría.setForeground(new java.awt.Color(255, 204, 102));
        Categoría.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Generar.setText("Generar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LetreroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProgressbarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(PanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ContadorBar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Categoría, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 173, Short.MAX_VALUE)
                        .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LetreroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(ContadorBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 245, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Categoría, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(PanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProgressbarLabel)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadoMouseClicked
        String opcion;
        int index;
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Listado.getSelectionPath().getLastPathComponent();

        opcion = selectedNode.getUserObject().toString();
        
        
        switch (opcion) {
            case "HAMBURGUESA":
                
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HamburguesaM.png")));
                ImagenPNL.setText("Hamburguesa Doble carne con papas");
                Categoría.setText("Sede San Alonso");
                
                break;

            case "PERRO":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Perro.png")));
                ImagenPNL.setText("Perro caliente Americano");
                Categoría.setText("Sede San Alonso");
                
                break;
            case "EMPANADA":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/empanada.png")));
                ImagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MENUemp.jpg")));
                ImagenPNL.setText("Empanadas Mixtas y Pollo");
                Categoría.setText("Sede San Alonso");
                
                break;
                
            // Sede 2 parametros    
            case "HELADO":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/helado.png")));
                
                ImagenPNL.setText("Deliciosos Helados de la Casa");
                Categoría.setText("Sede San Francisco");
               
                break;   
            case "MALTEADA":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/malteada.png")));
                ImagenPNL.setText("Deliciosos Malteadas");
                Categoría.setText("Sede San Francisco");
               
                break;  
             case "CAFES":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cafe.png")));
                ImagenPNL.setText("Deliciosos Cafes");
                Categoría.setText("Sede San Francisco");
               
                break;     
                 // Sede 3 parametros      
  
 
  
            case "PIZZA":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pizza.png")));
                
                ImagenPNL.setText("Deliciosos pizzas");
                Categoría.setText("Sede Cabecera");
               
                break;   
            case "PANCEROTI":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/panceroti.png")));
                ImagenPNL.setText("Deliciosos Pancerotis Italianos");
                Categoría.setText("Sede Cabecera");
               
                break;  
             case "TALLARINES":
                ImagenPNL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tallarines.png")));
                ImagenPNL.setText("Deliciosos Helados de la Casa");
                Categoría.setText("Sede Cabecera");
               
                break;     
            default:
                System.out.println("no match");
        }

    }//GEN-LAST:event_ListadoMouseClicked

    private void ImagenPNLPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ImagenPNLPropertyChange
        // TODO dd ure here:
    }//GEN-LAST:event_ImagenPNLPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoría;
    private javax.swing.JSpinner ContadorBar;
    private rsbuttom.RSButtonMetro Generar;
    private javax.swing.JLabel ImagenMenu;
    private javax.swing.JLabel ImagenPNL;
    private javax.swing.JLabel Letrero;
    private javax.swing.JPanel LetreroLabel;
    private javax.swing.JTree Listado;
    private javax.swing.JPanel PanelImg;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel ProgressbarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
