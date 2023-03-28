/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantor;


public class Bos extends Employee{
    String nama;
    String status,job;
    int nip;
    int gaji;
    int bonus;
    int potongan; 
    int waktukerja;
    int totalgaji;
   
    @Override
    public void job(){
        System.out.println("Job         : "+job);
    }
    public void nama(){
        System.out.println("Nama        : "+nama);
        }
    public void status(){
        System.out.println("Status      : "+status);
    }
    public void nip(){
        System.out.println("NIP         : "+nip);
    }
    public void gaji(){
        System.out.println("Gaji        : "+gaji);
    }
    public void bonus(){
        System.out.println("Bonus       : "+bonus);
    }
    public void potongan(){
        System.out.println("Potongan    :"+potongan);
    }
    public void waktukerja(){
        System.out.println("Waktu Kerja : "+waktukerja);
    }
    public void totalgaji(){
        int totalgaji=gaji+bonus-100000;
        System.out.println("Total Gaji  : "+totalgaji);
    }
}
