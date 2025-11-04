package jobsheet8;

import java.util.Scanner;

public class kafesenja07 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe = ");
        int cabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int totalPelanggan = 0, totalItem = 0;

        int i = 1;
        while (i <= cabang) {
            System.out.println("\n--- Cabang " + i + " ---");
            int ItemCabang = 0;
            System.out.print("Jumlah pelanggan = ");
            int PelangganCabang = sc.nextInt();

            for (int j = 1; j <= PelangganCabang; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                ItemCabang += item;
            }

            totalPelanggan += PelangganCabang;
            totalItem += ItemCabang;

            System.out.println("Cabang " + i + " :");
            System.out.print("- Pelanggan = " + PelangganCabang + " orang");
            System.out.print("\n- Item terjual = " + ItemCabang);
            System.out.println();

            i++;
        }

        System.out.println("\nTotal seluruh cabang :");
        System.out.println("Pelanggan = " + totalPelanggan + " orang");
        System.out.println("Item terjual = " + totalItem + " item");

    }
}
