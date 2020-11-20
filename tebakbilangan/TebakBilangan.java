/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakbilangan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SUPARDI
 */

/*Tebak Bilangan Tanpa Skor*/
public class TebakBilangan {
    int bilangan;
    int tebakan;
    
    void tebakBilangan(){
        Random bil=new Random();
        this.bilangan=bil.nextInt(100);
        
        do{
            Scanner n=new Scanner(System.in);
            System.out.println("Tebakan Anda: ");
            this.tebakan=n.nextInt();
            
            if(tebakan==bilangan){
                System.out.println("Yeeee... Bilangan tebakan anda Benar:-)");
            }
            else if(tebakan<bilangan){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
            }
            else if(tebakan>bilangan){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
            }
        }
        while(tebakan!=bilangan);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Tebak bilangan tanpa skor*/
    /*    TebakBilangan x=new TebakBilangan();
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
        
        x.tebakBilangan();    */
        
        /*Tebakan bilangan dengan skor*/
        TebakBilangan2 x=new TebakBilangan2();
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
        
        x.tebakBilangan2();
    }
}
