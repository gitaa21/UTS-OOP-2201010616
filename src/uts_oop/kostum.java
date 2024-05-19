package uts_oop;

/**
 *
 * @author 
 * Nama : I Gusti Ayu Nyoman Puteri Gita Suyoga 
 * NIM : 2201010616
 * Kelas : TI-MTI/L
 * TGL : 2024-05-16
 */

public class kostum {
    private String kostum;
    private double hargaKostum;

    public kostum(String kostum, double hargaKostum) {
        this.kostum = kostum;
        this.hargaKostum = hargaKostum;
    }

    public double getHargaSewaPerHari() {
        return hargaKostum;
    }

    @Override
    public String toString() {
        return "Kostum{" +
                "Jenis Kostum='" + kostum + '\'' +
                ", Harga Sewa=" + hargaKostum +
                '}';
    }
}
