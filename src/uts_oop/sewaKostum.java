package uts_oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama : I Gusti Ayu Nyoman Puteri Gita Suyoga 
 * NIM : 2201010616
 * Kelas : TI-MTI/L
 * TGL : 2024-05-16
 */

public class sewaKostum {
    private int brs = 10;
    private int klm = 5;
    private int raktif = 0;
    private Object[][] SK = new Object[brs][klm];
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    Scanner dtIN = new Scanner(System.in);

    public void Storedata() {
        if (raktif >= brs) {
            System.out.println("Data sudah penuh");
            return;
        }
        System.out.println("Menambahkan data penyewaan kostum");
        System.out.println("=======================");
        System.out.print("Nama Pelanggan: ");
        SK[raktif][0] = dtIN.nextLine();
        System.out.print("Jenis Kostum: ");
        SK[raktif][1] = dtIN.nextLine();
        SK[raktif][2] = inputDate("Tanggal Peminjaman (dd-MM-yyyy): ");
        SK[raktif][3] = inputDate("Tanggal Pengembalian (dd-MM-yyyy): ");
        System.out.print("Harga Sewa: ");
        SK[raktif][4] = dtIN.nextLine();
        raktif++;
    }

    public void Update(int idx) {
        if (idx >= 0 && idx < raktif) {
            System.out.println("Memperbarui data penyewaan kostum");
            System.out.println("========================");
            System.out.print("Nama Pelanggan: ");
            SK[idx][0] = dtIN.nextLine();
            System.out.print("Jenis Kostum: ");
            SK[idx][1] = dtIN.nextLine();
            SK[idx][2] = inputDate("Tanggal Peminjaman (dd-MM-yyyy): ");
            SK[idx][3] = inputDate("Tanggal Pengembalian (dd-MM-yyyy): ");
            System.out.print("Harga Sewa: ");
            SK[idx][4] = dtIN.nextLine();
            System.out.println("Data penyewaan kostum berhasil diperbarui");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void Destroy(int idx) {
        if (idx >= 0 && idx < raktif) {
            System.out.println("Menghapus data penyewaan kostum");
            System.out.println("=====================");
            System.out.println("Data penyewaan kostum yang akan dihapus:");
            System.out.println("Nama Pelanggan: " + SK[idx][0]);
            System.out.println("Jenis Kostum: " + SK[idx][1]);
            System.out.println("Tanggal Peminjaman: " + formatter.format((LocalDate) SK[idx][2]));
            System.out.println("Tanggal Pengembalian: " + formatter.format((LocalDate) SK[idx][3]));
            System.out.println("Harga Sewa: " + SK[idx][4]);

            for (int i = idx; i < raktif - 1; i++) {
                SK[i] = SK[i + 1];
            }

            SK[raktif - 1] = new Object[klm];
            raktif--;

            System.out.println("Data penyewaan kostum berhasil dihapus");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void Viewdata() {
        System.out.println("Daftar penyewaan kostum");
        System.out.println("=====================");
        for (int i = 0; i < raktif; i++) {
            System.out.println((i + 1) + ". Nama Pelanggan: " + SK[i][0]);
            System.out.println("   Jenis Kostum: " + SK[i][1]);
            System.out.println("   Tanggal Peminjaman: " + formatter.format((LocalDate) SK[i][2]));
            System.out.println("   Tanggal Pengembalian: " + formatter.format((LocalDate) SK[i][3]));
            System.out.println("   Harga Sewa: " + SK[i][4]);
            System.out.println();
        }
    }

    private LocalDate inputDate(String prompt) {
        LocalDate date = null;
        while (date == null) {
            System.out.print(prompt);
            String dateStr = dtIN.nextLine();
            try {
                date = LocalDate.parse(dateStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Format tanggal tidak valid. Harap masukkan dalam format dd-MM-yyyy.");
            }
        }
        return date;
    }
}
