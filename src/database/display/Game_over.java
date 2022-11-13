package database.display;

import java.io.IOException;

import database.Main_menu;
import database.datauser.Main_data;

public class Game_over {

    public void Habis_duit() throws InterruptedException, IOException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n\n\n\n\n\n\t\t\tKamu kalah Karena Duit kamu telah 0 rupiah \n\n\n\n\n\n");
        Main_menu.pause();
    }

    public void Penyakit() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n\n\n\n\n\n\t\t\tKamu meninggal karena faktor alam\n\n\n\n\n\n");
        Main_menu.pause();
    }
}
