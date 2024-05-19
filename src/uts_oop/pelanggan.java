package uts_oop;

/**
 *
 * @author 
 * Nama : I Gusti Ayu Nyoman Puteri Gita Suyoga 
 * NIM : 2201010616
 * Kelas : TI-MTI/L
 * TGL : 2024-05-16
 */

public class pelanggan {
    private String pelanggan;
    
    public pelanggan(String nama) {
        this.pelanggan = nama;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "Nama Pelanggan='" + pelanggan + '\'' +
                '}';
    }
}
