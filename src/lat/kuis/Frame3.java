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

class Frame3 extends JFrame {
    public Frame3(String nama, String telepon, HargaSewa kendaraan, int jumlahHari) {
        setTitle("Detail dan Total Harga");
        setLayout(new GridLayout(6, 2, 20, 20));

        JLabel nameLabel = new JLabel("Nama Penyewa: " + nama);
        JLabel phoneLabel = new JLabel("Nomor Telepon: " + telepon);
        JLabel vehicleLabel = new JLabel("Jenis Kendaraan: " + kendaraan.toString());
        JLabel dayLabel = new JLabel("Jumlah Hari: " + jumlahHari);
        JLabel totalPriceLabel = new JLabel("Total Harga: Rp " + kendaraan.hitungTotalHarga(jumlahHari));

        JButton finishButton = new JButton("Selesai");

        add(nameLabel);
        add(phoneLabel);
        add(vehicleLabel);
        add(dayLabel);
        add(totalPriceLabel);
        add(finishButton);

        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}