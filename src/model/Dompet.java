/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;

public class Dompet {
    // Composition: Dompet memiliki banyak objek Transaksi
    private List<Transaksi> daftarTransaksi = new ArrayList<>();

    public void setDaftarTransaksi(List<Transaksi> daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }

    public double hitungSaldo() {
        double saldo = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t instanceof Pemasukan) {
                saldo += t.getNominal();
            } else if (t instanceof Pengeluaran) {
                saldo -= t.getNominal();
            }
        }
        return saldo;
    }
}