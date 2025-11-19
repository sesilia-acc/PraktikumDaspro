package jobsheet10;

import java.util.Scanner;

public class bioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        System.out.println("==== Data Penonton Bioskop ====");
        System.out.println("\n ---- Input Data Penonton ----");

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();

            boolean terisi = false;
            do {
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out
                            .println("Error! nomor baris/kolom tidak tersedia. Masukkan nomor baris/kolom yang valid!");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " telah terisi!");
                } else {
                    terisi = true;
                }
            } while (!terisi);

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                System.out.println("Input selesai! Keluar dari program.");
                break;
            }
        }
        System.out.println();
        System.out.println("---- Daftar Penonton ----");

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("***" + "\t");
                } else {
                    System.out.print(penonton[i][j] + "\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
