/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;


public class KeamananRuangKelas extends AnalisisKeamananRuangKelas {

    public KeamananRuangKelas(String kekokohan, String kunci, String keamanan) {
        super(kekokohan, kunci, keamanan);
    }
   
    @Override
     void Kekokohan(){
        System.out.println("\n\n==KEAMANAN RUANG KELAS==\n\n");
        System.out.println("Apakah Ruang Kelas Kokoh");
        System.out.println("1.Kokoh\n2.Tidak Kokoh\nPilih [1-2]");
        super.setKekokohan(scan.nextLine());
        super.getKekokohan();
    }
    @Override
             
     void Kuncipintujendela(){
        
        
        System.out.println("Apakah Ada Kunci Pintu dan Jendela");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        super.setKunci(scan.nextLine());
        super.getKunci();
        
    }
    @Override
     void Keamanan(){
        
        
        System.out.println("Apakah Ruang Kelas Aman");
        System.out.println("1.Aman\n2.Tidak Aman\nPilih [1-2]");
        super.setKeamanan(scan.nextLine());
        super.getKeamanan();
        
        
    }
     @Override
     void OutputKeamanan(){
         getKekokohan();
         getKunci();
         getKeamanan();
     }
   
    
}
