package jobsheet8;

import java.util.Scanner;

public class persegi07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Masukkan angka yang lebih besar");
            return;
        }

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
