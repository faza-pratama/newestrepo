# Kalkulator Indeks Massa Tubuh (IMT)

Aplikasi konsol Java sederhana untuk menghitung Indeks Massa Tubuh (IMT) atau Body Mass Index (BMI) dan menentukan kategori berat badan berdasarkan hasil perhitungan tersebut.

Proyek ini dibuat sebagai bagian dari tugas "Tema Pemrograman Lanjut 2025/2026" dan merupakan hasil refactoring dari program yang dibuat di Modul 2.

## 🏛️ Struktur Kelas

Proyek ini menggunakan prinsip Object-Oriented Programming (OOP) dan menerapkan beberapa teknik refactoring. Berikut adalah deskripsi singkat dari setiap kelas:

* **`Main.java`**:
    Kelas utama (entry point) yang menjalankan aplikasi. Berfungsi untuk mengambil input dari pengguna (Nama, Berat, Tinggi) dan menampilkan hasil perhitungan.

* **`Manusia.java`**:
    Sebuah `abstract class` (hasil *Extract Superclass*) yang menjadi kelas induk untuk `Pasien`. Menyimpan data dasar seperti `nama`.

* **`Pasien.java`**:
    Kelas yang merepresentasikan data pasien. Merupakan turunan dari `Manusia` dan memiliki objek `DataPasien`.

* **`DataPasien.java`**:
    Kelas data (hasil *Introduce Parameter Object*) yang membungkus parameter terkait data fisik, yaitu `beratBadanKg` dan `tinggiBadanCm`.

* **`OperasiKalkulator.java`**:
    Sebuah `interface` (hasil *Extract Interface*) yang mendefinisikan "kontrak" atau operasi yang harus dimiliki oleh sebuah kalkulator, yaitu `hitung()` dan `tentukanKategori()`.

* **`KalkulatorIMT.java`**:
    Kelas yang berisi logika bisnis utama. Kelas ini mengimplementasikan `OperasiKalkulator` dan berisi rumus untuk menghitung IMT serta menentukan kategorinya.

## ⚙️ Teknik Refactoring yang Diterapkan

Program ini telah melalui proses refactoring berikut:

1.  **Introduce Parameter Object**: Menggabungkan `beratBadan` dan `tinggiBadan` ke dalam satu kelas objek `DataPasien`.
2.  **Introduce Constant**: Mengganti *magic number* `100.0` dengan konstanta `KONVERSI_CM_KE_METER`.
3.  **Extract Method**: Memisahkan logika untuk kalkulasi IMT (`hitung`) dan penentuan kategori (`tentukanKategori`) ke dalam method terpisah.
4.  **Rename Variable**: Mengganti nama variabel yang tidak jelas (seperti `bb`, `tb`) menjadi nama yang lebih deskriptif (`beratBadanKg`, `tinggiBadanCm`).
5.  **Extract Superclass**: Membuat kelas `Manusia` sebagai superclass untuk `Pasien`.
6.  **Extract Interface**: Membuat interface `OperasiKalkulator` yang diimplementasikan oleh `KalkulatorIMT`.

## 🚀 Cara Menjalankan Program

1.  Pastikan Anda memiliki Java Development Kit (JDK) terinstal.
2.  Buka terminal atau command prompt dan navigasikan ke direktori proyek.
3.  Kompilasi semua file `.java`:
    ```bash
    javac *.java
    ```
4.  Jalankan kelas `Main`:
    ```bash
    java Main
    ```
5.  Ikuti petunjuk di konsol untuk memasukkan data.