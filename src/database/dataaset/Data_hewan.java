package database.dataaset;

public abstract class Data_hewan {
    
    protected static String[] pola = { "4=|", "7o" };
    protected static int[] jumlah = {0,0};

    protected static String[] jenis ={"Sapi","Ayam"};
    protected static int[] h_jual = {100,60,20};
    protected static int[] h_beli= {1500,150};
    protected static Boolean rawat = false;
    protected static int tk_hewan = 0;

    public static String getPola(int pilih) {
        return pola[pilih-1];
    }

    public static String getJenis(int pilih) {
        return jenis[pilih-1];
    }

    public static int getH_jual(int pilih) {
        return h_jual[pilih-1];
    }

    public static int getH_beli(int pilih) {
        return h_beli[pilih - 1];
    }

    public static int getTk_hewan() {
        return tk_hewan;
    }

    public static void setJumlah(int i, int jumlah) {
        Data_hewan.jumlah [i]= jumlah;
    }
    public static int getJumlah(int i) {
        return jumlah[i];
    }

    public static void setTk_hewan(int tk_hewan) {
        Data_hewan.tk_hewan = tk_hewan;
    }

    public static Boolean getRawat() {
        return rawat;
    }

    public static void setRawat(Boolean rawat) {
        Data_hewan.rawat = rawat;
    }
    
    
}
