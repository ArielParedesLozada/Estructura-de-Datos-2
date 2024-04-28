/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Cooperativa.GestorDatos;
import Entidades.Bus;
import javax.swing.JOptionPane;

/**
 *
 * @author elkin
 */
public class MenuBuses extends javax.swing.JFrame {

    protected GestorDatos gestor;

    /**
     * Creates new form MenuBuses
     */
    public MenuBuses() {
        this.gestor = GestorDatos.iniciaGestor();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jLblBuses = new javax.swing.JLabel();
        jLblBus = new javax.swing.JLabel();
        jLblId = new javax.swing.JLabel();
        jTxtID = new javax.swing.JTextField();
        jLblNums = new javax.swing.JLabel();
        jLblPersonas = new javax.swing.JLabel();
        jBtnGuardar = new java.awt.Button();
        jTxtNum = new javax.swing.JTextField();
        jBtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel.setBackground(new java.awt.Color(153, 153, 255));

        jLblBuses.setFont(new java.awt.Font("Imprint MT Shadow", 1, 55)); // NOI18N
        jLblBuses.setText("VEHICULOS - BUSES");

        jLblBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buss.png"))); // NOI18N

        jLblId.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 27)); // NOI18N
        jLblId.setForeground(new java.awt.Color(51, 51, 51));
        jLblId.setText("IDENTIFICADOR:");

        jTxtID.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N

        jLblNums.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 27)); // NOI18N
        jLblNums.setForeground(new java.awt.Color(51, 51, 51));
        jLblNums.setText("CAPACIDAD TOTAL:");

        jLblPersonas.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 25)); // NOI18N
        jLblPersonas.setText("PERSONAS");

        jBtnGuardar.setBackground(new java.awt.Color(255, 255, 204));
        jBtnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jBtnGuardar.setLabel("GUARDAR");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jTxtNum.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jTxtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNumKeyTyped(evt);
            }
        });

        jBtnRegresar.setBackground(new java.awt.Color(153, 153, 255));
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        jBtnRegresar.setBorder(null);
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLblBus)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblId)
                            .addComponent(jLblNums))
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jTxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblPersonas)
                                .addGap(56, 56, 56))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLblBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnRegresar)
                .addGap(14, 14, 14))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnRegresar)
                    .addComponent(jLblBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLblBus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblId)
                            .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblPersonas)
                            .addComponent(jLblNums)
                            .addComponent(jTxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        getContentPane().add(JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        Bus bus = null;
        try {
            String idBus = this.jTxtID.getText().trim();
            String numStr = this.jTxtNum.getText().trim();
            // Verifica si alguno de los campos está vacío
            if (idBus.isEmpty() || numStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar ambos campos para crear el bus.");
                return;
            }
            int num = Integer.parseInt(numStr);
            bus = new Bus(idBus, num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La capacidad debe ser un número entero.");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el bus");
            return;
        }
        if (!this.gestor.addBus(bus)) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el bus, puede que ya exista un bus con ese identificador.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Se añadió el bus al gestor");
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jTxtNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNumKeyTyped
        if (this.jTxtNum.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTxtNumKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private java.awt.Button jBtnGuardar;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLblBus;
    private javax.swing.JLabel jLblBuses;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNums;
    private javax.swing.JLabel jLblPersonas;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNum;
    // End of variables declaration//GEN-END:variables
}
