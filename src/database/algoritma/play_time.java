package database.algoritma;

import java.io.IOException;

import database.Main_menu;
import database.Set_data;
import database.datauser.Main_data;

public class play_time {
    
    public static void bulan() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n\n\n\n\n\n\t\t\tKamu telah melewati bulan" + Main_data.getBulan()
                    + " pada tahun " + Main_data.getTahun() + "\n\n\n\n\n\n");
            Main_menu.pause();
            Set_data.bulanan();
            
        
        
    }
}
