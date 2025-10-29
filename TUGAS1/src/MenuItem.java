// File: MenuItem.java

public class MenuItem {
    // --- Atribut ---
    private String nama;
    private double harga;
    private int kuantitas;

    // --- Method (Constructor) ---
    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.kuantitas = 0; // default
    }

    // --- Method (Getters) ---
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    // --- Method (Setter) ---
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    // --- Method (Perhitungan) ---
    public double getSubtotal() {
        return this.harga * this.kuantitas;
    }
}