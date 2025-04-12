/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Cooperativa.BaseUI.VentanaAnimada;
import Vistas.MenuBuses;
import Vistas.MenuInforme;
import Vistas.MenuViajes;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author elkin
 */
public class MenuPrincipal extends VentanaAnimada {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        interfazMejoras();
    }

    private void interfazMejoras() {
        // Fondo general
        jPnl0.setBackground(new Color(173, 216, 230)); // Azul claro

        // Botones con hover
        aplicarHoverBoton(jBtnBoletos, new Color(230, 230, 250), new Color(255, 241, 150));
        aplicarHoverBoton(jBtnBuses, new Color(230, 230, 250), new Color(255, 241, 150));
        aplicarHoverBoton(jBtnInformes, new Color(230, 230, 250), new Color(255, 241, 150));
        aplicarHoverBoton(jBtnSalidas, new Color(230, 230, 250), new Color(255, 241, 150));
        aplicarHoverBoton(jBtnSalir, new Color(255, 200, 200), new Color(255, 100, 100)); // botón salir más rojo

        // Título con zoom y color
        aplicarHoverZoom(
                jLblMenu,
                4,
                new Font("Arial Black", Font.BOLD, 51),
                new Font("Arial Black", Font.BOLD, 54),
                Color.BLACK,
                new Color(255, 204, 0)
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblMenu = new javax.swing.JLabel();
        jBtnInformes = new javax.swing.JButton();
        jPnl0 = new javax.swing.JPanel();
        jBtnSalir = new javax.swing.JButton();
        jBtnBuses = new javax.swing.JButton();
        jBtnBoletos = new javax.swing.JButton();
        jBtnSalidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblMenu.setFont(new java.awt.Font("Imprint MT Shadow", 1, 55)); // NOI18N
        jLblMenu.setText("MENU PRINCIPAL");
        getContentPane().add(jLblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 22, 555, 96));

        jBtnInformes.setBackground(new java.awt.Color(153, 153, 255));
        jBtnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informe.png"))); // NOI18N
        jBtnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInformesActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 176, 165, 171));

        jPnl0.setBackground(new java.awt.Color(102, 153, 255));
        jPnl0.setForeground(new java.awt.Color(153, 153, 255));

        jBtnSalir.setBackground(new java.awt.Color(102, 153, 255));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        jBtnSalir.setBorder(null);
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnBuses.setBackground(new java.awt.Color(153, 153, 255));
        jBtnBuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buses.png"))); // NOI18N
        jBtnBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBusesActionPerformed(evt);
            }
        });

        jBtnBoletos.setBackground(new java.awt.Color(153, 153, 255));
        jBtnBoletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boletos.png"))); // NOI18N
        jBtnBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBoletosActionPerformed(evt);
            }
        });

        jBtnSalidas.setBackground(new java.awt.Color(153, 153, 255));
        jBtnSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Viajes.png"))); // NOI18N
        jBtnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl0Layout = new javax.swing.GroupLayout(jPnl0);
        jPnl0.setLayout(jPnl0Layout);
        jPnl0Layout.setHorizontalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSalir)
                .addContainerGap())
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jBtnBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jBtnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jBtnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPnl0Layout.setVerticalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addComponent(jBtnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(jBtnBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPnl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInformesActionPerformed
        MenuInforme mi = new MenuInforme();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnInformesActionPerformed

    private void jBtnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalidasActionPerformed
        MenuViajes mv = new MenuViajes();
        mv.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_jBtnSalidasActionPerformed

    private void jBtnBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBoletosActionPerformed
        MenuBoletos mu = new MenuBoletos();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnBoletosActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        animarCierre(() -> System.exit(0));
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBusesActionPerformed
        MenuBuses mb = new MenuBuses();
        mb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnBusesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBoletos;
    private javax.swing.JButton jBtnBuses;
    private javax.swing.JButton jBtnInformes;
    private javax.swing.JButton jBtnSalidas;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblMenu;
    private javax.swing.JPanel jPnl0;
    // End of variables declaration//GEN-END:variables
}
