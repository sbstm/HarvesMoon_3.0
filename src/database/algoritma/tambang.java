package database.algoritma;

import java.util.Scanner;

import database.data_random.Batu_random;
import database.dataaset.Data_tambang;
import database.datauser.Data_temp;
import database.datauser.Main_data;

public class tambang extends Data_tambang {

    static Scanner sc = new Scanner(System.in);

    public static String[][] lokasi = {
            { " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " " } };

    public static String[][] lokasi2 = {
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " } };

    public static int Banyak_batu = 0;
    public static int Banyak_emas = 0;
    public static int Banyak_silver = 0;
    public static int Banyak_perak = 0;
    public static int total_batu = 0;
    public static int total;

    public static void setTotal(int total) {
        tambang.total = total;
    }

    public static int getTotal() {
        return total;
    }

    public static void San_Morino() {
        System.out.println("=== === === === ===");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = Batu_random.jumlah();
                if (temp == 1) {
                    temp = Batu_random.jenis();
                    tambang.lokasi[i][j] = Data_tambang.getPolabatu(temp);
                    System.out.printf(" %s  ", tambang.lokasi[i][j]);
                    tambang.total_batu++;
                } else {
                    System.out.printf("    ");
                }
            }
            System.out.println("");
        }
        System.out.println("=== === === === ===");

        System.out.println("\n\nTotal Batu yang Bisa Di tambang = " + tambang.total_batu);

        int input = sc.nextInt();
        if (input > tambang.total_batu) {
            System.out.println("maaf anda kelebihan input");
        } else {
            olah(input);
            display();
        }
    }

    public static void Gegerkalong() {
        System.out.println("=== === === === === ===");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int temp = Batu_random.jumlah();
                if (temp == 1) {
                    temp = Batu_random.jenis();
                    tambang.lokasi2[i][j] = Data_tambang.getPolabatu(temp);
                    System.out.printf(" %s  ", tambang.lokasi2[i][j]);
                    tambang.total_batu++;
                } else {
                    System.out.printf("    ");
                }
            }
            System.out.println("");
        }
        System.out.println("=== === === === === ===");

        System.out.println("\n\nTotal Batu yang Bisa Di tambang = " + tambang.total_batu);

        int input = sc.nextInt();
        if (input > tambang.total_batu) {
            System.out.println("maaf anda kelebihan input");
        } else {
            olah2(input);
            display();
        }
        
    }

    public static void olah(int input) {
        Data_temp.setDuit_tambang(0);
        int tenaga = Main_data.getStamina();
        int temp2, temp4, temp3 = 0;
        Data_temp.setStamina(0);
        int hitung_tenaga = Data_temp.getStamina();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tambang.lokasi[i][j] == "0" || tambang.lokasi[i][j] == "o" || tambang.lokasi[i][j] == "O") {
                    if (temp3 < input) {
                        temp2 = 0;
                        tenaga = tenaga - 7;
                        hitung_tenaga = hitung_tenaga + 7;
                        int temp = Batu_random.tambang();
                        if (temp == 0) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_emas++;
                        } else if (temp == 1) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_silver++;
                        } else if (temp == 2) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_perak++;
                        } else {
                            Banyak_batu++;
                        }
                    }
                    temp3++;
                }
            }
        }
        Main_data.setStamina(tenaga);
        Data_temp.setStamina(hitung_tenaga);
        Main_data.setDuit(Main_data.getDuit() + Data_temp.getDuit_tambang());
        tambang.total_batu=0;
    }

    public static void olah2(int input) {
        Data_temp.setDuit_tambang(0);
        int tenaga = Main_data.getStamina();
        int temp2, temp4, temp3 = 0;
        Data_temp.setStamina(0);
        int hitung_tenaga = Data_temp.getStamina();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (tambang.lokasi2[i][j] == "0" || tambang.lokasi2[i][j] == "o" || tambang.lokasi2[i][j] == "O") {
                    if (temp3 < input) {
                        temp2 = 0;
                        tenaga = tenaga - 7;
                        hitung_tenaga = hitung_tenaga + 7;
                        int temp = Batu_random.tambang();
                        if (temp == 0) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_emas++;
                        } else if (temp == 1) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_silver++;
                        } else if (temp == 2) {
                            temp4 = Data_temp.getDuit_tambang();
                            temp2 = temp4 + Data_tambang.getH_jual(temp);
                            Data_temp.setDuit_tambang(temp2);
                            Banyak_perak++;
                        } else {
                            Banyak_batu++;
                        }
                    }
                    temp3++;
                }
            }
        }
        Main_data.setStamina(tenaga);
        Data_temp.setStamina(hitung_tenaga);
        Main_data.setDuit(Main_data.getDuit() + Data_temp.getDuit_tambang());
        tambang.total_batu=0;
    }

    public static void display() {
        System.out.println("Hasil dari Tambang sesi ini sebanyak");
        System.out.println("Emas\t= " + Banyak_emas + " buah");
        System.out.println("Silver\t= " + Banyak_silver + " buah");
        System.out.println("perak\t= " + Banyak_perak + " buah");
        System.out.println("batu\t= " + Banyak_batu + " buah");
        System.out.println("\n==================================\n");
        System.out.println("dan menghabiskan stamina sebesar " + Data_temp.getStamina() + "\ndan stamina yang tersisa "
                + Main_data.getStamina());
        Banyak_emas = 0;
        Banyak_silver= 0;
        Banyak_perak = 0;
        Banyak_batu = 0;
    }

    public static String getLokasi(int i, int j) {
        return lokasi[i][j];
    }

    public static void u_stamina() {
        if (total >= 50) {
            Main_data.setU_stamina(Main_data.getU_stamina() + 20);
        }
    }

}
