package jobsheet10;

import java.util.Scanner;

public class survei07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        int skorTotal = 0;

        System.out.println("=== Survei Kepuasan Pelanggan ===");

        for (int i = 0; i < survei.length; i++) {
            double skorRes = 0;
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                int skorInput;
                do {
                    System.out.print("Skor pertanyaan " + (j + 1) + " (1 - 5): ");
                    skorInput = sc.nextInt();
                    if (skorInput < 1 || skorInput > 5) {
                        System.out.println("Skor tidak valid! Masukkan nilai 1 - 5.");
                    } else {
                        break;
                    }
                } while (true);
                survei[i][j] = skorInput;
                skorRes += survei[i][j];
            }
            double rataResponden = skorRes / survei[i].length;
            System.out.printf("Nilai rata-rata responden ke-" + (i + 1) + " : %.2f", rataResponden);
            System.out.println();
        }
        for (int j = 0; j < survei[0].length; j++) {
            double skorPert = 0;
            for (int i = 0; i < survei.length; i++) {
                skorPert += survei[i][j];
            }
            double rataTanya = skorPert / survei.length;
            System.out.printf("\nNilai rata-rata pertanyaan ke-" + (j + 1) + " : %.2f", rataTanya);
        }
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[0].length; j++) {
                skorTotal += survei[i][j];
            }
        }
        int elemenTotal = survei.length * survei[0].length;
        double rataTotal = (double) skorTotal / elemenTotal;
        System.out.println();
        System.out.printf("\nTotal keseluruhan skor adalah: %d", skorTotal);
        System.out.printf("\nNilai rata=rata keseluruhan adalah: %.2f", rataTotal);
        sc.close();
    }
}
