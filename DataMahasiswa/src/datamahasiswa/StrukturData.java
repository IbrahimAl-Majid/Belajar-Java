/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datamahasiswa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SUPARDI
 */
public class StrukturData {
    String nim;
    String nama;
    String tglLahir;
    String gender;
    int cariGen;
    int pilihanCari;
    int menu;
    
    ArrayList<ArrayList<String>> mhs = new ArrayList<>();
    Scanner input=new Scanner(System.in);
    
    void menu(){
        System.out.println("-------------------------");
        System.out.println("Pengolahan Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampil Data");
        System.out.println("5. Keluar");
        System.out.println("Pilih No Menu : ");
        menu=input.nextInt();
        
        if(menu == 1){            
            tambahData();
        }
        if(menu == 2){            
            hapusData();
        }
        if(menu == 3){
            cariData();
        }
        if(menu == 4){
            tampilData();
        }
        if(menu == 5){
            System.exit(0);
        }
        else{
            menu();   
        }
    }
    
    void tambahData(){
        System.out.println("-------------------------");
        System.out.println("Tambah Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.print("Masukkan NIM: ");
        nim=input.next();
        
        System.out.print("Masukkan Nama: ");
        nama=input.next();
            
        System.out.print("Masukkan Tanggal Lahir (dd-mm-yyyy): ");
        this.tglLahir=input.next();
        
        System.out.print("Masukkan Gender (0: Laki-laki, 1: Perempuan): ");
        this.cariGen=input.nextInt();
        if(cariGen==0){
            gender="Laki-laki";
        }
        else if(cariGen==1){
            gender="Perempuan";
        }
        
        mhs.add(new ArrayList<String>(Arrays.asList(nim, nama, tglLahir, gender)));
        System.out.println(mhs); 
    }
    
    void hapusData(){
        System.out.println("-------------------------");
        System.out.println("Hapus Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.println("Masukkan NIM : ");
        nim=input.next();
        this.mhs.removeIf(data -> data.contains(nim));
        System.out.println("Data Mahasiswa Dengan NIM " + nim + " Telah Dihapus...!!!");
        System.out.println(mhs);
    }
    
    void cariData(){
        System.out.println("-------------------------");
        System.out.println("Cari Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.println("Cari berdasarkan :");
        System.out.println("1. Gender");
        System.out.println("2. NIM");
        System.out.println("Pilih No :");
        pilihanCari=input.nextInt();
          
        if(pilihanCari == 1){
            System.out.println("Masukkan Gendernya (0: Laki-laki, 1: Perempuan) : ");
            this.cariGen=input.nextInt();
            int x = gender.indexOf(input.nextInt());
            System.out.println(this.mhs.get(x));
            //cariGender();
        }
        if(pilihanCari == 2){
            System.out.println("Masukkan NIM :");
            this.nim=input.next();
            cariNim();
        }
    }
    
    void cariGender(){
        if(cariGen==0){
            System.out.println(this.mhs.get(cariGen));
        }
        if(cariGen==1){
            System.out.println(this.mhs.get(cariGen));
        }
        else{
            System.out.println("Data Tidak Ditemukan...!!!");
        }
    }
    
    void cariNim(){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.mhs.size(); i++){
            if(this.mhs.get(i).contains(nim)){
                index = i;
                ditemukan = true;
            }
        }
        if(ditemukan == true){
            System.out.println(this.mhs.get(index));
        }
        else{
            System.out.println("Data Tidak Ditemukan...!!!");
        }
    }
    void tampilData(){
        System.out.println("-------------------------");
        System.out.println("Data Mahasiswa");
        System.out.println("-------------------------");
        System.out.println(mhs);
    }
}