
package tb;



public class IdentitasRuangKelas extends AnalisisIdentitasRuangKelas {
 

    public IdentitasRuangKelas(String nama, String lokasi, String prodi) {
        super(nama, lokasi, prodi);
    }
  
    @Override  
    void Identitas(){
        System.out.println("\n\n==IDENTITAS RUANG KELAS==\n\n");
        
        System.out.println("Masukkan Nama Anda: ");
        super.setNama(scan.nextLine());
        System.out.println("Masukkan Lokasi Ruang: ");
        super.setLokasi(scan.nextLine());
        System.out.println("Masukkan Program Studi: ");
        super.setProdi(scan.nextLine());
}
    @Override
     void OutIdentitas(){
         
        super.getNama();
        super.getLokasi();
        super.getProdi();
    }
     
     
     
     
    
}

    

    



