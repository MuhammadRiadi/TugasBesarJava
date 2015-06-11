


package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class KenyamananRuangKelas extends AnalisisKenyamananRuangKelas {

    public KenyamananRuangKelas(String bising, String bau, String kebocoran, String kerusakan, String keausan) {
        super(bising, bau, kebocoran, kerusakan, keausan);
    }
    
     @Override
    void Bising(){
        System.out.println("\n\n==KENYAMANAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kebisingan Ruang Kelas");
        System.out.println("1.Bising\n2.Tidak Bising\nPilih [1-2]");
        setBising(scan.nextLine());
    }
     @Override   
    void Bau(){   
        
        System.out.println("Apakah Ruang Kelas Anda Bau");
        System.out.println("1.Bau\n2.Tidak Bau\nPilih [1-2]");
        setBau(scan.nextLine());
        }
    @Override
      void Kebocoran(){
        
        System.out.println("Apakah Ada Kebocoran");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKebocoran(scan.nextLine());
        }
     @Override   
      void Kerusakan(){
            
        System.out.println("Apakah Ada Kerusakan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKerusakan(scan.nextLine());
        }
      @Override
         void Keausan(){
        
        System.out.println("Apakah Ada Keausan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKeausan(scan.nextLine());
        
    }
    
     @Override
     void OutKenyamanan(){
        try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("Bising="+getBising());
            pr.println("Bau="+getBau());
            pr.println("Kebocoran="+getKebocoran());
            pr.println("Kerusakan="+getKerusakan());
            pr.println("Keausan="+getKeausan());
       
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
        
        
        
        
    
        
    }

}
