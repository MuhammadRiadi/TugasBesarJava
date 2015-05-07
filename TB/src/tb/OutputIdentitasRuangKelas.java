/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;

/**
 *
 * @author Predator
 */
public class OutputIdentitasRuangKelas extends IdentitasRuangKelas {
    public void OutIdentitas(){
        System.out.println("Nama:"+getNama()+"\nLokasi Ruang: "+getLokasi()+"\nProgram Studi: "+getProdi());
    }
    
    
}
