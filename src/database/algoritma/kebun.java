package database.algoritma;
 
import database.dataaset.Data_tumbuhan;
import database.datauser.Main_data;

public class kebun extends Data_tumbuhan {

    public static char[][] lokasi = { { ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ' },
            { ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ' } };

    public static void panen(int i) {        
        if (Data_tumbuhan.getSelangpanen() >= Data_tumbuhan.getMasa_tumbuh(i)) {
            Main_data.setDuit(Main_data.getDuit() + (Data_tumbuhan.getTotal() * Data_tumbuhan.getH_jual(i)));
            Data_tumbuhan.setSelangpanen(0);
            System.out.println("\t\tSelamat tanaman "+Data_tumbuhan.getJenis(Data_tumbuhan.getIndek())+" anda telah dapat di panen");
            Data_tumbuhan.setIndek(5);
        }
    }
    public static void siram() {
        int total = 0;
        int temp = Main_data.getStamina();
        stop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lokasi[i][j] == ' ') {
                    break stop;
                }
                total++;
            }
        }
        temp = temp - total;
        Main_data.setStamina(temp);
        Data_tumbuhan.setSiram(true);
    }

    public static void assiten_siram() {
        Data_tumbuhan.setSiram(true);
    }
}
