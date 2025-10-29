/**
 * Kelas yang merepresentasikan seorang Pasien.
 * Kelas ini merupakan turunan dari kelas Manusia dan memiliki data fisik.
 *
 * @author Mahasiswa
 * @version 1.0
 * @see Manusia
 * @see DataPasien
 */
public class Pasien extends Manusia {
    /**
     * Objek yang menyimpan data fisik pasien (berat dan tinggi).
     */
    private final DataPasien dataFisik;

    /**
     * Konstruktor untuk membuat objek Pasien baru.
     *
     * @param nama Nama pasien, diwariskan dari superclass Manusia.
     * @param dataFisik Objek DataPasien yang berisi berat dan tinggi badan.
     */
    public Pasien(String nama, DataPasien dataFisik) {
        super(nama);
        this.dataFisik = dataFisik;
    }

    /**
     * Mengambil data fisik lengkap milik pasien.
     *
     * @return Objek DataPasien yang berisi berat dan tinggi.
     */
    public DataPasien getDataFisik() {
        return dataFisik;
    }
}