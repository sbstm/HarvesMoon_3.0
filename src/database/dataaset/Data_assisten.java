package database.dataaset;

public abstract class Data_assisten {
    
    protected static Boolean rawat = false;
    protected static int biaya_sewa = 50;

    public static void setRawat(Boolean rawat) {
        Data_assisten.rawat = rawat;
    }

    public static Boolean getRawat() {
        return rawat;
    }

    public static int getBiaya_sewa() {
        return biaya_sewa;
    }
    
}
