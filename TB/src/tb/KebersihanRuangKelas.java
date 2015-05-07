
package jack;
import java.util.Scanner;
public class KebersihanRuangKelas {
    Scanner scan=new Scanner(System.in);
    private int udara;
    private int cahaya;
    private int kelembapan;
    private int suhu;

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    public int getCahaya() {
        return cahaya;
    }

    public void setCahaya(int cahaya) {
        this.cahaya = cahaya;
    }

    public int getUdara() {
        return udara;
    }

    public void setUdara(int udara) {
        this.udara = udara;
    }

 

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }
    
     void SirkulasiUdara(){
        System.out.println("\n\n==KEBERSIHAN RUANG KELAS==\n\n");
        System.out.println("Masukkan Sirkulasi Udara");
        System.out.println("1.Lancar\n2.Tidak Lancar\nPilih [1-2]");
        setUdara(scan.nextInt());
          
        }
        
     void Pencahayaan(){
        System.out.println("Masukkan Nilai Pencahayaan [250-350]");
        setCahaya(scan.nextInt());
        
     }
      
     void Kelembapan(){
        System.out.println("Input Kelembapan [70%-80%]=");
        setKelembapan(scan.nextInt());
       
     }
        
     void Suhu(){
        System.out.println("Input Suhu [25-35]=");
        setSuhu(scan.nextInt());
 }
    
    
}
        
    
