package jobsheet5;

import java.util.Scanner;

public class perpus07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----LOGIN PERPUSTAKAAN----");
        System.out.print("Apakah membawa kartu mahasiswa? (True/false): ");
        boolean kartuMhs = sc.nextBoolean();

        System.out.print("Apakah sudah Registrasi online? (True/false): ");
        boolean regist = sc.nextBoolean();

        if (kartuMhs || regist) {
            System.out.println("Halo! Silakan masuk");
        } else {
            System.out.println("Gagal! Tidak boleh masuk");
        }
    }
}
