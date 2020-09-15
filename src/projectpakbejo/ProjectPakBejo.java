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
public class ProjectPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik();
        k1.panjang = 30;
        k1.lebar = 30;
        k1.jmlKeramik = 10;
        /*luas lahan adalah 100 m2 = 1000000 cm2*/
        k1.luasLahan = 1000000;
        k1.harga = 54000;
        k1.totalHarga();
        
        Keramik k2 = new Keramik();
        k2.panjang = 40;
        k2.lebar = 40;
        k2.jmlKeramik = 5;
        /*luas lahan adalah 100 m2 = 1000000 cm2*/ 
        k2.luasLahan = 1000000;
        k2.harga = 65000;
        k2.totalHarga();
        
        Keramik k3 = new Keramik();
        k3.panjang = 40;
        k3.lebar = 30;
        k3.jmlKeramik = 8;
        /*luas lahan adalah 100 m2 = 1000000 cm2*/ 
        k3.luasLahan = 1000000;
        k3.harga = 60000;
        k3.totalHarga();
    }
    
}
