/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Cooperativa.GestorDatos;
import Entidades.Salida;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elkin
 */
public class InformeViajes extends javax.swing.JFrame {
private GestorDatos gestor;
    private DefaultTableModel tblModel;

    /**
     * Creates new form InformeSalidas
     */
    public InformeViajes() {
        initComponents();
        this.gestor = GestorDatos.iniciaGestor();
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo(null);
        setTable();
    }

    private LocalDateTime parseDateTime(TimePicker time, DatePicker date) {
        LocalTime hora = null;
        LocalDate fecha = null;
        LocalDateTime horario = null;
        try {
            hora = time.getTime();
            fecha = date.getDate();
            horario = fecha.atTime(hora);
        } catch (Exception e) {
            return null;
        }
        return horario;
    }

    private void setTable() {
        this.tblModel = new DefaultTableModel();
        this.tblModel.addColumn("ID");
        this.tblModel.addColumn("Ocupacion");
        this.jTblBuses.setModel(this.tblModel);
    }

    private float setTable(LocalDateTime t1, LocalDateTime t2) {
        setTable();
        int i = 0;
        float sum = 0;
        this.tblModel = new DefaultTableModel();
        this.tblModel.addColumn("ID");
        this.tblModel.addColumn("Ocupacion");
        for (Salida salida : this.gestor.gestorSalidas.salidas) {
            if (t1 != null && t2 != null && salida.betweenTime(t1, t2)) {
                this.tblModel.addRow(new Object[]{salida.getIDBus(), salida.asientos.getPromedio()});
                sum += salida.asientos.getPromedio();
                i++;
            }
        }
        this.jTblBuses.setModel(this.tblModel);
        return (i <= 0) ? 0 : sum / i;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnl0 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLblFechaInicio = new javax.swing.JLabel();
        jBtnRegresar = new javax.swing.JButton();
        jLblSalidas = new javax.swing.JLabel();
        jDateInicio = new com.github.lgooddatepicker.components.DatePicker();
        jLblFechaFinal = new javax.swing.JLabel();
        jDateFinal = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblBuses = new javax.swing.JTable();
        jTimeInicio = new com.github.lgooddatepicker.components.TimePicker();
        jTimeFinal = new com.github.lgooddatepicker.components.TimePicker();
        jLblOcupacion = new javax.swing.JLabel();
        jLblPromedio = new javax.swing.JLabel();
        jBtnBuscar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPnl0.setBackground(new java.awt.Color(204, 204, 204));
        jPnl0.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viaje.png"))); // NOI18N

        jLblFechaInicio.setText("FECHA INICIO:");
        jLblFechaInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblFechaInicio.setForeground(new java.awt.Color(51, 51, 51));

        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        jBtnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnRegresar.setBorder(null);
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jLblSalidas.setText("INFORME VIAJES");
        jLblSalidas.setFont(new java.awt.Font("Imprint MT Shadow", 1, 55)); // NOI18N

        jLblFechaFinal.setText("FECHA FINAL:");
        jLblFechaFinal.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblFechaFinal.setForeground(new java.awt.Color(51, 51, 51));

        jTblBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblBuses);

        jLblOcupacion.setText("TOTAL:");
        jLblOcupacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblOcupacion.setForeground(new java.awt.Color(51, 51, 51));

        jBtnBuscar.setBackground(new java.awt.Color(255, 255, 204));
        jBtnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jBtnBuscar.setLabel("BUSCAR");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl0Layout = new javax.swing.GroupLayout(jPnl0);
        jPnl0.setLayout(jPnl0Layout);
        jPnl0Layout.setHorizontalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLblSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jBtnRegresar)
                .addGap(14, 14, 14))
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLblFechaInicio))
                            .addGroup(jPnl0Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTimeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblFechaFinal)
                                    .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTimeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                        .addComponent(jLblOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(jLblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        jPnl0Layout.setVerticalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnRegresar))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLblSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLblFechaInicio)
                        .addGap(18, 18, 18)
                        .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTimeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLblFechaFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTimeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblOcupacion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblPromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        getContentPane().add(jPnl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        MenuInforme menu = new MenuInforme();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        LocalDateTime t1 = null;
        LocalDateTime t2 = null;
        try {
            t1 = parseDateTime(this.jTimeInicio, this.jDateInicio);
            t2 = parseDateTime(this.jTimeFinal, this.jDateFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese fechas");
            return;
        }
        float promedioTotal = setTable(t1, t2);
        this.jLblPromedio.setText(Float.toString(promedioTotal) + " %");
    }//GEN-LAST:event_jBtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(InformeViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeViajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button jBtnBuscar;
    private javax.swing.JButton jBtnRegresar;
    private com.github.lgooddatepicker.components.DatePicker jDateFinal;
    private com.github.lgooddatepicker.components.DatePicker jDateInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblFechaFinal;
    private javax.swing.JLabel jLblFechaInicio;
    private javax.swing.JLabel jLblOcupacion;
    private javax.swing.JLabel jLblPromedio;
    private javax.swing.JLabel jLblSalidas;
    private javax.swing.JPanel jPnl0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblBuses;
    private com.github.lgooddatepicker.components.TimePicker jTimeFinal;
    private com.github.lgooddatepicker.components.TimePicker jTimeInicio;
    // End of variables declaration//GEN-END:variables
}
