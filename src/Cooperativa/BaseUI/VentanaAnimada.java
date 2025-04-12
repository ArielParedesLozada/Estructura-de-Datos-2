/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cooperativa.BaseUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author diego
 */
public abstract class VentanaAnimada extends JFrame {

    public VentanaAnimada() {
        setUndecorated(true);
        setOpacity(0f);
        setLocationRelativeTo(null);
        animarApertura();
    }

    protected void animarApertura() {
        Timer timer = new Timer(20, null);
        timer.addActionListener(new ActionListener() {
            float opacidad = 0f;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacidad += 0.05f;
                if (opacidad >= 1f) {
                    opacidad = 1f;
                    ((Timer) e.getSource()).stop();
                }
                setOpacity(opacidad);
            }
        });
        timer.start();
    }

    protected void animarCierre(Runnable despuesDeCerrar) {
        Timer timer = new Timer(20, null);
        timer.addActionListener(new ActionListener() {
            float opacidad = 1f;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacidad -= 0.05f;
                if (opacidad <= 0f) {
                    opacidad = 0f;
                    ((Timer) e.getSource()).stop();
                    setOpacity(opacidad);
                    dispose();
                    if (despuesDeCerrar != null) {
                        despuesDeCerrar.run();
                    }
                } else {
                    setOpacity(opacidad);
                }
            }
        });
        timer.start();
    }

    protected void aplicarHoverBoton(java.awt.Component boton, Color normal, Color hover) {
        boton.setBackground(normal);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                boton.setBackground(hover);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                boton.setBackground(normal);
            }
        });
    }

    protected void aplicarHoverZoom(JLabel label, int aumento, Font fontNormal, Font fontHover, Color colorNormal, Color colorHover) {
        label.setFont(fontNormal);
        label.setForeground(colorNormal);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                label.setFont(fontHover);
                label.setForeground(colorHover);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                label.setFont(fontNormal);
                label.setForeground(colorNormal);
            }
        });
    }
}
