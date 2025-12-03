package jobsheet11;

import java.util.Scanner;

public class nilaiMahasiswa07 {
    static int N, nilaiTot = 0;
    static int[] mhs;

    public static int[] isianArray(int N, Scanner sc) {
        System.out.println("\n----Input Nilai Mahasiswa----");
        for (int i = 0; i < mhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            mhs[i] = sc.nextInt();
        }
        return mhs;
    }

    public static void tampilArray(int[] arrNilai) {
        System.out.println("\n----Nilai Mahasiswa----");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah: " + arrNilai[i]);
        }
    }

    public static int hitTot(int[] arrNilai) {
        for (int nilai : arrNilai) {
            nilaiTot += nilai;
        }
        return nilaiTot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====REKAP NILAI MAHASISWA====");
        System.out.print("Masukkan jumlah mahasiswa: ");
        N = sc.nextInt();
        mhs = new int[N];
        
        isianArray(N, sc);
        tampilArray(mhs);
        System.out.println("Total nilai seluruh mahasiswa adalah: " + hitTot(mhs));
        hitTot(mhs);
        sc.close();
    }
}
