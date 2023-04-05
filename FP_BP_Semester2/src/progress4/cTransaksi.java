/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress4;

import java.util.Scanner;

public class cTransaksi {
    
    private cPembeli pembeli;
    private cMakanan makanan[];
    private int jumlahMakanan, maxMakanan, total;
    
    Scanner sc = new Scanner(System.in);
    
    cTransaksi(){
        maxMakanan = 3;
        makanan = new cMakanan[maxMakanan];
        jumlahMakanan = 0;
        total = 0;
        System.out.println("    Transaksi dibuat...");
    }
    
    public void isiPembeli(cPembeli p){
        pembeli = p;
        System.out.println("\n    Isi pembeli sukses...");
    }
    
    public void tambahMakanan(cMakanan m){
        if(jumlahMakanan >= maxMakanan){
            System.out.println("    Kapasitas pesanan penuh!"); 
        }else{
            makanan[jumlahMakanan] = m;
            System.out.println("    Penambahan sukses..");
            jumlahMakanan++;
        }
    }    
    
    public void lihatMakanan(){
        System.out.println("\n    Daftar Makanan");
        if(pembeli != null){
        System.out.println("    "+pembeli.ToString());           
        }else{
            System.out.println("    Pembeli belum ada!");
        }
        
        for(int i=0; i<jumlahMakanan; i++){
            System.out.println("    "+(i+1)+"."+makanan[i].ToString());
        }
        System.out.println("");         

    }
    
    public void hapusMakanan(String m){
        if(jumlahMakanan<0){
            System.out.println("    Makanan kosong!");
        }else{
            boolean ada = false;
            for(int i=0; i<jumlahMakanan; i++){
                if(m.equalsIgnoreCase(makanan[i].getNamaMakanan())){
                    ada = true;
                    makanan[i] = null;
                    //geser maju elemen array
                    int p = i;
                    for(int j=p; j<jumlahMakanan; j++){
                        if(j == jumlahMakanan-1){
                            makanan[j] = null;
                        }else{
                            makanan[j] = makanan[j+1];
                        }
                    }
                    jumlahMakanan--;
                    System.out.println("    Penghapusan sukses...");
                    break; 
                }
            }
            if(ada == false){
                System.out.println("    Makanan tidak ada!");
            }
        }        
    }
    
}
