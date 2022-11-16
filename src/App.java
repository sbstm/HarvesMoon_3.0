import database.Main_menu;
import database.Play_game;
import database.Set_data;
import database.dataaset.Data_kuda;
import database.datauser.Main_data;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        char menu = '0';

        Set_data.awal();

        Play_game.start();
        Play_game.opening();

        while (menu != '*') {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Main_menu.display(Main_data.getStamina());
            Main_menu.menu();
            menu = Main_menu.pilihmenu();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            switch (menu) {
                case '1':
                    Main_menu.Profile();

                    break;
                case '2':
                    Main_menu.Kebun();

                    break;
                case '3':
                    Main_menu.Kandang();

                    break;
                case '4':
                    Main_menu.Tambang();

                    break;
                case '5':
                    Main_menu.Toko();

                    break;
                case '6':
                    if (Data_kuda.getTes() == 1) {
                        Main_menu.Kuda();
                    } else {
                        System.out.println("Kamu Belum Memiliki Kuda");
                    }
                    break;
                case '7':
                    Main_menu.Assisten();

                    break;
                case '0':
                    Main_menu.Play_time();

                    break;
                case 'x':
                    Main_menu.Exit();
                    System.exit(0);

                default:
                    System.out.println("salah input");

                    break;
            }

        }
    }
}
