/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jack;

import java.util.Scanner;
public class KeamananRuangKelas {
    Scanner scan=new Scanner(System.in);
    private int kekokohan;
    private int kunci;
    private int keamanan;
    

    public int getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(int kekokohan) {
        this.kekokohan = kekokohan;
    }

    public int getKunci() {
        return kunci;
    }

    public void setKunci(int kunci) {
        this.kunci = kunci;
    }

    public int getKeamanan() {
        return keamanan;
    }

    public void setKeamanan(int keamanan) {
        this.keamanan = keamanan;
    }
    
     void Kekokohan(){
        System.out.println("\n\n==KEAMANAN RUANG KELAS==\n\n");
        System.out.println("Apakah Ruang Kelas Kokoh");
        System.out.println("1.Kokoh\n2.Tidak Kokoh\nPilih [1-2]");
        setKekokohan(scan.nextInt());
    }
    
     void Kuncipintujendela(){
        
        
        System.out.println("Apakah Ada Kunci Pintu dan Jendela");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKunci(scan.nextInt());
    }
    
     void Keamanan(){
        
        
        System.out.println("Apakah Ruang Kelas Aman");
        System.out.println("1.Aman\n2.Tidak Aman\nPilih [1-2]");
        setKeamanan(scan.nextInt());
        
        
    }
   
    
}
