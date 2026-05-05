/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Pemasukan extends Transaksi {
    // Polymorphism: Meng-override method dari class induk
    @Override
    public String getJenisTransaksi() {
        return "Pemasukan";
    }
}