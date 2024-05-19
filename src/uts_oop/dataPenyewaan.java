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

public class dataPenyewaan {
    private int idSewa;
    private String pelanggan;
    private String kostum;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;
    private double hargaSewa;

    public dataPenyewaan(String pelanggan, String kostum, LocalDate tanggalSewa, LocalDate tanggalKembali, double hargaSewa) {
        this.pelanggan = pelanggan;
        this.kostum = kostum;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        this.hargaSewa = hargaSewa;
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
        return hargaSewa;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Nama Pelanggan: " + pelanggan + "\n" +
                "Jenis Kostum: " + kostum + "\n" +
                "Tanggal Peminjaman: " + tanggalSewa.format(formatter) + "\n" +
                "Tanggal Pengembalian: " + tanggalKembali.format(formatter) + "\n" +
                "Harga Sewa: " + hargaSewa + "\n";
    }
}
