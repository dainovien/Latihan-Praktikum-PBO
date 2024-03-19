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

class Frame2 extends JFrame {
    private HargaSewa kendaraan;

    public Frame2(HargaSewa kendaraan) {
        this.kendaraan = kendaraan;
        setTitle("Detail Penyewaan");
        setLayout(new GridLayout(6, 2, 20, 20)); // Menggunakan GridLayout dengan jarak antar komponen 10 piksel

        JLabel nameLabel = new JLabel("Nama Penyewa:");
        JTextField nameField = new JTextField();
        JLabel phoneLabel = new JLabel("Nomor Telepon:");
        JTextField phoneField = new JTextField();
        JLabel vehicleLabel = new JLabel("Jenis Kendaraan:");
        JLabel priceLabel = new JLabel("Harga Sewa per Hari:");
        JLabel dayLabel = new JLabel("Jumlah Hari:");
        JTextField dayField = new JTextField();
        JButton saveButton = new JButton("Simpan");

        add(nameLabel);
        add(nameField);
        add(phoneLabel);
        add(phoneField);
        add(vehicleLabel);
        add(new JLabel(kendaraan.toString()));
        add(priceLabel);
        add(new JLabel(String.valueOf(kendaraan.hitungTotalHarga(1))));
        add(dayLabel);
        add(dayField);

        // Membuat panel untuk menempatkan tombol Simpan di tengah bawah
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Menggunakan FlowLayout untuk menempatkan tombol di tengah
        buttonPanel.add(saveButton);
        add(buttonPanel); // Menambahkan panel tombol ke dalam jendela

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    int jumlahHari = Integer.parseInt(dayField.getText());
                    new Frame3(nameField.getText(), phoneField.getText(), kendaraan, jumlahHari);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah hari dengan angka!", "Error", JOptionPane.ERROR_MESSAGE);
                    new Frame2(kendaraan);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

