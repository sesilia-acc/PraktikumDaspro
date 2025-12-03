package jobsheet11;

import java.util.Scanner;

public class kafe07 {
    static int[] hargaItem = { 15000, 20000, 22000, 12000, 10000, 18000 };
    static int hargaAwal;

    public static int hitungHargaAkhir07(int hargaBelumDiskon, String kodePromo) {
        double hargaDiskon;
        int hargaTotal = hargaBelumDiskon;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%.");
            hargaDiskon = hargaBelumDiskon * 0.5;
            hargaTotal -= hargaDiskon;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%");
            hargaDiskon = hargaBelumDiskon * 0.3;
            hargaTotal -= hargaDiskon;
        } else if (kodePromo.isEmpty()) {
            hargaTotal = hargaBelumDiskon;
        } else {
            System.out.println("Kode promo invalid!");
        }

        return hargaTotal;
    }

    public static void Menu() {
        System.out.println("====MENU RESTO KAFE====");
        System.out.println("1. Kopi Hitam - Rp15,000");
        System.out.println("2. Cappuccino - Rp20,000");
        System.out.println("3. Latte - Rp22,000");
        System.out.println("4. Teh Tarik - Rp12,000");
        System.out.println("5. Roti Bakar - Rp10,000");
        System.out.println("6. Mie Goreng - Rp18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungHargaAwal(int pilihanMenu, int banyakItem) {
        hargaAwal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaAwal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSemua = 0, hargaPesanan = 0;
        int pilihanMenu, banyakItem;
        String tambah, kodePromo;

        Menu();

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Tambah pesanan lagi? (ya/tidak): ");
            tambah = sc.nextLine();
            hargaPesanan = hitungHargaAwal(pilihanMenu, banyakItem);
            totalSemua += hargaPesanan;

        } while (tambah.equalsIgnoreCase("ya"));
        System.out.print("Masukkan kode promo (kosongi jika tidak ada): ");
        kodePromo = sc.nextLine();

        totalSemua = hitungHargaAkhir07(totalSemua, kodePromo);

        System.out.println("------------------------------------");
        System.out.println("Total harga yang harus dibayar adalah: Rp" + totalSemua);

        sc.close();
    }
}
