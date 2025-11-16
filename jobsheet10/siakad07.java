package jobsheet10;

import java.util.Scanner;

public class siakad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah yang akan diinput: ");
        int jmlMK = sc.nextInt();
        System.out.print("Masukkan jumlah Mahasiswa yang akan diinput: ");
        int jmlMhs = sc.nextInt();

        int[][] nilai = new int[jmlMK][jmlMhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata - rata: " + totalPerSiswa / jmlMhs);
        }
        System.out.println("\n======================================");
        System.out.println("Rata - rata nilai setiap mata kuliah: ");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jmlMK);
        }
        
        sc.close();
    }
}
