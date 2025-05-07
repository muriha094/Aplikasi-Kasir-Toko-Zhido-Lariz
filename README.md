# Aplikasi Kasir Toko Zhido Lariz

Aplikasi sederhana berbasis Java untuk sistem pembayaran dan pembuatan nota di Toko Zhido Lariz.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-red.svg)](https://www.java.com)

## Deskripsi

Aplikasi ini dibuat untuk memudahkan proses transaksi penjualan di Toko Zhido Lariz. Program ini dapat menerima input data pembelian, melakukan perhitungan total, menerapkan diskon, dan mencetak nota pembelian.

## Fitur

- Input data pembelian (nomor kwitansi, kode barang, nama barang, harga, jumlah)
- Perhitungan otomatis total pembelian
- Sistem potongan harga (diskon 10% untuk pembelian di atas Rp 3.000.000)
- Sistem bonus (Gantungan Kunci Motor untuk pembelian di atas Rp 3.000.000)
- Cetak nota pembelian dengan format yang rapi
- Menampilkan tanggal transaksi secara otomatis

## Teknologi
- Apache Neatbeans IDE 25
- Java
- Library standar Java:
  - `java.util.Scanner` - untuk input data
  - `java.time.LocalDate` - untuk mengelola tanggal
  - `java.time.format.DateTimeFormatter` - untuk memformat tanggal

## Cara Menggunakan

1. Clone repository ini ke komputer Anda
   ```
   git clone https://github.com/username/kasir-toko-zhido-lariz.git
   ```

2. Buka proyek menggunakan IDE Java favorit Anda (Eclipse, IntelliJ IDEA, NetBeans, dll)

3. Jalankan file `LiveCoding.java` yang berada di  ``` src/LiveCoding.java    ```

4. Ikuti petunjuk pada program untuk menginput data transaksi

## Struktur Program

Program ini memiliki alur sebagai berikut:
1. Menampilkan header toko
2. Menerima input data transaksi dari pengguna
3. Menghitung total pembelian
4. Menentukan potongan harga dan bonus berdasarkan total pembelian
5. Menghitung total pembayaran akhir
6. Mencetak nota pembelian lengkap

## Contoh Output

```
TOKO ZHIDO LARIZ
Jalan Bahagia No.25 - Solo
=======================================================
No.Kwitansi          : KW001
Kode Barang          : BRG001
Barang               : Velg Racing
Harga Satuan         : Rp 4000000
Jumlah Beli          : 1
Total Pembelian      : Rp 4000000
Potongan             : Rp 400000
Total Pembayaran     : Rp 3600000
Bonus                : Gantungan Kunci Motor

                                               Solo, 07/05/2025
                                                 Kasir: Ahmad


Muhamad Rifky Hafan
```

