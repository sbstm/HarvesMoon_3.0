package database;

import java.io.IOException;
import java.util.Scanner;

public class Main_menu {

    static Scanner sc = new Scanner(System.in);
    
    public static char pilihmenu() throws InterruptedException, IOException {
        char menu;
        System.out.printf("pilih menu :");
        Set_data.habis_stamina();
        Set_data.Habis_duit();
        menu = sc.next().charAt(0);
        return menu;
    }

    public static void display(int Stamina) {

        int temp = Stamina / 10;

        System.out.printf("==========================================\nStamina\t\t:");
        for (int i = 0; i < temp; i++) {
            System.out.printf("+");
        }
        System.out.printf(" = " + Stamina);
        System.out.println("\n==========================================");
    }
    
    public static void menu() {
        System.out.println(
                "=============== main menu ================\n==========================================\n1. Profile\n2. Kebun\n3. Kandang\n4. Tambang\n5. Toko\n6. Kuda\n7. Assisten\n0. Play time\nx. Exit");
    }
    
    public static void Profile() {
        System.out.println(
                "Profile");
        Sub_menu.Profile();
                pause();
    }

    public static void Kebun() {
        System.out.println(
                "Kebun");
                Sub_menu.Kebun();
                pause();
    }

    public static void Kandang() {
        System.out.println(
                "Kandang");
                Sub_menu.Kandang();
                pause();
    }

    public static void Tambang() {
        System.out.println(
                "Tambang");
                Sub_menu.Tambang();
                pause();
    }

    public static void Toko() throws InterruptedException, IOException {
        System.out.println(
                "Toko");
                Sub_menu.Toko();
                pause();
    }

    public static void Kuda() throws InterruptedException, IOException {
        System.out.println(
                " Kuda");
                Sub_menu.Kuda();
                pause();
    }

    public static void Assisten() {
        System.out.println(
                "Assisten");
                Sub_menu.Assisten();
                pause();
    }

    public static void Play_time() throws InterruptedException, IOException {
        System.out.println(
                "Play time");
                Sub_menu.Play_time();
                pause();
    }

    public static void Exit() {
        System.out.println(
                "Exit");
                Sub_menu.Exit();
                pause();
    }

    public static void pause() {
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        
    }
}
