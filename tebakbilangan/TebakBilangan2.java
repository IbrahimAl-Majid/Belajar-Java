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
public class TebakBilangan2 {
    int bilangan;
    int tebakan;
    int skor=100;
    int jmlTebak=0;
    
    void tebakBilangan2(){
        Random bil=new Random();
        this.bilangan=bil.nextInt(100);
        
        do{
            Scanner n=new Scanner(System.in);
            System.out.println("Tebakan Anda: ");
            this.tebakan=n.nextInt();
            
            if(tebakan==bilangan && jmlTebak<=5){
                skor=skor +50;
                System.out.println("Yeeee... Bilangan tebakan anda Benar:-)");
                System.out.println("Bonus: 50");
                System.out.println("Score anda: "+skor);
            }
            else if(tebakan==bilangan){
                System.out.println("Yeeee... Bilangan tebakan anda Benar:-)");
                System.out.println("Score anda: "+skor);
            }
            
            else if(tebakan<bilangan){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
                skor=skor-2;
                jmlTebak=jmlTebak+1;
            }
            else if(tebakan>bilangan){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
                skor=skor-2;
                jmlTebak=jmlTebak+1;
            }
            else if(skor==0){
                System.out.println("Game Over");
                break;
            }            
        }
        while(tebakan!=bilangan);
    }
}