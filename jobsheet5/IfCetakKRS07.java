import java.util.Scanner;

public class IfCetakKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----CETAK KRS SIAKAD----");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayara UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }
    }
}