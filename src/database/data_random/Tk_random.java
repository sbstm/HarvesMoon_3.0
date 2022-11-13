package database.data_random;

import java.util.Random;

import database.dataaset.Data_tumbuhan;

public class Tk_random {

    public static Random rand = new Random();

    public static int tumbuhan() {
        boolean siram = Data_tumbuhan.getSiram();
        int batas = 10;
        int int_random = rand.nextInt(batas);
        if (siram) {
            if (int_random == 8 || int_random == 9) {
                Data_tumbuhan.setTotal(Data_tumbuhan.getTotal()-1);
                return 1;
            }
        } else if (int_random >= 6 && int_random <= 9) {
            Data_tumbuhan.setTotal(Data_tumbuhan.getTotal()-1);
            return 1;
        }
        return 0;
    }

    public static int hewan() {
        int batas = 10;
        int int_random = rand.nextInt(batas);
        if (int_random == 9) {
            return 1;
        }
        return 0;
    }
    
    public static int user() {
        int batas = 20;
        int int_random = rand.nextInt(batas);
        if (int_random == 19) {
            return 1;
        }
        return 0;
    }

}
