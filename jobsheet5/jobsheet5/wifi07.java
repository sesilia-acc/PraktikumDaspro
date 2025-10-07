package jobsheet5;

import java.util.Scanner;

public class wifi07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user;
        System.out.print("Masukkan jenis user! (Dosen/Mahasiswa): ");
        user = sc.nextLine();

        if (user.equalsIgnoreCase("Dosen")) {
            System.out.print("Akses WiFi diberikan (dosen)");

        } else if (user.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
