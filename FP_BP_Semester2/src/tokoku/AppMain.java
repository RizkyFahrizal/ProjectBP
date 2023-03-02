/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoku;

/*

OOP --> Class !!!
1. Kalimat proses : Pembeli memberi makanan.
2. Class : pembeli, makanan, minuman.
3. Lengkapi isi setiap class : data & method
4. Menu program di main

*/

import java.util.Scanner;

class cPembeli{
    
    //data
    private String namaPembeli;
    private String alamatPembeli;
    
    //method
    cPembeli(String n, String a){
        namaPembeli = n;
        alamatPembeli = a;
        System.out.println("Pembeli" +namaPembeli+ " dibuat..");
    }
    
    public void setNamaPembeli(String n){
        namaPembeli = n;
    }
    
    public void setAlamatPembeli(String a){
        alamatPembeli = a;
    }
    
    public String getNamaPembeli(){
        return namaPembeli;
    }
    
    public String getAlamatPembeli(){
        return alamatPembeli;
    }
    
    public String ToString(){
        return namaPembeli+" ["+alamatPembeli+"] ";
    }
    
}

class cMakanan{
    
    //data
    private String namaMakanan;
    private int hargaMakanan;
    
    //method
    cMakanan(String nm, int hm){
        namaMakanan = nm;
        hargaMakanan = hm;
        
        System.out.println("Menu "+namaMakanan+" dibuat..");
    }
    
    public void setNamaMakanan(String nm){
        namaMakanan = nm;
    }
    
    public void setHargaMakanan(int hm){
        hargaMakanan = hm;
    }
    
    public String getNamaMakanan(){
        return namaMakanan;
    }
    
    public int getHargaMakanan(){
        return hargaMakanan;
    }
    
    public String ToString(){
        return namaMakanan+" ["+hargaMakanan+"] ";
    }
}

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cMakanan mkn = new cMakanan("Kentang Goreng", 10000); //membuat objek
        cPembeli pbl = new cPembeli("Alan", "Waru");
        
        int pilih = 0;
        
        do{
            System.out.println("\nWARUNG KITA");
            System.out.println("1. Makanan");
            System.out.println("2. Pembeli");
            System.out.println("3. Selesai");
            System.out.print("   Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //sub menu makanan
                    int pilih1 = 0;
                    do{
                        System.out.println("==== M A K A N A N ====");
                        System.out.println(" 1. Buat Data");
                        System.out.println(" 2. Lihat Data");
                        System.out.println(" 3. Ubah Data");
                        System.out.println(" 4. Kembali");
                        System.out.print("   Pilih = ");
                        pilih1 = sc.nextInt();
                        switch(pilih1){
                              case 1:
                                  System.out.print("Nama Makanan = ");
                                  sc.nextLine();
                                  String n = sc.nextLine();
                                  System.out.print("Harga = ");
                                  int h = sc.nextInt();
                                  mkn = new cMakanan(n, h);
                                break;
                              case 2:
                                  String t = mkn.ToString();
                                  System.out.println("Menu : "+t);
                                break;
                              case 3:
                                  System.out.print("Nama Makanan Baru   = ");
                                  sc.nextLine();
                                  String nb = sc.nextLine();
                                  mkn.setNamaMakanan(nb);
                                  System.out.print("Harga Makanan Baru  = ");
                                  int hb = sc.nextInt();
                                  mkn.setHargaMakanan(hb);                                  
                                break;
                              case 4:
                                  System.out.println("Ke Menu Utama..");
                                break;
                        }
                    }while(pilih1 != 4);
                    break;
                case 2:
                    //sub menu pembeli
                    pilih1 = 0;
                    do{
                        System.out.println("==== P E M B E L I ====");
                        System.out.println(" 1. Buat Data");
                        System.out.println(" 2. Lihat Data");
                        System.out.println(" 3. Ubah Data");
                        System.out.println(" 4. Kembali");
                        System.out.print("   Pilih = ");
                        pilih1 = sc.nextInt();
                        switch(pilih1){
                            case 1:
                                  System.out.print("Nama Pembeli    = ");
                                  sc.nextLine();
                                  String n = sc.nextLine();                               
                                  System.out.print("Alamat Pembeli  = ");
                                  sc.nextLine();                                  
                                  String a = sc.nextLine();
                                  pbl = new cPembeli(n, a);                                
                                break;
                            case 2:
                                  String t = pbl.ToString();
                                  System.out.println("Pembeli : "+t);                                
                                break;
                            case 3:
                                  System.out.print("Nama Baru = ");
                                  sc.nextLine();                                    
                                  String nb = sc.nextLine();
                                  pbl.setNamaPembeli(nb);
                                  System.out.print("Alamat Baru = ");
                                  sc.nextLine();                                    
                                  String ab = sc.nextLine();
                                  pbl.setAlamatPembeli(ab);                                   
                                break;
                            case 4:
                                  System.out.println("Ke Menu Utama..");
                                break;
                        }
                    }while(pilih1 != 4);
                    break;
                case 3:
                    System.out.println("Terimakasih...");
                    break;
            }
        }while(pilih != 3);
    }    
}
