/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantor;

/**
 *
 * @author mokletgaming
 */
public class Hasil {
    public static void main(String[] args) {
       Employee em=new Employee();
       
       CleaningService sc = new CleaningService();
       sc.job="Cleaning Service";
       sc.nama="Juned";
       sc.status="Belum Menikah";
       sc.nip=897600;
       sc.gaji=800000;
       sc.bonus=100000;
       sc.potongan=0;
       sc.waktukerja=9;
       sc.totalgaji=0;
       
       em.job();
       sc.job();
       em.nama();
       sc.nama();
       em.status();
       sc.status();
       em.nip();
       sc.nip();
       em.gaji();
       sc.gaji();
       em.bonus();
       sc.bonus();
       em.potongan();
       sc.potongan();
       em.waktukerja();
       sc.waktukerja();
       em.totalgaji();
       sc.totalgaji();
       
       Manager mn =new Manager();
       mn.job="Manager";
       mn.nama="Mino";
       mn.status="Belum Menikah";
       mn.nip=87880;
       mn.gaji=3000000;
       mn.bonus=0;
       mn.potongan=100000;
       mn.waktukerja=7;
       mn.totalgaji=0;
       
       em.job();
       mn.job();
       em.nama();
       mn.nama();
       em.status();
       mn.status();
       em.nip();
       mn.nip();
       em.gaji();
       mn.gaji();
       em.bonus();
       mn.bonus();
       em.potongan();
       mn.potongan();
       em.waktukerja();
       mn.waktukerja();
       em.totalgaji();
       mn.totalgaji();
       
       Bos bs =new Bos();
       bs.job="Bos";
       bs.nama="Jidi";
       bs.status="Sudah Menikah";
       bs.nip=875430;
       bs.gaji=3000000+(3000000*95/100);
       bs.bonus=10000000;
       bs.potongan=100000;
       bs.waktukerja=7;
       bs.totalgaji=0;
       
       em.job();
       bs.job();
       em.nama();
       bs.nama();
       em.status();
       bs.status();
       em.nip();
       bs.nip();
       em.gaji();
       bs.gaji();
       em.bonus();
       bs.bonus();
       em.potongan();
       bs.potongan();
       em.waktukerja();
       bs.waktukerja();
       em.totalgaji();
       bs.totalgaji();
       
    }
    
}
