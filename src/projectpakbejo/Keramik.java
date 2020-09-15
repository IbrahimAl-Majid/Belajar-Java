/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo;

/**
 *
 * @author SANGIRAN
 */
public class Keramik {
    
    /*membuat atribut*/
    int panjang;
    int lebar;
    int jmlKeramik;
    int luasLahan;
    int harga;
    
    /*membuat methods*/
    void totalHarga(){
        float luas;
        luas = this.panjang * this.lebar * this.jmlKeramik;
        System.out.println("Luas satu box keramik: " + luas + " satuan luas");
        
        float box;
        box = this.luasLahan / luas;
        System.out.println("Keramik yang dibutuhkan: " + Math.ceil(box) + " box");
        
        double total;
        total = Math.ceil(box) * this.harga;
        System.out.println("Total harga keramik: " + total);
    }
}
