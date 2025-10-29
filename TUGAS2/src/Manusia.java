/**
 * Kelas abstrak yang merepresentasikan entitas Manusia.
 * Digunakan sebagai superclass untuk kelas lain yang mewarisi sifat dasar manusia.
 * Ini adalah hasil dari refactoring 'Extract Superclass'.
 *
 * @author Mahasiswa
 * @version 1.0
 */
public abstract class Manusia {

    /**
     * Nama dari manusia.
     */
    protected String nama;

    /**
     * Konstruktor untuk kelas Manusia.
     *
     * @param nama Nama yang akan diberikan ke manusia.
     */
    public Manusia(String nama) {
        this.nama = nama;
    }

    /**
     * Mengambil nama dari manusia.
     *
     * @return String nama manusia.
     */
    public String getNama() {
        return nama;
    }
}