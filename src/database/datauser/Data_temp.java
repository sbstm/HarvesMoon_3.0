package database.datauser;

public class Data_temp {

    protected static int duit_tambang;
    protected static int duit_hewan;
    protected static int duit_tumbuhan;
    protected static int pengeluaran;
    protected static int stamina;
    protected static int diut_total;
    
    public static int getDiut_total() {
        return diut_total;
    }
    public static void setDiut_total(int diut_total) {
        Data_temp.diut_total = diut_total;
    }

    public static void setDuit_tambang(int duit_tambang) {
        Data_temp.duit_tambang = duit_tambang;
    }

    public static int getDuit_tambang() {
        return duit_tambang;
    }

    public static void setDuit_hewan(int duit_hewan) {
        Data_temp.duit_hewan = duit_hewan;
    }

    public static int getDuit_hewan() {
        return duit_hewan;
    }

    public static void setDuit_tumbuhan(int duit_tumbuhan) {
        Data_temp.duit_tumbuhan = duit_tumbuhan;
    }

    public static int getDuit_tumbuhan() {
        return duit_tumbuhan;
    }
    
    
    public static void setPengeluaran(int pengeluaran) {
        Data_temp.pengeluaran = pengeluaran;
    }
    public static int getPengeluaran() {
        return pengeluaran;
    }


    public static void setStamina(int stamina) {
        Data_temp.stamina = stamina;
    }
    

    public static int getStamina() {
        return stamina;
    }
    
}
