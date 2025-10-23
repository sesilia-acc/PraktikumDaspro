package jobsheet7;

import java.util.Scanner;

public class bioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, jmlTiket, totalTiket = 0;
        double hargaTotal, totalBayar, hargaTiket, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang di beli : ");
            jmlTiket = sc.nextInt();

            hargaTiket = jmlTiket * 50000;

            if (jmlTiket > 4 && jmlTiket <= 10) {
                totalBayar = hargaTiket - (hargaTiket * 0.1);
                totalTiket = totalTiket + jmlTiket;
                totalPenjualan = totalBayar + totalPenjualan;
                System.out.println("\nHarga yang harus dibayar adalah : Rp" + totalBayar);
            } else if (jmlTiket > 10) {
                totalBayar = hargaTiket - (hargaTiket * 0.15);
                totalTiket = totalTiket + jmlTiket;
                totalPenjualan = totalBayar + totalPenjualan;
                System.out.println("\nHarga yang harus dibayar adalah : Rp " + totalBayar);
            } else if (jmlTiket < 0) {
                System.out.println("\nJumlah tiket tidak valid. Masukkan ulang!");
                continue;
            } else {
                totalTiket = totalTiket + jmlTiket;
                totalBayar = jmlTiket * 50000;
                totalPenjualan = totalBayar + totalPenjualan;
                System.out.println("\nHarga yang harus dibayar adalah : Rp " + hargaTiket);
            }
            sc.nextLine();
        } while (jmlTiket != 0);
        System.out.println("\nTotal penjualan tiket satu hari : " + totalTiket);
        System.out.println("Total harga penjualan tiket satu hari : " + totalPenjualan);
    }
}
