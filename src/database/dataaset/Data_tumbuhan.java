package database.dataaset;

public abstract class Data_tumbuhan {

    protected static char[] pola = { '$', '@', 'o', 'O', '!', ' ' };
    protected static int indek;
    protected static String[] jenis = { "Cabe", "Bawang", "Kentang", "Kol", "Jagung", " " };
    protected static int[] h_jual = { 120, 90, 50, 35, 20, 0 };
    protected static int[] h_beli = { 50, 35, 20, 15, 5, 0 };
    protected static int[] masa_tumbuh = { 4, 3, 2, 2, 2, 0 };
    protected static Boolean siram = false;
    protected static int total = 0;
    protected static int tk_tumbuhan = 0;
    protected static int selangpanen = 0;

    
    public static void setTotal(int total) {
        Data_tumbuhan.total = total;
    }

    public static void setIndek(int indek) {
        Data_tumbuhan.indek = indek;
    }

    public static int getIndek() {
        return indek;
    }

    public static int getTotal() {
        return total;
    }

    public static int getSelangpanen() {
        return selangpanen;
    }

    public static void setSelangpanen(int selangpanen) {
        Data_tumbuhan.selangpanen = selangpanen;
    }

    public static char getPola(int pilih) {
        return pola[pilih];
    }

    public static Boolean getSiram() {
        return siram;
    }

    public static int getMasa_tumbuh(int pilih) {
        return masa_tumbuh[pilih];
    }

    public static String getJenis(int pilih) {
        return jenis[pilih];
    }

    public static int getH_jual(int pilih) {
        return h_jual[pilih];
    }

    public static int getH_beli(int pilih) {
        return h_beli[pilih];
    }

    public static int getTk_tumbuhan() {
        return tk_tumbuhan;
    }

    public static void setTk_tumbuhan(int tk_tumbuhan) {
        Data_tumbuhan.tk_tumbuhan = tk_tumbuhan;
    }

    public static void setSiram(Boolean siram) {
        Data_tumbuhan.siram = siram;
    }

}
