/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat.kuis;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame1 extends JFrame {
    public Frame1() {
        setTitle("Pilihan Kendaraan");
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 150));

        JButton motorButton = new JButton("Motor");
        JButton mobilButton = new JButton("Mobil");
        JButton sepedaButton = new JButton("Sepeda");

        motorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Frame2(new Motor());
            }
        });

        mobilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Frame2(new Mobil());
            }
        });
        
        sepedaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Frame2(new Sepeda());
            }
        });


        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10)); // GridLayout dengan 1 baris, 2 kolom, dan jarak antar komponen 10 piksel
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Menambahkan border kosong di sekitar panel
        buttonPanel.add(motorButton);
        buttonPanel.add(mobilButton);
        buttonPanel.add(sepedaButton);

        add(buttonPanel, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
