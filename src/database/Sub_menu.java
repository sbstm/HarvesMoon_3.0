package database;

import java.io.IOException;
import java.util.Scanner;

import database.algoritma.play_time;
import database.algoritma.tambang;
import database.dataaset.Data_assisten;
import database.dataaset.Data_hewan;
import database.dataaset.Data_kuda;
import database.dataaset.Data_tumbuhan;
import database.display.tumbuhan;
import database.toko.Toko_hewan;
import database.toko.Toko_tumbuhan;

public class Sub_menu {

    static Scanner sc = new Scanner(System.in);

    public static void Profile() {
        System.out.println(
                "=========== Profile menu ============\n==========================================\n1. Profile Data\n2. Kebun\n3. Kandang\n4. Assisten\n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                database.display.Profile.main();
                break;
            case 2:
                database.display.Profile.kebun();
                break;
            case 3:
                database.display.Profile.kandang();
                break;
            case 4:
                database.display.Profile.Assisten();
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Kebun() {
        System.out.println(
                "============= Kebun menu =============\n==========================================\n1. Liat Kebun\n2. Siram Tanaman \n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                tumbuhan.tampilan();
                break;
            case 2:
                database.algoritma.kebun.siram();
                break;
            default:
                Main_menu.menu();
                break;
        }

    }

    public static void Kandang() {
        System.out.println(
                "============ Kandang menu ============\n==========================================\n1. Liat Kandang\n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                database.display.hewan.panggil();
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Tambang() {
        System.out.println(
                "============ Tambang menu ============\n==========================================\n1. Goa San Morino\n2. Goa Gegerkalong \n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                tambang.San_Morino();
                break;
            case 2:
                tambang.Gegerkalong();
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Toko() throws InterruptedException, IOException {
        System.out.println(
                "============= Toko menu ==============\n==========================================\n1. Toko Hewan\n2. Toko Tanaman \n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println(
                        "\n- Sapi menghasilkan susu dengan harga jual 100 Rupiah\n- Ayam menghasilkan telur dengan harga jual 20 Rupiah");
                System.out.println(
                        "\n2. Sapi 1500/ekor\n2. Ayam 150 Rp/ekor");
                int i = sc.nextInt();

                System.out.printf(
                        "Beli %s sebanyak: ", Data_hewan.getJenis(i - 1));
                int j = sc.nextInt();
                Toko_hewan.beli(i - 1, j);
                break;
            case 2:
                System.out.println(
                        "lama tumbuh tanaman:\n- cabe\t\t4 bulan\n- bawang\t3 bulan\n- kentang\t2 bulan\n- kol\t\t2 bulan\n- jagung\t2 bulan\n");
                System.out.println(
                        "Harga jual:\n- cabe\t\t120 Rp/buah\n- bawang\t90 Rp/buah\n- kentang\t50 Rp/buah\n- kol\t\t35 Rp/buah\n- jagung\t20 Rp/buah\n");
                System.out.println(
                        "Harga bibit:\n1.cabe\t\t50 Rp/bibit\n2.bawang\t35 Rp/bibit\n3.kentang\t20 Rp/bibit\n4.kol\t\t15 Rp/bibit\n5.jagung\t5 Rp/bibit\n");
                i = sc.nextInt();

                System.out.printf(
                        "Beli %s sebanyak: ", Data_tumbuhan.getJenis(i - 1));
                j = sc.nextInt();
                Toko_tumbuhan.beli(i - 1, j);
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Kuda() throws InterruptedException, IOException {
        System.out.println(
                "============= Kuda menu ==============\n==========================================\n1. Liat Kuda\n2. Absen Kuda \n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                Data_kuda.main_bareng();
                break;
            case 2:
                Data_kuda.absen();
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Assisten() {
        System.out.println(
                "=========== Assisten menu ============\n==========================================\n1. Sewa Assisten\n2. Stop Assisten\n3. info Assisten\n0. Back");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                Data_assisten.setRawat(true);
                break;
            case 2:
                Data_assisten.setRawat(false);
                break;
                case 3:
                database.display.Profile.Assisten();
                break;
            default:
                Main_menu.menu();
                break;
        }
    }

    public static void Play_time() throws InterruptedException, IOException {
        play_time.bulan();
    }

    public static void Exit() {
        System.out.println(
                "============= Kamu Yakin ==============\n==========================================\n1. Ya\n2. Tidak");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.exit(0);
                break;
            case 2:
                Main_menu.menu();
                break;
            default:
                Main_menu.menu();
                break;
        }

    }
}
