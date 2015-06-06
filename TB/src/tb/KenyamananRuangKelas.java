


package finaltb;


public class KenyamananRuangKelas extends AnalisisKenyamananRuangKelas {

    public KenyamananRuangKelas(int bising, int bau, int kebocoran, int kerusakan, int keausan) {
        super(bising, bau, kebocoran, kerusakan, keausan);
    }
    
     @Override
    void Bising(){
        System.out.println("\n\n==KENYAMANAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kebisingan Ruang Kelas");
        System.out.println("1.Bising\n2.Tidak Bising\nPilih [1-2]");
        setBising(scan.nextInt());
    }
     @Override   
    void Bau(){   
        
        System.out.println("Apakah Ruang Kelas Anda Bau");
        System.out.println("1.Bau\n2.Tidak Bau\nPilih [1-2]");
        setBau(scan.nextInt());
        }
    @Override
      void Kebocoran(){
        
        System.out.println("Apakah Ada Kebocoran");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKebocoran(scan.nextInt());
        }
     @Override   
      void Kerusakan(){
            
        System.out.println("Apakah Ada Kerusakan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKerusakan(scan.nextInt());
        }
      @Override
         void Keausan(){
        
        System.out.println("Apakah Ada Keausan");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        setKeausan(scan.nextInt());
        
    }
    
     @Override
     void OutKenyamanan(){
        System.out.println("==KENYAMANAN RUANG KELAS==");
        super.getBising();
        super.getBau();
        super.getKerusakan();
        super.getKebocoran();
        super.getKeausan();
        
        
        
        
    
        
    }

}
