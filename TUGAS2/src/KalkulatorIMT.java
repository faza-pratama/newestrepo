/**
 * Kelas implementasi dari OperasiKalkulator yang khusus untuk menghitung IMT.
 * Berisi logika bisnis utama untuk perhitungan Indeks Massa Tubuh.
 *
 * @author Mahasiswa
 * @version 1.0
 * @see OperasiKalkulator
 * @see DataPasien
 */
public class KalkulatorIMT implements OperasiKalkulator {
    /**
     * Konstanta untuk mengkonversi sentimeter ke meter.
     * Hasil dari refactoring 'Introduce Constant'.
     */
    private static final double KONVERSI_CM_KE_METER = 100.0;

    /**
     * Menghitung nilai Indeks Massa Tubuh (IMT) berdasarkan data fisik pasien.
     * Rumus: berat(kg) / (tinggi(m) * tinggi(m))
     * Ini adalah hasil dari refactoring 'Extract Method'.
     *
     * @param data Objek DataPasien yang berisi berat (kg) dan tinggi (cm).
     * @return double nilai IMT. Mengembalikan 0 jika tinggi badan 0 atau kurang.
     */
    @Override
    public double hitung(DataPasien data) {
        // Hasil refactoring 'Rename Variable'
        double tinggiBadanMeter = data.getTinggiBadanCm() / KONVERSI_CM_KE_METER;
        double beratBadanKg = data.getBeratBadanKg();

        if (tinggiBadanMeter <= 0) {
            return 0; // Menghindari pembagian dengan nol
        }
        return beratBadanKg / (tinggiBadanMeter * tinggiBadanMeter);
    }

    /**
     * Menentukan kategori berat badan berdasarkan nilai IMT.
     * Ini adalah hasil dari refactoring 'Extract Method'.
     *
     * @param nilaiImt Nilai IMT yang telah dihitung.
     * @return String kategori berat badan ("Berat badan kurang", "Normal", dll.).
     */
    @Override
    public String tentukanKategori(double nilaiImt) {
        if (nilaiImt < 18.5) {
            return "Berat badan kurang";
        } else if (nilaiImt < 25) {
            return "Berat badan normal";
        } else if (nilaiImt < 30) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }
}