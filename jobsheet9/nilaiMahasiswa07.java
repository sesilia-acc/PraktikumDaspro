package jobsheet9;

import java.util.Scanner;

public class nilaiMahasiswa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int tertinggi = 0, terendah = 100;
        double rataNilai, totalNilai = 0;
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        rataNilai = totalNilai / jmlMhs;
        System.out.println();
        System.out.println("Rata - rata nilai mahasiswa adalah : " + rataNilai);
        System.out.println("Nilai tertinggi adalah : " + tertinggi);
        System.out.println("Nilai terendah adalah : " + terendah);
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah " + nilaiMhs[i]);
        }
    }
}
