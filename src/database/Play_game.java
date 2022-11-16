package database;

import java.io.IOException;
import java.util.Scanner;

import database.datauser.Main_data;

public class Play_game {

    static Scanner sc = new Scanner(System.in);

    public static void start() {

        

        System.out.println("=======================================================");
        System.out.println("====================Harvesmoon.java====================");
        System.out.println("=======================================================");

        System.out.printf("Masukan nama karakter\t: ");
        String nama = sc.nextLine();
        Main_data.setNama(nama);
        System.out.printf("Masukan nama desa\t: ");
        String desa = sc.nextLine();
        Main_data.setDesa(desa);
        System.out.printf("Masukan usia\t\t: ");
        int usia = sc.nextInt();
        Main_data.setUmur(usia);
    }

    public static void opening() throws InterruptedException, IOException {
        Thread t2 = new Thread();
        t2.start();
        synchronized (t2) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n\n\n\n\n\n\t\t\tIni adalah cerita " + Main_data.getNama() + " yang hidup di desa"
                    + Main_data.getDesa() + "\n\n\n\n\n\n");
            Main_menu.pause();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n\n\n\n\n\n\t\t\tSaat ini kamu berumur " + Main_data.getUmur()
                    + " dengan uang awal sebesar " + Main_data.getDuit() + "\n\n\n\n\n\n");
            Main_menu.pause();
        }
    }
    
    public static void kelelahan() throws InterruptedException, IOException {
        Thread t2 = new Thread();
        t2.start();
        synchronized (t2) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n\n\n\n\n\n\t\t\tKamu Kelelahan Uang kamu Akan berkurang 500 dan Waktu akan berlanjut pada bulan selanjutnya\n\n\n\n\n\n");
            Main_menu.pause();
        }
    }
}
