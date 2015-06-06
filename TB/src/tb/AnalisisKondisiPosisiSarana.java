
package finaltb;

import java.util.Scanner;


abstract class AnalisisKondisiPosisiSarana {
    Scanner scan=new Scanner(System.in);
    private int steker;
    private int kondisisteker;
    private int posisisteker;
    private int lcd;
    private int kondisilcd;
    private int posisilcd;
    private int lampu;
    private int kondisilampu;
    private int posisilampu;
    private int kipas;
    private int kondisikipas;
    private int posisikipas;
    private int ac;
    private int kondisiac;
    private int posisiac;
    private int internet;
    private int login;
    private int cctv;
    private int posisicctv;
    private int kondisicctv;

    public AnalisisKondisiPosisiSarana(int steker, int kondisisteker, int posisisteker, int lcd, int kondisilcd, int posisilcd, int lampu, int kondisilampu, int posisilampu, int kipas, int kondisikipas, int posisikipas, int ac, int kondisiac, int posisiac, int internet, int login, int kondisilogin, int cctv, int posisicctv, int kondisicctv) {
        this.steker = steker;
        this.kondisisteker = kondisisteker;
        this.posisisteker = posisisteker;
        this.lcd = lcd;
        this.kondisilcd = kondisilcd;
        this.posisilcd = posisilcd;
        this.lampu = lampu;
        this.kondisilampu = kondisilampu;
        this.posisilampu = posisilampu;
        this.kipas = kipas;
        this.kondisikipas = kondisikipas;
        this.posisikipas = posisikipas;
        this.ac = ac;
        this.kondisiac = kondisiac;
        this.posisiac = posisiac;
        this.internet = internet;
        this.login = login;
        this.cctv = cctv;
        this.posisicctv = posisicctv;
        this.kondisicctv = kondisicctv;
    }

    public int getSteker() {
        System.out.println("Jumlah Steker="+steker);
        return steker;
    }

    public String setSteker(int steker) {
        this.steker = steker;
        if(steker>=4){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisisteker() {
        switch(kondisisteker){
            case 1:System.out.println("Kondisi = Baik");
                break;}
        return kondisisteker;
    }

    public String setKondisisteker(int kondisisteker) {
        this.kondisisteker = kondisisteker;
        if(kondisisteker==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisisteker() {
         switch(posisisteker){
            case 1:System.out.println("Posisi = Pojok Ruang ");
                break;
            case 2:System.out.println("Posisi = Dekat Dosen ");}
        return posisisteker;
    }

    public String setPosisisteker(int posisisteker) {
        this.posisisteker = posisisteker;
        if(kondisisteker==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getLcd() {
        System.out.println("Jumlah LCD="+lcd);
        return lcd;
    }

    public String setLcd(int lcd) {
        this.lcd = lcd;
        if(lcd>1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisilcd() {
        switch(kondisilcd){
            case 1:System.out.println("Kondisi = Baik");
                break;}
        return kondisilcd;
    }

    public String setKondisilcd(int kondisilcd) {
        this.kondisilcd = kondisilcd;
        if(kondisilcd==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisilcd() {
        switch(posisilcd){
            case 1:System.out.println("Posisi = Pojok Ruang ");
                break;
            case 2:System.out.println("Posisi = Dekat Dosen ");}
        return posisilcd;
    }

    public String setPosisilcd(int posisilcd) {
        this.posisilcd = posisilcd;
        if(posisilcd==2){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getLampu() {
        System.out.println("Jumlah Lampu="+lampu);
        return lampu;
    }

    public String setLampu(int lampu) {
        this.lampu = lampu;
        if(lampu>18){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisilampu() {
        switch(kondisilampu){
            case 1:System.out.println("Kondisi = Baik");
                break;}
        return kondisilampu;
    }

    public String setKondisilampu(int kondisilampu) {
        this.kondisilampu = kondisilampu;
        if(kondisilampu==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisilampu() {
        switch(posisilampu){
            case 1:System.out.println("Posisi = Atap ");
                break;
            case 2:System.out.println("Posisi = Dinding ");}
        return posisilampu;
    }

    public String setPosisilampu(int posisilampu) {
        this.posisilampu = posisilampu;
        if(posisilampu==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKipas() {
        System.out.println("Jumlah Kipas Angin="+kipas);
        return kipas;
    }

    public String setKipas(int kipas) {
        this.kipas = kipas;
        if(kipas>1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisikipas() {
         switch(kondisikipas){
            case 1:System.out.println("Kondisi = Berfungsi");
                break;}
        return kondisikipas;
    }

    public String setKondisikipas(int kondisikipas) {
        this.kondisikipas = kondisikipas;
        if(kondisikipas==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisikipas() {
        switch(posisisteker){
            case 1:System.out.println("Posisi = Atap Ruangan ");
                break;
            case 2:System.out.println("Posisi = Meja Dosen ");}
        return posisikipas;
    }

    public String setPosisikipas(int posisikipas) {
        this.posisikipas = posisikipas;
        if(posisikipas==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getAc() {
        System.out.println("Jumlah Ac="+ac);
        return ac;
    }

    public String setAc(int ac) {
        this.ac = ac;
        if(ac>=1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisiac() {
        switch(kondisiac){
            case 1:System.out.println("Kondisi = Berfungsi");
                break;}
        return kondisiac;
    }

    public String setKondisiac(int kondisiac) {
        this.kondisiac = kondisiac;
        if(kondisiac==1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisiac() {
        switch(posisiac){
            case 1:System.out.println("Posisi = Pojok Ruang ");
                break;
            case 2:System.out.println("Posisi = Dinding ");}
        return posisiac;
    }

    public String setPosisiac(int posisiac) {
        this.posisiac = posisiac;
        if(posisiac==2){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getInternet() {
        System.out.println("SSID ="+internet);
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
       
    }

    public int getLogin() {
        switch(login){
            case 1:System.out.println("Login = Berhasil");
                break;}
        return login;
    }

    public String setLogin(int login) {
        this.login = login;
        if(login==1){
            return "Berhasil";}
                    else {
                            return"Tidak Berhasil";                             
                            }
    }


    

    public int getCctv() {
        System.out.println("Jumlah CCTV="+cctv);
        return cctv;
    }

    public String setCctv(int cctv) {
        this.cctv = cctv;
        if(cctv==2){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getPosisicctv() {
        switch(posisicctv){
            case 1:System.out.println("Kondisi = Berfungsi");
                break;}
        return posisicctv;
    }

    public String setPosisicctv(int posisicctv) {
        this.posisicctv = posisicctv;
        if(posisicctv==2){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public int getKondisicctv() {
        switch(kondisicctv){
            case 1:System.out.println("Kondisi = Berfungsi");
                break;}
        return kondisicctv;
    }

    public String setKondisicctv(int kondisicctv) {
        this.kondisicctv = kondisicctv;
        if(posisicctv==2){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }
    
    abstract void Steker();
    abstract void Lcd();
    abstract void Lampu();
    abstract void Kipas();
    abstract void Ac();
    abstract void Internet();
    abstract void Cctv();
    abstract void OutPosisi();
    
}
