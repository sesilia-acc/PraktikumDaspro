package jobsheet11;

public class rekapPenjualanCafe07 {
    static int[][] dataPenjualan;
    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };

    public static void inputPenjualan() {
        System.out.println("====REKAP PENJUALAN CAFE====");
        dataPenjualan = new int[][] {
                { 20, 20, 25, 20, 10, 60, 10 }, // kopi
                { 30, 80, 40, 10, 15, 20, 25 }, // teh
                { 5, 9, 20, 25, 10, 5, 45 }, // kelapa muda
                { 50, 8, 17, 18, 10, 30, 6 }, // roti bakar
                { 15, 10, 16, 15, 10, 10, 55 } // gorengan
        };
    }

    public static void tampilData(int[][]dataPenjualan, String[]menu) {
        System.out.print("Menu\t\t");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Hari %s\t", (i + 1));
        }
        System.out.println("\n----------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s\t", menu[i]);
            for (int j = 0; j < 7; j++) {
                int penjualan = dataPenjualan[i][j];
                System.out.printf("%-8s", penjualan);   
            }
            System.out.println();
        }
    }
    
    public static void penjualanTertinggi(int[][]dataPenjualan, String[]menu) {
        int tertinggi = 0;
        String menuTertinggi = "";
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            int penjualanTot = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                penjualanTot += dataPenjualan[i][j];
            }
            if (penjualanTot > tertinggi) {
                tertinggi = penjualanTot;
                menuTertinggi = menu[i];
            }
        }
        System.out.print("\n----Menu Terlaris dalam Seminggu----");
        System.out.printf("\nMenu dengan penjualan tertinggi: %s", menuTertinggi);
        System.out.printf("\nTotal penjualan: %s\t", tertinggi);
        System.out.println();
    }

    public static void tampilRata(int[][]dataPenjualan, String[]menu) {
        int rata = 0;
        for (int i = 0; i < dataPenjualan.length; i++) {
            int penjualanTot = 0;
            for (int j = 0; j < 7; j++) {
                penjualanTot += dataPenjualan[i][j];
            }
            rata = penjualanTot / 7;
            System.out.printf("%-15s\t %s\n", menu[i], rata);
        }
    }
    
    public static void main(String[] args) {
        inputPenjualan();
        System.out.println("\n----Data Penjualan dalam Seminggu----");
        tampilData(dataPenjualan, menu);
        penjualanTertinggi(dataPenjualan, menu);
        System.out.println("\n----Rata - rata Penjualan dalam Seminggu----");
        System.out.printf("%-15s\t %s\n", "Menu", "Rata - rata");
        System.out.println("-----------------------------");
        tampilRata(dataPenjualan, menu);
        
    }
}
