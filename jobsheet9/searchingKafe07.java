package jobsheet9;

import java.util.Scanner;

public class searchingKafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Program Pemesanan Kafe ====");
        String[] menu = { "Dimsum", "Gyoza", "Mochi", "Matcha", "Cappucino", "Lemon Tea", "Nasi Bakar" };
        System.out.print("\nMasukkan menu yang ingin dicari : ");
        String cari = sc.nextLine();

        boolean menuKetemu = false;
        for (String pesanan : menu) {
            if (pesanan.equalsIgnoreCase(cari)) {
                menuKetemu = true;
                break;
            }
        }
        if (menuKetemu) {
            System.out.println("-----------------------");
            System.out.println(cari + " tersedia di menu!");
            System.out.println("Silahkan lanjutkan pemesanan.");
        } else {
            System.out.println("-----------------------");
            System.out.println(cari + " tidak tersedia di menu!");
            System.out.println("Periksa kembali ejaan atau pilih menu lainnya.");
        }
        sc.close();
    }
}
