package database.toko;

import database.dataaset.Data_tumbuhan;
import database.datauser.Data_temp;
import database.datauser.Main_data;

public class Toko_tumbuhan {
    public static void beli(int input, int banyak) {
        Data_tumbuhan.setIndek(input - 1);
        Data_tumbuhan.setTotal(banyak);
        Data_temp.setDuit_tumbuhan(Data_tumbuhan.getH_beli(input) * banyak);
        Main_data.setDuit(Main_data.getDuit() - Data_temp.getDuit_tumbuhan());
        Data_tumbuhan.setSelangpanen(Data_tumbuhan.getIndek());
    }
}
