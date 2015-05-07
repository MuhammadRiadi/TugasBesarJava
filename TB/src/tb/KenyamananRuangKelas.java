


package riadi;

import java.util.Scanner;
public class KenyamananRuangKelas {
    Scanner scan=new Scanner(System.in);
        private int bising;
        private int bau;
        private int kebocoran;
        private int kerusakan;
        private int keausan;
        
    public int getBising() {
        return bising;
    }

    public void setBising(int bising) {
        this.bising = bising;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }

    public int getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(int kebocoran) {
        this.kebocoran = kebocoran;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }

    public int getKeausan() {
        return keausan;
    }

    public void setKeausan(int keausan) {
        this.keausan = keausan;
    }
    
    
    
    public void Bising(){
        System.out.println("\n\n==KENYAMANAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kebisingan Ruang Kelas");
        System.out.println("1.Bising\n2.Tidak Bising\nPilih [1-2]");
        setBising(scan.nextInt());
    }
        
        public void bau(){   
        
        System.out.println("Apakah Ruang Kelas Anda Bau");
        System.out.println("1.Bau\n2.Tidak Bau\nPilih [1-2]");
        setBau(scan.nextInt());
        }
        public void Kebocoran(){
        
        System.out.println("Apakah Ada Kebocoran");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKebocoran(scan.nextInt());
        }
        
        public void Kerusakan(){
            
        System.out.println("Apakah Ada Kerusakan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKerusakan(scan.nextInt());
        }
        public void Keausan(){
        
        System.out.println("Apakah Ada Keausan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKeausan(scan.nextInt());
        
    }
    
    public void OutKenyamanan(){
        System.out.println("==KENYAMANAN RUANG KELAS==");
        switch(getBising()){
            case 1: System.out.println("Kebisingan = Iya");
                break;
            case 2: System.out.println("Kebisingan = Tidak ");
                
        }
        switch(getBau()){
            case 1: System.out.println("Bau = Iya");
                break;
            case 2: System.out.println("Bau = Tidak ");
        break;
    }
        switch(getKebocoran()){
            case 1: System.out.println("Kebocoran = Iya");
                break;
            case 2: System.out.println("Kebocoran = Tidak ");
                break;
        }   
        switch(getKerusakan()){
            case 1: System.out.println("Kerusakan = Iya");
                break;
            case 2: System.out.println("Kerusakan= Tidak ");
                break;
    }
            switch(getKeausan()){
            case 1: System.out.println("Keausan = Iya");
                break;
            case 2: System.out.println("Keausan = Tidak ");
                break;
            }
    
        
    }
}
