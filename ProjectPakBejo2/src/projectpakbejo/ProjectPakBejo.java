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
        
        Keramik2 k1 = new Keramik2(0.3, 0.3, 10, 100, 54000);
        System.out.println("Total harga keramik A : Rp " + k1.totalHarga());
        
        Keramik2 k2 = new Keramik2(0.4, 0.4, 5, 100, 65000);
        System.out.println("Total harga keramik B : Rp " + k2.totalHarga());
        
        Keramik2 k3 = new Keramik2(0.3, 0.4, 8, 100, 60000);
        System.out.println("Total harga keramik C : Rp " + k3.totalHarga());
    }
    
}
