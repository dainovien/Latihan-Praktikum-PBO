/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat.kuis;

/**
 *
 * @author HP
 */
class Mobil implements HargaSewa {
    private double hargaSewaPerHari = 200000;

    public double hitungTotalHarga(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari;
    }

    public String toString() {
        return "Mobil (Rp 200.000/hari)";
    }
}
