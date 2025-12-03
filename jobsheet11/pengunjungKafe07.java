package jobsheet11;

public class pengunjungKafe07 {
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung();
    }
}
