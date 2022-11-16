package database.data_random;

import java.io.IOException;
import java.util.Random;

import database.dataaset.Data_hewan;
import database.dataaset.Data_tumbuhan;
import database.display.Game_over;

public class Tk_random {

    public static Random rand = new Random();

    public static int tumbuhan() {
        boolean siram = Data_tumbuhan.getSiram();
        int batas = 10;
        int int_random = rand.nextInt(batas);
        if (siram) {
            if (int_random == 8 || int_random == 9) {
                Data_tumbuhan.setTotal(Data_tumbuhan.getTotal() - 1);
                System.out.println("maaf tanaman kamu mati 1 karena badai");
                return 1;
            }
        } else if (int_random >= 6 && int_random <= 9) {
            Data_tumbuhan.setTotal(Data_tumbuhan.getTotal() - 1);
            System.out.println("maaf tanaman kamu mati 1 karena lupa disiram");
            return 1;
        }
        return 0;
    }

    public static int hewan() {
        int batas = 10;
        int int_random = rand.nextInt(batas);
        if (int_random == 9) {
            if (Data_hewan.getJumlah(1)!=0) {
                Data_hewan.setJumlah(1, Data_hewan.getJumlah(1) - 1);
                System.out.println("maaf ayam kamu mati 1 karena flu");
            }
            return 1;
        }
        return 0;
    }
    
    public static int user() throws InterruptedException, IOException {
        int batas = 50;
        int int_random = rand.nextInt(batas);
        if (int_random == 49) {
            Game_over.Penyakit();
            return 1;
        }
        return 0;
    }

}
