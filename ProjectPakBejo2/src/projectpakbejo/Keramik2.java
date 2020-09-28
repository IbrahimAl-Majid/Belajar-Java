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
public class Keramik2 {
    
    double panjang;
    double lebar;
    int jmlKeramik;
    int luasLahan;
    int harga;
    
    Keramik2(double p, double l, int jml, int luas, int h){
        this.panjang = p;
        this.lebar = l;
        this.jmlKeramik = jml;
        this.luasLahan = luas;
        this.harga = h;
        }
    
    double totalHarga(){
       
        double luas;
        luas = this.panjang * this.lebar * this.jmlKeramik;
               
        double box;
        box = this.luasLahan / luas;
               
        double total;
        total = Math.ceil(box) * this.harga;
        return total;
        }
}
