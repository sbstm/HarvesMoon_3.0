package database.datauser;

public abstract class Main_data {
    
    protected static String nama;
    protected static String desa;
    protected static int umur;
    protected static int stamina;
    protected static int u_stamina;
    protected static int duit;
    protected static int bulan;
    protected static int tahun;
    protected static int tk_user;

    public static void setU_stamina(int u_stamina) {
        Main_data.u_stamina = u_stamina;
    }

    public static  void setNama(String nama) {
        Main_data.nama = nama;
    }

    public static  void setDesa(String desa) {
        Main_data.desa = desa;
    }

    public static  void setStamina(int stamina) {
        Main_data.stamina = stamina;
    }
    public static  void setBulan(int bulan) {
        Main_data.bulan = bulan;
    }

    public static  void setTahun(int tahun) {
        Main_data.tahun = tahun;
    }

    public static  void setUmur(int umur) {
        Main_data.umur = umur;
    }

    public static void setDuit(int duit) {
        Main_data.duit = duit;
    }

    public static int getU_stamina() {
        return u_stamina;
    }

    public static  int getStamina() {
        return stamina;
    }

    public static  String getNama() {
        return nama;
    }

    public static  String getDesa() {
        return desa;
    }

    public static  int getDuit() {
        return duit;
    }
    

    public static  int getTk_user() {
        return tk_user;
    }

    public static int getBulan() {
        return bulan;
    }

    public static int getTahun() {
        return tahun;
    }

    public static int getUmur() {
        return umur;
    }
    
}
