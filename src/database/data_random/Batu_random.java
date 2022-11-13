package database.data_random;

import java.util.Random;

public class Batu_random {
    
    public static Random rand = new Random();

    public static int jumlah() {
        int batas = 2;
        int int_random = rand.nextInt(batas);
        return int_random;
    }

    public static int jenis() {
        int batas = 3;
        int int_random = rand.nextInt(batas);
        return int_random;
    }

    public static int tambang() {
        int batas = 11;
        int int_random = rand.nextInt(batas);
    if (int_random==10) {
        return 0;
    }else if (int_random==9||int_random==8) {
        return 1;
    }else if (int_random>=5 && int_random<=7) {
        return 2;
    }
    return 3;
    }

}
