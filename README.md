# PROJECT ASSIGNMENT OOP PRACTICUM IH-H
# 💰 Personal Finance Tracker

Aplikasi pencatat keuangan harian sederhana yang dibangun menggunakan **Java Swing** dan **MySQL**. Proyek ini menerapkan arsitektur **MVC (Model-View-Controller)** dan prinsip **Pemrograman Berorientasi Objek (OOP)** secara mendalam.

## 🚀 Fitur Utama
- **Manajemen Transaksi**: Melakukan operasi CRUD (Create, Read, Delete) data pemasukan dan pengeluaran.
- **Kalkulasi Saldo Real-time**: Total saldo otomatis dihitung berdasarkan selisih pemasukan dan pengeluaran yang tersimpan di database.
- **Validasi Data**: Menerapkan *Exception Handling* untuk mencegah input nominal negatif atau format yang salah.
- **Modern UI**: Menggunakan *BorderLayout* dan *TitledBorder* untuk antarmuka yang terorganisir.

## 🏗️ Implementasi 5 Pilar OOP
Proyek ini dirancang untuk mendemonstrasikan pemahaman pilar utama OOP:
1. **Abstraction**: Menggunakan `abstract class Transaksi` sebagai cetak biru dasar yang tidak bisa diinstansiasi langsung.
2. **Encapsulation**: Atribut data diset `private` dan diakses melalui method `getter` serta `setter` dengan validasi internal.
3. **Inheritance**: Kelas `Pemasukan` dan `Pengeluaran` mewarisi properti dan perilaku dari kelas induk `Transaksi`.
4. **Polymorphism**: Method `getJenisTransaksi()` di-override oleh kelas anak untuk mengembalikan nilai yang berbeda sesuai konteks objeknya.
5. **Composition**: Kelas `Dompet` memiliki (has-a) hubungan dengan `List<Transaksi>`, di mana fungsionalitas Dompet bergantung pada keberadaan objek Transaksi.

## 🛠️ Tech Stack & Persiapan
- **Bahasa**: Java (JDK 8 atau lebih baru)
- **IDE**: NetBeans 
- **Database**: MySQL (XAMPP)
- **Library**: MySQL Connector/J

### Cara Menjalankan Proyek:
1. Clone repositori ini ke komputer lokal kamu.
2. Buka **XAMPP Control Panel** dan jalankan Apache serta MySQL.
3. Import database melalui phpMyAdmin menggunakan file yang tersedia di folder `database_sql/finance_tracker.sql`.
4. Buka proyek melalui NetBeans.
5. Pastikan Library `mysql-connector-java.jar` sudah ditambahkan di folder **Libraries**.
6. Run file `Main.java` di package `app`.

---
Dibuat oleh **Muhammad Farelino Kelfin Ramadhani - 123240205**
Dibuat oleh **Aulia Cahaya Ramadhany - 123240192**
