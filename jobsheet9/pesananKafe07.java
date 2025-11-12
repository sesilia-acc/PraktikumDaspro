package jobsheet9;

import java.util.Scanner;

public class pesananKafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Pemesanan Kafe ===");
        System.out.print("\nMasukkan jumlah pesanan Anda : ");
        int jmlPesanan = sc.nextInt();
        System.out.println();
        sc.nextLine();

        String[] pesanan = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("---- Pesanan Ke-" + (i + 1) + " ----");
            System.out.print("Masukkan nama makanan/minuman : ");
            pesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga " + pesanan[i] + " : Rp");
            harga[i] = sc.nextInt();
            System.out.println();
            sc.nextLine();
            totalBiaya += harga[i];
        }
        System.out.println("---- Daftar Pesanan dan Total Biaya ----");
        System.out.println("Pesanan\t\t harga\t");
        System.out.println("---------------------------------");
        
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-10s\t %d\t", pesanan[i], harga[i]);
            System.out.println();
        }
        System.out.println("--------------------------------");
        System.out.printf("TOTAL\t\t %d\t", totalBiaya );
    }
}
