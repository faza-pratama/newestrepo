public class RestoranApp {
    public static void main(String[] args) {
        // 1. Buat daftar menu yang tersedia
        MenuItem menu1 = new MenuItem("Nasi Goreng", 22000);
        MenuItem menu2 = new MenuItem("Mie Ayam", 18000);
        MenuItem menu3 = new MenuItem("Es Teh Manis", 5000);
        MenuItem menu4 = new MenuItem("Jus Jeruk", 10000);

        // 2. Buat pesanan baru (model dan fitur unik: ada nama pelanggan)
        NotaPesanan pesananA = new NotaPesanan("Anton");

        // 3. Tambahkan item ke pesanan
        // (Manfaatkan fitur autocomplete saat mengetik 'pesananA.')
        pesananA.tambahItem(menu1, 2); // 2 Nasi Goreng
        pesananA.tambahItem(menu3, 1); // 1 Es Teh

        // 4. Cetak nota pesanan A
        // Method ini akan menjalankan "blok rumus perhitungan"
        pesananA.cetakNota();

        NotaPesanan pesananB = new NotaPesanan("Siska");
        pesananB.tambahItem(menu2, 1);
        pesananB.tambahItem(menu4, 1);
        pesananB.cetakNota();
    }

}