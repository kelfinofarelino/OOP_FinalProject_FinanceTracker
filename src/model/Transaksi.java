/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;

public abstract class Transaksi {
    private int id;
    private double nominal;
    private String kategori;
    private Date tanggal;
    private String keterangan;

    // Abstraction
    public abstract String getJenisTransaksi(); 

    // Encapsulation
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getNominal() { return nominal; }
    public void setNominal(double nominal) {
        if (nominal <= 0) {
            // Exception Handling jika uang yang diinput minus/nol
            throw new IllegalArgumentException("Nominal tidak boleh kurang dari atau sama dengan nol!");
        }
        this.nominal = nominal;
    }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public Date getTanggal() { return tanggal; }
    public void setTanggal(Date tanggal) { this.tanggal = tanggal; }

    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }
}