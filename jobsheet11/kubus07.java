package jobsheet11;

public class kubus07 {
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume; 
    }
    public static int hitungLuasPer(int sisi) {
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        System.out.println("Volume kubus adalah: " + hitungVolume(8) + " cm(kubik)");
        System.out.println("Luas permukaan kubus adalah: " + hitungLuasPer(6) + " cm(kuadrat)");
    }
}
