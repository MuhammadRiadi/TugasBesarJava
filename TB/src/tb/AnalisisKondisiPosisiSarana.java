/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;


public class AnalisisKondisiPosisiSarana extends KondisiPosisiSarana {

    @Override
    void StopKontak() {
        super.StopKontak(); 
        if(getSteker()>=4&&getKondisisteker()==1&&getPosisisteker()>=2){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");                             
                            }
    }

    @Override
    void Lcd() {
        super.Lcd();
        if(getLcd()>1&&getKondisilcd()==1&&getPosisilcd()==2){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");
                            }
    }

    @Override
    void Lampu() {
        super.Lampu();
        if(getLampu()>18&&getKondisilampu()==1&&getPosisilampu()==1){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");
                            }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void KipasAngin() {
        super.KipasAngin();
        if(getKipas()>1&&getKondisikipas()==1&&getPosisikipas()==1){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");
                            }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Ac() {
        super.Ac();
        if(getAc()>=1&&getKondisiac()==1&&getPosisiac()==2){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");
                            }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Internet() {
        super.Internet();
        if(getInternet()==1&&getLogin()==1){
        System.out.println("Sesuai");}
        else
        {
                System.out.println("Tidak Sesuai");
                }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Cctv() {
        super.Cctv();
        if(getCctv()==2&&getKondisicctv()==1&&getPosisicctv()==2){
            System.out.println("Sesuai");}
                    else {
                            System.out.println("Tidak Sesuai");
                            }//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
