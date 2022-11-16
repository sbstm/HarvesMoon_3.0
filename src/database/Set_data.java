package database;

import java.io.IOException;

import database.algoritma.kebun;
import database.algoritma.tambang;
import database.data_random.Tk_random;
import database.dataaset.Data_assisten;
import database.dataaset.Data_kuda;
import database.dataaset.Data_tumbuhan;
import database.datauser.Main_data;

public class Set_data {
    
    public static void awal() {
        Main_data.setTahun(0);
        Main_data.setBulan(1);
        Main_data.setU_stamina(0);
        Main_data.setStamina(100);
        Main_data.setDuit(750);
        tambang.setTotal(0);
        Data_tumbuhan.setIndek(5);
    }

    public static void bulanan() {
        //bulan ke 3 mendapat kuda
        if (Main_data.getBulan() == 3 && Data_kuda.getTes() == 0) {
            Data_kuda.setTes(1);
            Data_kuda.setNama_kuda();
        }
        //operasi umum
        Main_data.setBulan(Main_data.getBulan() + 1);
        Main_data.setDuit(Main_data.getDuit() - 30);
        //operasï assisten
        if (Data_assisten.getRawat()==true) {
            Main_data.setDuit(Main_data.getDuit() - Data_assisten.getBiaya_sewa());
            kebun.assiten_siram();
        }
        //tingkat kematian
        Tk_random.hewan();
        Tk_random.tumbuhan();
        Tk_random.user();
        //operasi tanaman
        Data_tumbuhan.setSelangpanen(Data_tumbuhan.getSelangpanen()-1);
        kebun.panen(Data_tumbuhan.getIndek());
        //operasi tambang
        tambang.u_stamina();
        //set tahun ketika bulan udah 13
        if (Main_data.getBulan() == 13) {
            Main_data.setTahun(Main_data.getTahun() + 1);
            Main_data.setBulan(1);
        }
        //upgrade stamina ketika memenuhi syarat
        Main_data.setStamina(100 + Main_data.getU_stamina());
    }

    public static void habis_stamina() throws InterruptedException, IOException {
        if (Main_data.getStamina()<=0) {
            Main_data.setDuit(Main_data.getDuit() - 500);
            
        }
    }
}
