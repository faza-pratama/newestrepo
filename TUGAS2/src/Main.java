import java.util.Scanner;

/**
 * Kelas utama (Entry Point) untuk menjalankan aplikasi Kalkulator IMT.
 * Bertugas untuk mengambil input pengguna dan menampilkan output hasil perhitungan.
 *
 * @author Mahasiswa
 * @version 1.0
 */
public class Main {
    /**
     * Method main yang akan dieksekusi saat program dijalankan.
     *
     *
     * @param args Argumen baris perintah (command line), tidak digunakan di aplikasi ini.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KalkulatorIMT kalkulator = new KalkulatorIMT();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("umur :");
        int umur = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        // Menggunakan Parameter Object 'DataPasien'
        DataPasien dataPasien = new DataPasien(berat, tinggi);
        Pasien pasien = new Pasien(nama, dataPasien);

        // Memanggil method yang diekstrak
        double hasilImt = kalkulator.hitung(pasien.getDataFisik());
        String kategoriImt = kalkulator.tentukanKategori(hasilImt);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Nama: " + pasien.getNama());
        System.out.printf("IMT Anda adalah: %.2f\n", hasilImt);
        System.out.println("Kategori: " + kategoriImt);

        input.close();
    }
}