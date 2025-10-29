/**
 * Interface yang mendefinisikan "kontrak" untuk operasi kalkulator IMT.
 * Ini adalah hasil dari refactoring 'Extract Interface'.
 * Setiap kelas kalkulator harus mengimplementasikan method yang ada di sini.
 *
 * @author Mahasiswa
 * @version 1.0
 */
public interface OperasiKalkulator {
    /**
     * Method untuk melakukan perhitungan utama berdasarkan data pasien.
     *
     * @param data Objek DataPasien yang berisi berat dan tinggi.
     * @return double hasil perhitungan (misalnya, nilai IMT).
     */
    double hitung(DataPasien data);

    /**
     * Method untuk menentukan kategori berdasarkan nilai hasil perhitungan.
     *
     * @param nilai double nilai hasil perhitungan (misalnya, nilai IMT).
     * @return String yang berisi nama kategori (misal: "Normal", "Obesitas").
     */
    String tentukanKategori(double nilai);
}