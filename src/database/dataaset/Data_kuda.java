package database.dataaset;

import java.io.IOException;
import java.util.Scanner;

import database.Main_menu;
import database.datauser.Main_data;

public class Data_kuda {

    static Scanner sc = new Scanner(System.in);
    protected static String nama_kuda;
    protected static int tes= 0;

    public static int getTes() {
        return tes;
    }
    public static void setTes(int tes) {
        Data_kuda.tes = tes;
    }
    
    public static void setNama_kuda() {
        String nama_kuda = sc.nextLine();
        Data_kuda.nama_kuda = nama_kuda;
    }

    public static String getNama_kuda() {
        return nama_kuda;
    }

    public static void main_bareng() throws InterruptedException, IOException {
        Thread2 t2 = new Thread2();

        t2.start();
        synchronized (t2) {
            System.out.println("masukan lama durasi kuda (detik)");
            int z = sc.nextInt();
            z = z * 10 / 6;
            for (int i = z; i > 0; i--) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       //_//_");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("   __ / * * /");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("  /__       |");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("  \\____     \\_________________");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       \\                   \\__ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("        |                   \\ \\ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("        |  _  ________  _   / / /");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       / / / /       / / / /  |_|");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("      / / / /       / / / /");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("      \\ \\ \\ \\       \\ \\ \\ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       \\ \\ \\ \\       \\ \\ \\ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       /_| /_|       /_| /_|");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                t2.wait(300);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("      //_//_");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("  __ / * * /");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println(" /__       |");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println(" \\____     \\_________________");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("      \\                   \\__ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       |                   \\ \\ \\");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       |  __   _____   _   / / /");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       | |  | |     | | | |  |_|");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       | |  | |     | | | |");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       | |  | |     | | | |");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("       | |  | |     | | | |");
                for (int j = i; j > 0; j--) {
                    System.out.printf(" ");
                }
                System.out.println("      /__| /__|    /__|/__|");
                t2.wait(300);
            }
        }
    }

    public static void dapat_kuda() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n\n\n\n\n\n\t\t\tpada Bulan ini kamu mendapat kuda\n\n\n\n\n\n");
        Main_menu.pause();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.printf("\n\n\n\n\n\n\t\t\tsilahkan masukan nama kudanya ");
        setNama_kuda();
        System.out.println("\n\n\n\n\n\n");
        Main_menu.pause();
    }

    public static void absen() {
        String nama = Main_data.getNama();
        System.out.println("\n\n\n\n\n\n\t\t\t"+Data_kuda.getNama_kuda()+" : makasih boss " + nama + " kamu memang terbaik\n\n\n\n\n\n");
        Main_menu.pause();
    }
}

class Thread2 extends Thread {
    int total = 0;
    public void run() {
        synchronized (this) {
            this.notify();
        }
    }
}