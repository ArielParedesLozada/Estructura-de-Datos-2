/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Cooperativa.GestorDatos;
import Entidades.Bus;
import Entidades.Salida;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author elkin
 */
public class MenuViajes extends javax.swing.JFrame {

    private DefaultComboBoxModel bmxModel;
    private GestorDatos gestor;

    /**
     * Creates new form MenuViajes
     */
    public MenuViajes() {
        this.gestor = GestorDatos.iniciaGestor();
        initComponents();
        setBmx();
        setLocationRelativeTo(null);
    }

    private void setBmx() {
        this.bmxModel = new DefaultComboBoxModel<>();
        for (Bus bus : this.gestor.gestorBuses.buses) {
            this.bmxModel.addElement(bus.id);
        }
        this.jBmxBus.setModel(bmxModel);
    }

    private LocalDateTime parseDateTimeInicio() {
        LocalTime hora = this.jBmxHoraSalida.getTime();
        LocalDate fecha = this.jBmxFecha.getDate();
        if (hora == null || fecha == null) {
            JOptionPane.showMessageDialog(null, "La hora o la fecha no están establecidas.");
            return null; // Retorna null para evitar seguir adelante con valores no válidos.
        }
        return fecha.atTime(hora);
    }

    private LocalDateTime parseDateTimeFinal() {
        LocalTime hora = this.jBmxHoraLlegada.getTime();
        LocalDate fecha = this.jBmxFecha.getDate();
        if (hora == null || fecha == null) {
            JOptionPane.showMessageDialog(null, "La hora o la fecha no están establecidas.");
            return null; // Retorna null para evitar seguir adelante con valores no válidos.
        }
        return fecha.atTime(hora);
    }

