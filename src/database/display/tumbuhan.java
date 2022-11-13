package database.display;

import java.io.IOException;

import database.Main_menu;
import database.dataaset.Data_tumbuhan;
import database.datauser.Data_temp;

public class tumbuhan {

    public static void panen() {
        System.out.println(
                "Selamat kebun " + Data_tumbuhan.getJenis(Data_tumbuhan.getIndek()) + " sudah dapat dipanen sebanyak "
                        + Data_tumbuhan.getTotal() + " dan Mendapatkan uang sebesar " + Data_temp.getDuit_tumbuhan());
        Data_temp.setDiut_total(Data_temp.getDiut_total() + Data_temp.getDuit_tumbuhan());
        Data_temp.setDuit_tumbuhan(0);
    }

    public void mati() throws InterruptedException, IOException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n\n\n\n\n\n\t\t\tTanaman " + Data_tumbuhan.getJenis(Data_tumbuhan.getIndek())
                + " mati 1 karena faktor alam\n\n\n\n\n\n");
        Main_menu.pause();
    }
    
    public static void tampilan() {
        int temp = 1;
        System.out.println("=== === === === ===");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (temp <= Data_tumbuhan.getTotal()) {
                    System.out.printf("|%c| ", Data_tumbuhan.getPola(Data_tumbuhan.getIndek()));
                } else {
                    System.out.printf("| | ");
                }
                temp++;
            }
            System.out.println("\n=== === === === ===");
        }
    }
}
