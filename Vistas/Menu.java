package Vistas;

import Cooperativa.GestorDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Elkinnn
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPnl0 = new javax.swing.JPanel();
        jLblMenu = new javax.swing.JLabel();
        jBtnBuses = new javax.swing.JButton();
        jBtnBoletos = new javax.swing.JButton();
        jBtnSalidas = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnl0.setBackground(new java.awt.Color(204, 204, 204));
        jPnl0.setForeground(new java.awt.Color(204, 204, 204));

        jLblMenu.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLblMenu.setText("MENU PRINCIPAL");

        jBtnBuses.setBackground(new java.awt.Color(204, 204, 255));
        jBtnBuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconovh.png"))); // NOI18N
        jBtnBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBusesActionPerformed(evt);
            }
        });

        jBtnBoletos.setBackground(new java.awt.Color(204, 204, 255));
        jBtnBoletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconovs.png"))); // NOI18N
        jBtnBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBoletosActionPerformed(evt);
            }
        });

        jBtnSalidas.setBackground(new java.awt.Color(204, 204, 255));
        jBtnSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/iconovj.png"))); // NOI18N
        jBtnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalidasActionPerformed(evt);
            }
        });

        jBtnSalir.setBackground(new java.awt.Color(255, 255, 204));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/EXIT.png"))); // NOI18N
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl0Layout = new javax.swing.GroupLayout(jPnl0);
        jPnl0.setLayout(jPnl0Layout);
        jPnl0Layout.setHorizontalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnSalir)
                .addGap(18, 18, 18)
                .addComponent(jLblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jBtnBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jBtnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jBtnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPnl0Layout.setVerticalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnSalir))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLblMenu)))
                .addGap(41, 41, 41)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jBtnBusesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        MenuBuses mb = new MenuBuses();
        mb.setVisible(true);
        this.dispose();
    }                                         

    private void jBtnBoletosActionPerformed(java.awt.event.ActionEvent evt) {                                            
        MenuUsuarios mu = new MenuUsuarios();
        mu.setVisible(true);
        this.dispose();
    }                                           

    private void jBtnSalidasActionPerformed(java.awt.event.ActionEvent evt) {                                            
        MenuViajes mv = new MenuViajes();
        mv.setVisible(true);
        this.dispose();;
    }                                           

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtnBoletos;
    private javax.swing.JButton jBtnBuses;
    private javax.swing.JButton jBtnSalidas;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblMenu;
    private javax.swing.JPanel jPnl0;
    // End of variables declaration                   
}
