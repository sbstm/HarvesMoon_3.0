package database.datauser;

import database.dataaset.Data_hewan;

interface Data_user {
    public static void bulan324() {
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
    
    public static void bulan34(){
        System.out.println("==== ==== ==== ==== ==== ==== ==== ====");
        for (int i = 0; i < 4; i++) {
            if (i<Data_hewan.getJumlah(1)) {
                System.out.printf("|#" + Data_hewan.getPola(1) + " ");
            } else {
                System.out.printf("|#    ");
            }
        }
        System.out.println("==== ==== ==== ====");
    }


    
}
