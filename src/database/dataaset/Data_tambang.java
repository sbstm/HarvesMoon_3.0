package database.dataaset;

public class Data_tambang {

    protected static String[] polabatu = { "o", "O", "0" };
    protected static String[] pola = { "$$$", "$$", "$" };
    protected static String[] jenis = { "Emas", "Silver", "Perak" };
    protected static int[] h_jual = { 80, 30, 10 };
    protected static int total = 0;

    public static String getJenis(int pilih) {
        return jenis[pilih];
    }

    public static int getH_jual(int pilih) {
        return h_jual[pilih];
    }

    public static String getPola(int pilih) {
        return pola[pilih];
    }

    public static String getPolabatu(int pilih) {
        return polabatu[pilih];
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Data_tambang.total = total;
    }

}
