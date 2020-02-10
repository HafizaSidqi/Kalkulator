//TUGAS PRAKTIKUM PBO MEMBUAT MENU VOLUME BANGUN RUANG
//HAFIZA SIDQI AMINI
//123180130

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubangunruang;
import java.util.Scanner;
/**
 *
 * @author Ikhsan
 */
public class MenuBangunRuang {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
    Scanner pilih = new Scanner(System.in);
    
        Volume volume = new Volume();
        int pilihan;
        
        System.out.println("PILIHAN : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas Segitiga");
        System.out.println("Masukkan Pilihan = ");
        pilihan = pilih.nextInt();            //input pilihan
        
        //switch case
        switch (pilihan)
        {
            case 1 :    Scanner pjg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Panjang");
                        double p_balok = pjg_balok.nextDouble();
                        
                        Scanner lbr_balok = new Scanner(System.in);
                        System.out.println("Masukkan Lebar");
                        double l_balok = lbr_balok.nextDouble();
                        
                        Scanner tg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Tinggi");
                        double t_balok = tg_balok.nextDouble();
                        
                    double volume_balok = volume.balok(p_balok, l_balok, t_balok);
                    System.out.println("Volume Balok = "+ volume_balok);
                        break;
            
            case 2 :    Scanner jari2 = new Scanner(System.in);
                        System.out.println("Masukkan Jari-jari");
                        double r_kerucut = jari2.nextDouble();
                        
                        Scanner tg_kerucut = new Scanner(System.in);
                        System.out.println("Masukkan tinggi");
                        double t_kerucut = tg_kerucut.nextDouble();
                        
                    double volume_kerucut = volume.kerucut(r_kerucut, t_kerucut);
                    System.out.println("Volume = "+ volume_kerucut);
                    break;
                    
            case 3 :    Scanner als_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan Alas Segitiga");
                        double a_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan tinggi segitiga");
                        double t_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_limas = new Scanner(System.in);
                        System.out.println("Masukkan tinggi limas");
                        double t_limas = tg_limas.nextDouble();
                        
                    double volume_limas = volume.limas_segitiga(a_segitiga, t_segitiga, t_limas);
                    System.out.println("Volume = " + volume_limas);
                    break;
        }
    }
   
}