    private Bus selectBus() {
        String id = (String) this.jBmxBus.getSelectedItem();
        if (id == null) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un bus.");
            return null; // Retorna null para evitar seguir adelante con valores no válidos.
        }
        Bus bus = this.gestor.gestorBuses.buses.find(id);
        if (bus == null) {
            JOptionPane.showMessageDialog(null, "El bus seleccionado no existe.");
        }
        return bus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblImagen = new javax.swing.JLabel();
        jBmxBus = new javax.swing.JComboBox<>();
        jBmxFecha = new com.github.lgooddatepicker.components.DatePicker();
        jBmxHoraSalida = new com.github.lgooddatepicker.components.TimePicker();
        jPnl0 = new javax.swing.JPanel();
        jLblDestino = new javax.swing.JLabel();
        jTxtDestino = new javax.swing.JTextField();
        jLblBus = new javax.swing.JLabel();
        jLblFecha = new javax.swing.JLabel();
        jLblHoraSalida = new javax.swing.JLabel();
        jLblSalida = new javax.swing.JLabel();
        jBtnRegresar = new javax.swing.JButton();
        jBtnGuardar = new java.awt.Button();
        jBmxHoraLlegada = new com.github.lgooddatepicker.components.TimePicker();
        jLblHoraLlegada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viaje.png"))); // NOI18N
        getContentPane().add(jLblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 143, -1, -1));

        jBmxBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Bus", "Item 2", "Item 3", "Item 4" }));
        jBmxBus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jBmxBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 108, -1, -1));
        getContentPane().add(jBmxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 211, 249, 38));
        getContentPane().add(jBmxHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 262, 104, 38));

        jPnl0.setBackground(new java.awt.Color(153, 153, 255));
        jPnl0.setForeground(new java.awt.Color(153, 153, 255));

        jLblDestino.setText("DESTINO:");
        jLblDestino.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblDestino.setForeground(new java.awt.Color(51, 51, 51));

        jTxtDestino.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N

        jLblBus.setText("BUS ASIGNADO:");
        jLblBus.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblBus.setForeground(new java.awt.Color(51, 51, 51));

        jLblFecha.setText("FECHA:");
        jLblFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblFecha.setForeground(new java.awt.Color(51, 51, 51));

        jLblHoraSalida.setText("HORA SALIDA:");
        jLblHoraSalida.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblHoraSalida.setForeground(new java.awt.Color(51, 51, 51));

        jLblSalida.setText("VIAJES - SALIDAS");
        jLblSalida.setFont(new java.awt.Font("Imprint MT Shadow", 1, 55)); // NOI18N

        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        jBtnRegresar.setBackground(new java.awt.Color(153, 153, 255));
        jBtnRegresar.setBorder(null);
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jBtnGuardar.setBackground(new java.awt.Color(255, 255, 204));
        jBtnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jBtnGuardar.setLabel("GUARDAR");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jLblHoraLlegada.setText("HORA LLEGADA:");
        jLblHoraLlegada.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 25)); // NOI18N
        jLblHoraLlegada.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPnl0Layout = new javax.swing.GroupLayout(jPnl0);
        jPnl0.setLayout(jPnl0Layout);
        jPnl0Layout.setHorizontalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLblSalida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jBtnRegresar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblHoraSalida)
                            .addComponent(jLblFecha)
                            .addComponent(jLblDestino)
                            .addComponent(jLblBus)
                            .addComponent(jLblHoraLlegada))
                        .addGap(18, 18, 18)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBmxHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(125, 125, 125))
        );
        jPnl0Layout.setVerticalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegresar))
                .addGap(9, 9, 9)
                .addComponent(jLblBus)
                .addGap(18, 18, 18)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblDestino))
                .addGap(18, 18, 18)
                .addComponent(jLblFecha)
                .addGap(18, 18, 18)
                .addComponent(jLblHoraSalida)
                .addGap(18, 18, 18)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblHoraLlegada)
                    .addComponent(jBmxHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPnl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        try {
            // Obtén el destino y las horas de salida y llegada del viaje.
            String busId = (String) jBmxBus.getSelectedItem();
            if (busId.equals("Seleccione un Bus")) {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un bus.");
                return;
            }

            String destino = this.jTxtDestino.getText();
            LocalDateTime horaSalida = parseDateTimeInicio(); // Utiliza jBmxHoraSalida
            LocalDateTime horaLlegada = parseDateTimeFinal(); // Utiliza jBmxHoraLlegada

            // Verifica que las fechas y horas estén correctamente establecidas.
            if (horaSalida == null || horaLlegada == null || horaSalida.isAfter(horaLlegada)) {
                JOptionPane.showMessageDialog(null, "Por favor, verifica que las fechas y horas estén correctas y que la hora de salida sea antes de la hora de llegada.");
                return;
            }
            if (horaSalida.isEqual(horaLlegada)) {
                JOptionPane.showMessageDialog(null, "La hora de salida y de llegada no pueden ser iguales.");
                return;
            } else if (horaSalida.isAfter(horaLlegada)) {
                JOptionPane.showMessageDialog(null, "La hora de salida debe ser antes de la hora de llegada.");
                return;
            } else if (horaLlegada.minusHours(1).isBefore(horaSalida)) {
                JOptionPane.showMessageDialog(null, "La salida y llegada deben tener al menos una hora de diferencia.");
                return;
            }

            // Selecciona el bus y verifica su validez.
            Bus bus = selectBus(); // Utiliza el método selectBus
            if (bus == null) {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un bus válido.");
                return;
            }
            Salida nuevaSalida = new Salida(destino, horaSalida, horaLlegada, bus);

            // Verifica si se puede añadir la nueva salida sin conflictos de horario.
            if (!this.gestor.gestorSalidas.addSalida(nuevaSalida)) {
                JOptionPane.showMessageDialog(null, "Ya existe un viaje programado para este bus en el rango horario especificado.");
                return;
            }

            // Confirma que la nueva salida se ha añadido correctamente.
            JOptionPane.showMessageDialog(null, "La salida ha sido añadida exitosamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear la salida: ");
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed


    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuViajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBmxBus;
    private com.github.lgooddatepicker.components.DatePicker jBmxFecha;
    private com.github.lgooddatepicker.components.TimePicker jBmxHoraLlegada;
    private com.github.lgooddatepicker.components.TimePicker jBmxHoraSalida;
    private java.awt.Button jBtnGuardar;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLblBus;
    private javax.swing.JLabel jLblDestino;
    private javax.swing.JLabel jLblFecha;
    private javax.swing.JLabel jLblHoraLlegada;
    private javax.swing.JLabel jLblHoraSalida;
    private javax.swing.JLabel jLblImagen;
    private javax.swing.JLabel jLblSalida;
    private javax.swing.JPanel jPnl0;
    private javax.swing.JTextField jTxtDestino;
    // End of variables declaration//GEN-END:variables
}
