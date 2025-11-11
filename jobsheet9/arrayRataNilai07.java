package jobsheet9;

import java.util.Scanner;

public class arrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double rataLulus, rataTdkLulus, lulus = 0, tdkLulus = 0, nilaiLulus = 0, nilaiTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                nilaiLulus += nilaiMhs[i];
                lulus++;
            } else {
                nilaiTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        rataLulus = (lulus > 0) ? nilaiLulus / lulus : 0;
        rataTdkLulus = (tdkLulus > 0) ? nilaiTdkLulus / tdkLulus : 0;
        System.out.println("Rata - rata nilai lulus = " + rataLulus);
        System.out.println("rata - rata nilai tidak lulus = " + rataTdkLulus);
    }
}
