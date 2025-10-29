// File: NotaPesanan.java

import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;

public class NotaPesanan {
    // --- Atribut ---
    private String namaPelanggan;
    private List<MenuItem> daftarItem;
    private final double PERSEN_PAJAK = 0.11; // Pajak PPN 11%
    private final double BIAYA_LAYANAN = 5000; // Biaya layanan tetap

    // --- Method (Constructor) ---
    public NotaPesanan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
        this.daftarItem = new ArrayList<>();
    }

    // --- Method (Aksi) ---
    public void tambahItem(MenuItem item, int kuantitas) {
        item.setKuantitas(kuantitas);
        this.daftarItem.add(item);
        System.out.println("-> Berhasil menambah: " + item.getNama() + " (x" + kuantitas + ")");
    }

    // --- Method (Rumus Perhitungan & Cetak Nota) ---
    public void cetakNota() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("\n========================================");
        System.out.println("          NOTA RESTORAN SEDERHANA         ");
        System.out.println("========================================");
        System.out.println("Pelanggan: " + this.namaPelanggan);
        System.out.println("----------------------------------------");


        double totalPesanan = 0;

        for (MenuItem item : daftarItem) {
            System.out.printf("%-20s %d x %s = %s\n",
                    item.getNama(),
                    item.getKuantitas(),
                    formatRupiah.format(item.getHarga()),
                    formatRupiah.format(item.getSubtotal())
            );
            totalPesanan += item.getSubtotal();
        }

        System.out.println("----------------------------------------");
        double nilaiPajak = totalPesanan * PERSEN_PAJAK;
        double totalAkhir = totalPesanan + nilaiPajak + BIAYA_LAYANAN;

        System.out.printf("%-20s: %s\n", "Subtotal", formatRupiah.format(totalPesanan));
        System.out.printf("%-20s: %s\n", "Pajak (11%)", formatRupiah.format(nilaiPajak));
        System.out.printf("%-20s: %s\n", "Biaya Layanan", formatRupiah.format(BIAYA_LAYANAN));
        System.out.println("----------------------------------------");
        System.out.printf("%-20s: %s\n", "TOTAL BAYAR", formatRupiah.format(totalAkhir));


        System.out.println("========================================");
        System.out.println("      Terima Kasih Telah Memesan!       ");
        System.out.println("========================================");
    }
}