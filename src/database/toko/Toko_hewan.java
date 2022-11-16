package database.toko;

import database.dataaset.Data_hewan;
import database.datauser.Data_temp;
import database.datauser.Main_data;

public class Toko_hewan {
    public static void beli(int input, int banyak) {
        Data_hewan.setJumlah(input,Data_hewan.getJumlah(input)+banyak);
        Data_temp.setDuit_hewan(Data_hewan.getH_beli(input) * banyak);
        Main_data.setDuit(Main_data.getDuit() - Data_temp.getDuit_hewan());
        System.out.println("kamu telah membeli " +Data_hewan.getJenis(input)+" sebanyak "+ banyak);
    }
}
