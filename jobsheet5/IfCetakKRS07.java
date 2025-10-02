import java.util.Scanner;

public class IfCetakKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----CETAK KRS SIAKAD----");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String hasil = (uktLunas) ? "Pembayaran UKT terverifikasi \n Silakan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan membayar UKT terlebih dahulu";
        System.out.println(hasil);
    }
}