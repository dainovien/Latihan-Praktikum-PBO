/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat.kuis;

/**
 *
 * @author HP
 */
class Motor implements HargaSewa {
    private double hargaSewaPerHari = 100000;

    public double hitungTotalHarga(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari;
    }

    public String toString() {
        return "Motor (Rp 100.000/hari)";
    }
}