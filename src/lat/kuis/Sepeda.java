/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat.kuis;

/**
 *
 * @author HP
 */
class Sepeda implements HargaSewa {
   private double hargaSewaPerHari = 50000;

    public double hitungTotalHarga(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari;
    }

    public String toString() {
        return "Sepeda (Rp 50.000/hari)";
    }
}
