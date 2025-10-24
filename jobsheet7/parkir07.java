package jobsheet7;

import java.util.Scanner;

public class parkir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar) : ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir : ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Masukkan jenis kendaraan terlebih dulu!");
            }
        } while (jenis != 0);
        System.out.println("Total biaya parkir adalah : Rp " + total); 
    }
}
