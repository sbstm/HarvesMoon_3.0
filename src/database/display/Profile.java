package database.display;

import database.dataaset.Data_assisten;
import database.dataaset.Data_hewan;
import database.dataaset.Data_tumbuhan;
import database.datauser.Main_data;

public class Profile {

        public static void main() {
                System.out.println(
                                "============= Profile ===============\n==========================================");
                System.out.println(
                                "\nNama\t: " + Main_data.getNama() + "\nDesa\t: " + Main_data.getDesa() + "\nUsia\t: "
                                                + Main_data.getUmur() + "\nDuit\t: " + Main_data.getDuit()
                                                + "\nwaktu\t: " + Main_data.getBulan()
                                                + " bulan " + Main_data.getTahun() + " tahun");
        }

        public static void kebun() {
                System.out.println(
                                "============== Kebun ================\n==========================================");
                System.out.println("\nJenis Tanaman\t: " + Data_tumbuhan.getJenis(Data_tumbuhan.getIndek())
                                + "\nUkuran\t\t: Lima x Lima\nWaktu panen\t: "
                                + Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek()) + " bulan\nPanen dalam\t: "
                                + (Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek())
                                                - Data_tumbuhan.getSelangpanen())
                                + " bulan\nStatus siram\t: "
                                + Data_tumbuhan.getSiram());
        }

        public static void kandang() {
                System.out.println(
                                "============== kandang ================\n==========================================");
                System.out.println("\nJumlah ayam\t: " + Data_hewan.getJumlah(1)
                                + "\nJumlah sapi\t: " + Data_hewan.getJumlah(0));
        }

        public static void Assisten() {
                System.out.println(
                                "============= Assisten ==============\n==========================================");
                System.out.printf("\n\n\tAsisten anda");
                if (Data_assisten.getRawat() == true) {
                        System.out.printf(" Masih bekerja\n\n");
                } else {
                        System.out.printf(" belum di sewa\n\n");
                }
        }
}
