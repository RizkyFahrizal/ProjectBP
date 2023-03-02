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


public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cMakanan mkn = new cMakanan("Kentang Goreng", 10000);
        cPembeli pbl = new cPembeli("Alan", "Waru");
        cMinuman min = new cMinuman("Milkshake Vanilla", 8000);
        
        int pilih = 0;
        
        System.out.println("\n---------- RNR FOOD & BEVERAGE----------");
        System.out.println("Program Made By : ");
        System.out.println("1. M. Rizky Fahrizal        22082010041");
        System.out.println("2. Risda Rahmawati Harsono  22082010040");
        System.out.println("3. Nanda Kharisma Safiri    22082010036");
        do{
            System.out.println("****** MENU PROGRAM ******");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Pembeli");
            System.out.println("4. Selesai");
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
                    //sub menu minuman
                    pilih1 = 0;
                    do{
                        System.out.println("==== M I N U M A N ====");
                        System.out.println(" 1. Buat Data");
                        System.out.println(" 2. Lihat Data");
                        System.out.println(" 3. Ubah Data");
                        System.out.println(" 4. Kembali");
                        System.out.print("   Pilih = ");
                        pilih1 = sc.nextInt();
                        switch(pilih1){
                            case 1:
                                  System.out.print("Nama Minuman    = ");
                                  sc.nextLine();
                                  String nminuman = sc.nextLine();                               
                                  System.out.print("Harga Minuman  = ");                                 
                                  int hminuman = sc.nextInt();
                                  min = new cMinuman(nminuman, hminuman);                                
                                break;
                            case 2:
                                  String t = min.ToString();
                                  System.out.println("Minuman : "+t);                                
                                break;
                            case 3:
                                  System.out.print("Minuman Baru = ");
                                  sc.nextLine();                                    
                                  String nmin = sc.nextLine();
                                  min.setNamaMinuman(nmin);
                                  System.out.print("Harga Baru = ");                                  
                                  int hmin = sc.nextInt();
                                  min.setHargaMinuman(hmin);                                   
                                break;
                            case 4:
                                  System.out.println("Ke Menu Utama..");
                                break;
                        }
                    }while(pilih1 != 4);
                    break;
                case 3:
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
                case 4:
                    System.out.println("Terimakasih...");                    
                    break;
            }
        }while(pilih != 4);
    }    
}
