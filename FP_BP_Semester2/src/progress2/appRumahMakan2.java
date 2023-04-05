/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress2;

import java.util.Scanner;
public class appRumahMakan2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    cPembeli pembeli = new cPembeli("Nisa", "Wonokromo");
    cMakanan makanan = new cMakanan("Nasi Goreng", 12000);
    
    int pilih1 = 0, pilih2 = 0;
    
    do{
            System.out.println("=== APP  WARUNG ===");
            System.out.println("1. Pembeli");
            System.out.println("2. Makanan");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print("  Pilih = ");
            pilih1 = sc.nextInt();
            switch(pilih1){
                case 1: //sub menu pembeli
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU PEMBELI ---");
                    System.out.println(" 1. Data Baru");
                    System.out.println(" 2. Ubah Data");
                    System.out.println(" 3. Lihat Data");
                    System.out.println(" 4. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Pembeli Baru +++");
                                System.out.print("    Nama Pembeli          = ");
                                sc.nextLine();
                                String namaPembeli = sc.nextLine();
                                System.out.print("    Alamat Pembeli        = ");
                                String alamatPembeli = sc.next();
                                pembeli = new cPembeli(namaPembeli, alamatPembeli);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Pembeli +++");
                                System.out.print("    Alamat Pembeli Baru   = ");                                
                                String alamatBaru = sc.next();
                                pembeli.setAlamatPembeli(alamatBaru);
                                break;
                            case 3:
                                String t = pembeli.ToString();
                                System.out.println("    Pembeli : "+t);
                                break;
                            case 4:
                                System.out.println("    Kembali ke menu utama...\n");
                                break;
                                }//tutup switch sub menu pemilik                    
                    }while(pilih2 != 4);
                    break;
                case 2: //sub menu rumah makan
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU MAKANAN ---");
                    System.out.println(" 1. Data Baru");
                    System.out.println(" 2. Ubah Data");
                    System.out.println(" 3. Lihat Data");
                    System.out.println(" 4. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Makanan Baru +++");
                                System.out.print("    Nama Makanan          = ");
                                sc.nextLine();
                                String namaMakanan = sc.nextLine();
                                System.out.print("    AHarga Makanan        = ");
                                int hargaMakanan = sc.nextInt();
                                makanan = new cMakanan(namaMakanan, hargaMakanan);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Makanan +++");
                                System.out.print("    Alamat Makanan Baru   = ");                                
                                int hargaMakananBaru = sc.nextInt();
                                makanan.setHargaMakanan(hargaMakananBaru);
                                break;
                            case 3:
                                String t = makanan.ToString();
                                System.out.println("    Makanan : "+t);
                                break;
                            case 4:
                                System.out.println("    Kembali ke menu utama...\n");                                
                                break;
                                }//tutup switch sub menu pemilik                    
                    }while(pilih2 != 4);                    
                    break;
                case 3:
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU TRANSAKSI ---");
                    System.out.println(" 1. Tambah Makanan");
                    System.out.println(" 2. Ubah Makanan");
                    System.out.println(" 3. Lihat Makanan");
                    System.out.println(" 4. Hapus Makanan");
                    System.out.println(" 5. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                pembeli.tambahMakanan(makanan);       
                                break;
                            case 2:
                                cMakanan makanan2 = new cMakanan("Bakso", 10000);
                                pembeli.ubahMakanan(makanan2);
                                break;
                            case 3:
                                pembeli.lihatMakanan();
                                break;
                            case 4:
                                pembeli.hapusMakanan();
                                break;
                            case 5:
                                System.out.println("   Kembali ke menu utama...");
                                break;
                                }//tutup switch case sub menu menu transaksi 
                    
                    }while(pilih2 != 5);
                    break;
                case 4:
                    System.out.println("    Selesai...");                    
                    break;
            }//tutup switch menu utama   
    }while(pilih1 != 4); //end menu utama        
        
    }    
    }
