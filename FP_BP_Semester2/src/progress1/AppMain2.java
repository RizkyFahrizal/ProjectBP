/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress1;

import java.util.Scanner;

public class AppMain2 {
    public static void main(String[] args) {
        cMakanan makanan = null;
        cMinuman minuman = null;
        cPembeli pembeli = null;
        
        int pilih=0, pilih2=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n---------- RNR FOOD & BEVERAGE----------");
        System.out.println("Program Made By : ");
        System.out.println("1. Nanda Kharisma Safiri    22082010036");
        System.out.println("2. Risda Rahmawati Harsono  22082010040");        
        System.out.println("3. M. Rizky Fahrizal        22082010041");

        do{
            System.out.println("\nMenu Program");
            System.out.println("1. Makanan\n2. Minuman\n3. Pembeli");
            System.out.println("4. Keluar");
            System.out.print("  Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    do{
                    //sub menu makanan
                    System.out.println("  ===SUB MENU MAKANAN===  ");
                    System.out.println("  1. Tambah Menu Makanan");
                    System.out.println("  2. Lihat Menu Makanan");
                    System.out.println("  3. Ubah Menu Makanan");
                    System.out.println("  4. Hapus Menu Makanan");
                    System.out.println("  5. Kembali Ke Menu Program");
                    System.out.print("  Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            //input nama dan harga
                            System.out.print("  Nama Makanan    : ");
                            sc.nextLine();
                            String namaMakanan = sc.nextLine();
                            System.out.print("  Harga Makanan   : ");
                            int hargaMakanan = sc.nextInt();
                            makanan = new cMakanan(namaMakanan, hargaMakanan);
                            break;
                        case 2:
                            if(makanan == null){
                                System.out.println("  Makanan Kosong...");
                            }else{
                            System.out.println("  Data Makanan");
                            System.out.println("  "+makanan.ToString());
                            }
                            break;
                        case 3:
                            System.out.println("  Ubah Menu Makanan");
//                            System.out.print("  Nama Baru Makanan    : ");
//                            sc.nextLine();
//                            String namaMakananBaru = sc.nextLine();
                            System.out.print("  Harga Makanan   : ");
                            int hargaMakananBaru = sc.nextInt();
                            System.out.println("  Yakin Mengubah Harga Menu Makanan?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab = sc.nextInt();
                            if(jawab == 1){
                                //makanan.setNamaMakanan(namaMakananBaru);
                                makanan.setHargaMakanan(hargaMakananBaru);
                                System.out.println("  Data Harga Menu Makanan Telah Berubah...");                                
                            }else{
                                System.out.println("  Data Harga Menu Makanan Batal Diubah..");
                            }//tutup if else konfirmasi ubah harga makanan
                            break;
                        case 4:
                            System.out.println("  Hapus Menu Makanan");
                            System.out.println("  Yakin Menghapus Menu Makanan?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab1 = sc.nextInt();
                                if(jawab1 == 1){
                                makanan= null;
                                System.out.println("  Data Menu Makanan Telah Dihapus...");                              
                            }else{
                                System.out.println("  Data Menu Makanan Batal Dihapus..");
                            }//tutup if else konfirmasi ubah harga makanan                            
                            break;
                        case 5:
                            System.out.println("  Kembali Ke Menu Utama...");
                    }//tutup switch pilih sub menu makanan
                    }while(pilih2 != 5);
                    break; //pembatas sub menu makanan
                case 2:
                    do{
                    //sub menu makanan
                    System.out.println("  ===SUB MENU MINUMAN===  ");
                    System.out.println("  1. Tambah Menu Minuman");
                    System.out.println("  2. Lihat Menu Minuman");
                    System.out.println("  3. Ubah Menu Minuman");
                    System.out.println("  4. Hapus Menu Minuman");
                    System.out.println("  5. Kembali Ke Menu Program");
                    System.out.print("    Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            //input nama dan harga
                            System.out.print("  Nama Minuman    : ");
                            sc.nextLine();
                            String namaMinuman = sc.nextLine();
                            System.out.print("  Harga Minuman   : ");
                            int hargaMinuman = sc.nextInt();
                            minuman = new cMinuman(namaMinuman, hargaMinuman);                    
                            break;
                        case 2:
                            if(minuman == null){
                                System.out.println("  Minuman Kosong...");
                            }else{
                            System.out.println("  Data Minuman");
                            System.out.println("  "+minuman.ToString());
                            }                            
                            break;
                        case 3:
                            System.out.println("  Ubah Menu Minuman");
//                            System.out.print("  Nama Baru Minuman    : ");
//                            sc.nextLine();
//                            String namaMinumanBaru = sc.nextLine();
                            System.out.print("  Harga Minuman   : ");
                            int hargaMinumanBaru = sc.nextInt();
                            System.out.println("  Yakin Mengubah Harga Menu Minuman?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab = sc.nextInt();
                            if(jawab == 1){
                                //minuman.setNamaMinuman(namaMinumanBaru);
                                minuman.setHargaMinuman(hargaMinumanBaru);
                                System.out.println("  Data Harga Menu Minuman Telah Berubah...");                                
                            }else{
                                System.out.println("  Data Harga Menu Minuman Batal Diubah..");
                            }//tutup if else konfirmasi ubah harga minuman                           
                            break;
                        case 4:
                            System.out.println("  Hapus Menu Minuman");
                            System.out.println("  Yakin Menghapus Menu Minuman?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab1 = sc.nextInt();
                                if(jawab1 == 1){
                                minuman= null;
                                System.out.println("  Data Menu Minuman Telah Dihapus...");                              
                            }else{
                                System.out.println("  Data Menu Minuman Batal Dihapus..");
                            }//tutup if else konfirmasi ubah harga minuman                               
                            break;
                        case 5:
                            System.out.println("  Kembali Ke Menu Utama...");                            
                    }//tutup switch pilih sub menu minuman
                    }while(pilih2 != 5);                   
                    break; //pembatas sub menu minuman
                case 3:
                    do{
                    //sub menu makanan
                    System.out.println("  ===SUB MENU PEMBELI===  ");
                    System.out.println("  1. Tambah Data Pembeli");
                    System.out.println("  2. Lihat Data Pembeli");
                    System.out.println("  3. Ubah Data Pembeli");
                    System.out.println("  4. Hapus Data Pembeli");
                    System.out.println("  5. Kembali Ke Menu Program");
                    System.out.print("    Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            //input nama dan alamat
                            System.out.print("  Nama Pembeli    : ");
                            sc.nextLine();
                            String namaPembeli = sc.nextLine();
                            System.out.print("  Alamat Pembeli  : ");
                            sc.nextLine();                            
                            String alamatPembeli = sc.nextLine();
                            pembeli = new cPembeli(namaPembeli, alamatPembeli);                            
                            break;
                        case 2:
                            if(pembeli == null){
                                System.out.println("  Data Pembeli Kosong...");
                            }else{
                            System.out.println("  Data Pembeli");
                            System.out.println("  "+pembeli.ToString());
                            }                            
                            break;
                        case 3:
                            System.out.println("  Ubah Info Pembeli");
//                          System.out.print("  Nama Baru Pembeli   : ");
//                          sc.nextLine();
//                          String namaPembeliBaru = sc.nextLine();
                            System.out.print("  Alamat Baru Pembeli : ");
                            sc.nextLine();
                            String alamatPembeliBaru = sc.nextLine();
                            System.out.println("  Yakin Mengubah Alamat Pembeli?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab = sc.nextInt();
                            if(jawab == 1){
                                //pembeli.setNamaPembeli(namaPembeliBaru);
                                pembeli.setAlamatPembeli(alamatPembeliBaru);
                                System.out.println("  Data Harga Info Pembeli Telah Berubah...");                                
                            }else{
                                System.out.println("  Data Harga Info Pembeli Batal Diubah..");
                            }//tutup if else konfirmasi ubah nama pembeli                                
                            break;
                        case 4:
                            System.out.println("  Hapus Pembeli");
                            System.out.println("  Yakin Menghapus Pembeli?");
                            System.out.println("  1. Ya\n 2. Tidak");
                            System.out.print("    Jawab : ");
                            int jawab1 = sc.nextInt();
                                if(jawab1 == 1){
                                pembeli= null;
                                System.out.println("  Data Pembeli Telah Dihapus...");                              
                            }else{
                                System.out.println("  Data Pembeli Batal Dihapus..");
                            }//tutup if else menghapus pembeli                            
                            break;
                        case 5:
                            System.out.println("  Kembali Ke Menu Utama...");                            
                    }//tutup switch pilih sub menu pembeli
                    }while(pilih2 != 5);                    
                    break; //pembatas sub menu pembeli
            }//tutup switch pilih menu program
        }while(pilih != 4);
    }//tutup main

    
}//tutup class appmain2
