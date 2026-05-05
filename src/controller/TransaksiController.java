/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.KoneksiDB;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransaksiController {
    
    // Method CREATE: Menyimpan data ke MySQL
    public void simpanTransaksi(Transaksi t) throws SQLException {
        String query = "INSERT INTO transaksi (jenis, nominal, kategori, tanggal, keterangan) VALUES (?, ?, ?, ?, ?)";
        
        // Menggunakan PreparedStatement untuk menghindari SQL Injection
        PreparedStatement ps = KoneksiDB.getKoneksi().prepareStatement(query);
        ps.setString(1, t.getJenisTransaksi());
        ps.setDouble(2, t.getNominal());
        ps.setString(3, t.getKategori());
        ps.setDate(4, t.getTanggal());
        ps.setString(5, t.getKeterangan());
        
        ps.executeUpdate();
    }

    // Method READ: Mengambil semua data dari MySQL
    public List<Transaksi> getAllTransaksi() {
        List<Transaksi> list = new ArrayList<>();
        String query = "SELECT * FROM transaksi ORDER BY tanggal DESC";
        
        try {
            Statement stmt = KoneksiDB.getKoneksi().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                Transaksi t;
                String jenis = rs.getString("jenis");
                
                // Menentukan objek berdasarkan jenis (Polymorphism secara tidak langsung)
                if (jenis.equals("Pemasukan")) {
                    t = new Pemasukan();
                } else {
                    t = new Pengeluaran();
                }
                
                t.setId(rs.getInt("id"));
                t.setNominal(rs.getDouble("nominal"));
                t.setKategori(rs.getString("kategori"));
                t.setTanggal(rs.getDate("tanggal"));
                t.setKeterangan(rs.getString("keterangan"));
                
                list.add(t);
            }
        } catch (SQLException e) {
            System.out.println("Error ambil data: " + e.getMessage());
        }
        return list;
    }

    // Method DELETE: Menghapus data berdasarkan ID
    public void hapusTransaksi(int id) throws SQLException {
        String query = "DELETE FROM transaksi WHERE id = ?";
        PreparedStatement ps = KoneksiDB.getKoneksi().prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}