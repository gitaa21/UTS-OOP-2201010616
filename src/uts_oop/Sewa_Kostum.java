package uts_oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * Nama : I Gusti Ayu Nyoman Puteri Gita Suyoga
 * NIM : 2201010616
 * Kelas : TI-MTI/L
 * TGL : 2024-05-16
 */

public class Sewa_Kostum {
    private int idSewa;
    private String pelanggan;
    private String kostum;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;
    private double hargaKostum;

    public Sewa_Kostum(String pelanggan, String kostum, LocalDate tanggalSewa, LocalDate tanggalKembali, double hargaSewa) {
        this.pelanggan = pelanggan;
        this.kostum = kostum;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        this.hargaKostum = hargaSewa;
    }

    public int getIdSewa() {
        return idSewa;
    }
    
    public String getPelanggan() {
        return pelanggan;
    }

    public String getKostum() {
        return kostum;
    }

    public LocalDate getTanggalSewa() {
        return tanggalSewa;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public double getHargaSewa() {
        return hargaKostum;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "ID Sewa: " + idSewa + "\n" +
                "Nama Pelanggan: " + pelanggan + "\n" +
                "Jenis Kostum: " + kostum + "\n" +
                "Tanggal Peminjaman: " + tanggalSewa.format(formatter) + "\n" +
                "Tanggal Pengembalian: " + tanggalKembali.format(formatter) + "\n" +
                "Harga Sewa: " + hargaKostum + "\n";
    }
}
