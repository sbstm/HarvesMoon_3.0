package database.display;

import database.dataaset.Data_assisten;
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
                                + "\nUkuran\t: "
                                + "Lima x Lima" + "\nWaktu panen\t: "
                                + Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek()) + "\nPanen dalam\t: "
                                + (Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek())
                                                - Data_tumbuhan.getSelangpanen())
                                + " bulan ");
        }

        public static void kandang() {
                System.out.println(
                                "============== Kebun ================\n==========================================");
                System.out.println("\nJenis Tanaman\t: " + Data_tumbuhan.getJenis(Data_tumbuhan.getIndek())
                                + "\nUkuran\t: "
                                + "Lima x Lima" + "\nWaktu panen\t: "
                                + Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek()) + "\nPanen dalam\t: "
                                + (Data_tumbuhan.getMasa_tumbuh(Data_tumbuhan.getIndek())
                                                - Data_tumbuhan.getSelangpanen())
                                + " bulan ");
        }

        public static void Assisten() {
                System.out.println(
                                "============= Assisten ==============\n==========================================");
                System.out.println("\n\n\tAsisten anda");
                if (Data_assisten.getRawat() == true) {
                        System.out.println(" Masih bekerja ");
                } else {
                        System.out.println(" belum di sewa ");
                }
        }
}
