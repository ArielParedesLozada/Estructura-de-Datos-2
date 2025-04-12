/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Cooperativa.BaseUI.VentanaAnimada;
import Cooperativa.GestorDatos;
import Entidades.Salida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elkin
 */
public class InformeBoletos extends VentanaAnimada {

    private GestorDatos gestor;

    /**
     * Creates new form InformeBoletos
     */
    public InformeBoletos() {
        this.gestor = GestorDatos.iniciaGestor();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //Método para obtener las salidas del registro y setear la tabla. Eficiente
    private void setTable(String id) {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.addColumn("ID Bus");
        tblModel.addColumn("Destino");
        tblModel.addColumn("Hora salida");
        tblModel.addColumn("Hora Llegada");
        for (Salida salida : this.gestor.gestorRegistro.registro.getValues(id)) {//Se busac en la tablaHash del registro. Tiene al usuario y sus salidas asociadas
            tblModel.addRow(new Object[]{salida.getIDBus(), salida.destino, salida.horaSalida.toString(), salida.horaLlegada.toString()});
        }
        this.jTblPersonas.setModel(tblModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnBuscar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnRegresar = new javax.swing.JButton();
        jLblPersonas = new javax.swing.JLabel();
        jLblID1 = new javax.swing.JLabel();
        jLblNum = new javax.swing.JLabel();
        jLblTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblPersonas = new javax.swing.JTable();
        jTxtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnBuscar.setBackground(new java.awt.Color(255, 255, 204));
        jBtnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jBtnBuscar.setLabel("BUSCAR");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 434, 157, 54));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 55)); // NOI18N
        jLabel1.setText("INFORME PERSONAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, -1, 96));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jBtnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        jBtnRegresar.setBorder(null);
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jLblPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.png"))); // NOI18N

        jLblID1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblID1.setForeground(new java.awt.Color(51, 51, 51));
        jLblID1.setText("ID PASAJERO:");

        jLblNum.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N

        jLblTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblTotal.setForeground(new java.awt.Color(51, 51, 51));
        jLblTotal.setText("TOTAL:");

        jTblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Bus", "Destino", "Hora Salida", "Hora Llegada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTblPersonas);

        jTxtID.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jTxtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLblTotal)
                        .addGap(38, 38, 38)
                        .addComponent(jLblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblPersonas)
                            .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLblID1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnRegresar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLblPersonas)
                        .addGap(29, 29, 29)
                        .addComponent(jLblID1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 114, 494, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        String pasajeroID = jTxtID.getText().trim(); // Obtiene el ID del pasajero
        try {
            setTable(pasajeroID);
            int total = this.gestor.gestorRegistro.registro.sizeValues(pasajeroID);
            this.jLblNum.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Id no registrado");
        }
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        MenuInforme menu = new MenuInforme();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jTxtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIDKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) { // Si el carácter no es un dígito...
            evt.consume(); // ...consume el evento para que no se agregue al texto.
        } else if (jTxtID.getText().length() >= 10) { // Si ya hay 10 dígitos...
            evt.consume(); // ...consume el evento para que no se agregue más.
        }
    }//GEN-LAST:event_jTxtIDKeyTyped

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
            java.util.logging.Logger.getLogger(InformeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button jBtnBuscar;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblID1;
    private javax.swing.JLabel jLblNum;
    private javax.swing.JLabel jLblPersonas;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblPersonas;
    private javax.swing.JTextField jTxtID;
    // End of variables declaration//GEN-END:variables
}
