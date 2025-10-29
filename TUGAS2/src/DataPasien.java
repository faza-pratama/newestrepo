/**
 * Kelas data yang membungkus parameter fisik seorang pasien.
 * Ini adalah hasil dari refactoring 'Introduce Parameter Object'.
 * Tujuannya adalah untuk mengelompokkan data berat dan tinggi badan.
 *
 * @author Mahasiswa
 * @version 1.0
 */
public class DataPasien {
    private final double beratBadanKg;
    private final double tinggiBadanCm;

    /**
     * Konstruktor untuk membuat objek DataPasien.
     *
     * @param beratBadanKg Berat badan pasien dalam kilogram (kg).
     * @param tinggiBadanCm Tinggi badan pasien dalam sentimeter (cm).
     */
    public DataPasien(double beratBadanKg, double tinggiBadanCm) {
        this.beratBadanKg = beratBadanKg;
        this.tinggiBadanCm = tinggiBadanCm;
    }

    /**
     * Mengambil nilai berat badan pasien.
     *
     * @return double berat badan dalam kilogram.
     */
    public double getBeratBadanKg() {
        return beratBadanKg;
    }

    /**
     * Mengambil nilai tinggi badan pasien.
     *
     * @return double tinggi badan dalam sentimeter.
     */
    public double getTinggiBadanCm() {
        return tinggiBadanCm;
    }
}