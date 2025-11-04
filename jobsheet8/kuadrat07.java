package jobsheet8;

import java.util.Scanner;

public class kuadrat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int nilai = sc.nextInt();

        int i = 1;
        while (i <= nilai) {
            System.out.print("\n" + "n = " + i + "\tJumlah kuadrat = ");
            int jumlah = 0;

            int j = 1;
            while (j <= i) {
                int kuadrat = j * j;
                jumlah += kuadrat;
                if (j < i) {
                    System.out.print(j * j + " + ");
                } else if (j == i) {
                    System.out.print(j * j);
                }
                j++;
            }
            System.out.print(" = " + jumlah);
            i++;
        }

    }
}
