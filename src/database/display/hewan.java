package database.display;

import database.dataaset.Data_hewan;

public class hewan {
    public static void sapi() {
        System.out.println("===== ===== ===== =====");
        for (int i = 0; i < 4; i++) {
            if (i < Data_hewan.getJumlah(0)) {
                System.out.printf("|#" + Data_hewan.getPola(0) + " ");
            } else {
                System.out.printf("|#    ");
            }
        }
        System.out.println("===== ===== ===== =====");
    }

    public static void ayam() {
        System.out.println("==== ==== ==== ==== ==== ==== ==== ====");
        for (int i = 0; i < 4; i++) {
            if (i < Data_hewan.getJumlah(1)) {
                System.out.printf("|#" + Data_hewan.getPola(1) + " ");
            } else {
                System.out.printf("|#    ");
            }
        }
        System.out.println("==== ==== ==== ====");
    }
    public static void panggil() {
        System.out.println("\n\n___Kandang Ayam__\n");
        ayam();
        System.out.println("\n\n___Kandang Sapi__\n");
        sapi();
        
    }
}
