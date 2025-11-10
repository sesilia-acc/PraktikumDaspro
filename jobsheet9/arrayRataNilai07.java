package jobsheet9;

import java.util.Scanner;

public class arrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rerata;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        rerata = total / nilaiMhs.length;
        System.out.println("Rata - rata nilai = " + rerata);
        System.out.println("Mahasiswa lulus = " + lulus);
    }
}
