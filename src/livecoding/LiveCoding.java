package livecoding;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class LiveCoding {

    public static void main(String[] args) {
        System.out.println("TOKO ZHIDO LARIZ"); 
        System.out.println("Jalan Bahagia No.25 - Solo");
        System.out.println("=======================================================");

        Scanner input = new Scanner(System.in);

        // Input Data
        System.out.print("Masukkan No.Kwitansi     : ");
        String nokw = input.nextLine();

        System.out.print("Masukkan Kode Barang     : ");
        String kdbarang = input.nextLine();

        System.out.print("Masukkan Nama Barang     : ");
        String nmbarang = input.nextLine();

        System.out.print("Masukkan Harga Satuan    : ");
        int h = input.nextInt();

        System.out.print("Masukkan Jumlah Beli     : ");
        int j = input.nextInt();

        input.nextLine();
        System.out.print("Masukkan Nama Kasir      : ");
        String kasir = input.nextLine();
        
        // Ambil tanggal hari ini
        LocalDate tanggalHariIni = LocalDate.now();

        // Format jadi dd/MM/yyyy
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tanggalFormat = tanggalHariIni.format(formatTanggal);

        // Siapkan string "Solo, dd/MM/yyyy"
        String lokasiTanggal = "Solo, " + tanggalFormat;

        
        // Perhitungan
        int totalPembelian = h * j;
        double potongan = 0;
        double totalBayar;
        String bonus = "Tidak Dapat";

        if (totalPembelian >= 3000000) {
            potongan = totalPembelian * 0.10;
            bonus = "Gantungan Kunci Motor";
        }

        totalBayar = totalPembelian - potongan;

        // Output Nota
        System.out.println("\n\nNota :");
        System.out.println("TOKO ZHIDO LARIZ");
        System.out.println("Jalan Bahagia No.25 - Solo");
        System.out.println("=======================================================");
        System.out.println("No.Kwitansi          : " + nokw);
        System.out.println("Kode Barang          : " + kdbarang);
        System.out.println("Barang               : " + nmbarang);
        System.out.println("Harga Satuan         : Rp " + h);
        System.out.println("Jumlah Beli          : " + j);
        System.out.println("Total Pembelian      : Rp " + totalPembelian);
        System.out.println("Potongan             : Rp " + (int)potongan);
        System.out.println("Total Pembayaran     : Rp " + (int)totalBayar);
        System.out.println("Bonus                : " + bonus);
        System.out.println();
        System.out.println(String.format("%60s", lokasiTanggal));
        System.out.println(String.format("%60s", "Kasir: " + kasir));
        System.out.println();
        System.out.println();
        System.out.println("\nMuhamad Rifky Hafan");
    }
}
