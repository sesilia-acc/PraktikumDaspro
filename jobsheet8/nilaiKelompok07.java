package jobsheet8;

import java.util.Scanner;

public class nilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j, nilai, kelTertinggi = 0;
        float totalNilai, rataNilai, tertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : " + "Nilai rata - rata = " + rataNilai);

            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelTertinggi = i;
            }
            i++;
        }

        System.out.print("Kelompok dengan rata - rata nilai tertinggi adalah kelompok = " + kelTertinggi);
        System.out.println("\ndengan rata - rata nilai : " + tertinggi);
    }
}
