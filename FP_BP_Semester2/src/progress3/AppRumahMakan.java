/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress3;

import java.util.Scanner;


public class AppRumahMakan {
    public static void main(String[] args) {
        
        cPembeli pembeli = new cPembeli();
        cMakanan makanan = new cMakanan();
        cMinuman minuman = new cMinuman();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n----- RUMAH MAKAN NUSANTARA -----");
        System.out.println("Program Made By : ");
        System.out.println("1. Nanda Kharisma Safiri    22082010036");
        System.out.println("2. Risda Rahmawati Harsono  22082010040");        
        System.out.println("3. M. Rizky Fahrizal        22082010041");
        System.out.println("");
        
        int pilih1=0, pilih2=0;
       
        do{
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Pembelian");
            System.out.println("4. Transaksi");
            System.out.println("5. Selesai");
            System.out.print("  Pilih = ");
            pilih1 = sc.nextInt();
            switch(pilih1){
                case 1: //sub menu makanan
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU MAKANAN ---");
                    System.out.println(" 1. Tambah Menu Makanan");
                    System.out.println(" 2. Ubah Menu Makanan");
                    System.out.println(" 3. Lihat Menu Makanan");
                    System.out.println(" 4. Hapus Menu Makanan");
                    System.out.println(" 5. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Makanan Baru +++");
                                System.out.print("    Nama Makanan          = ");
                                sc.nextLine();
                                String namaMakanan = sc.nextLine();
                                System.out.print("    Harga Makanan         = ");
                                int hargaMakanan = sc.nextInt();
                                makanan = new cMakanan(namaMakanan, hargaMakanan);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Makanan +++");
                                System.out.print("    Harga Makanan Baru   = ");                                
                                int hargaMakananBaru = sc.nextInt();
                                System.out.println("  Yakin Mengubah Harga Menu Makanan?");
                                System.out.println("  1. Ya\n  2. Tidak");
                                System.out.print("    Jawab : ");
                                int jawab = sc.nextInt();
                                if(jawab == 1){
                                    makanan.setHargaMakanan(hargaMakananBaru);
                                    System.out.println("  Data Harga Menu Makanan Telah Berubah...");                                
                                }else{
                                    System.out.println("  Data Harga Menu Makanan Batal Diubah..");
                                }//tutup if else konfirmasi ubah harga makanan
                                break;
                            case 3:
                                String t = makanan.ToString();
                                System.out.println("    Makanan : "+t);
                                break;
                            case 4:
                                System.out.println("    Hapus Menu Makanan");
                                System.out.println("    Yakin Menghapus Menu Makanan?");
                                System.out.println("    1. Ya\n  2. Tidak");
                                System.out.print("    Jawab : ");
                                int jawab1 = sc.nextInt();
                                    if(jawab1 == 1){
                                    makanan= null;
                                    System.out.println("    Data Menu Makanan Telah Dihapus...");                              
                                }else{
                                    System.out.println("    Data Menu Makanan Batal Dihapus..");
                                }//tutup if else konfirmasi ubah harga makanan                                 
                                break;
                            case 5:
                                System.out.println("    Kembali ke menu utama...\n");                                   
                                break;
                                }//tutup switch sub menu makanan                    
                    }while(pilih2 != 5);                                
                    break;
                case 2: //sub menu minuman
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU MINUMAN ---");
                    System.out.println(" 1. Tambah Menu Minuman");
                    System.out.println(" 2. Ubah Menu Minuman");
                    System.out.println(" 3. Lihat Menu Minuman");
                    System.out.println(" 4. Hapus Menu Minuman");
                    System.out.println(" 5. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Minuman Baru +++");
                                System.out.print("    Nama Minuman          = ");
                                sc.nextLine();
                                String namaMinuman = sc.nextLine();
                                System.out.print("    Harga Minuman         = ");
                                int hargaMinuman = sc.nextInt();
                                minuman = new cMinuman(namaMinuman, hargaMinuman);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Minuman +++");
                                System.out.print("    Harga Minuman Baru   = ");                                
                                int hargaMinumanBaru = sc.nextInt();
                                System.out.println("  Yakin Mengubah Harga Menu Minuman?");
                                System.out.println("  1. Ya\n  2. Tidak");
                                System.out.print("    Jawab : ");
                                int jawab = sc.nextInt();
                                if(jawab == 1){
                                    minuman.setHargaMinuman(hargaMinumanBaru);
                                    System.out.println("  Data Harga Menu Minuman Telah Berubah...");                                
                                }else{
                                    System.out.println("  Data Harga Menu Minuman Batal Diubah..");
                                }//tutup if else konfirmasi ubah harga makanan
                                break;
                            case 3:
                                String t = minuman.ToString();
                                System.out.println("    Minuman : "+t);
                                break;
                            case 4:
                                System.out.println("    Hapus Menu Minuman");
                                System.out.println("    Yakin Menghapus Menu Minuman?");
                                System.out.println("    1. Ya\n  2. Tidak");
                                System.out.print("    Jawab : ");
                                int jawab1 = sc.nextInt();
                                    if(jawab1 == 1){
                                    makanan= null;
                                    System.out.println("    Data Menu Minuman Telah Dihapus...");                              
                                }else{
                                    System.out.println("    Data Menu Minuman Batal Dihapus..");
                                }//tutup if else konfirmasi hapus menu minuman                                 
                                break;
                            case 5:
                                System.out.println("    Kembali ke menu utama...\n");                                   
                                break;
                                }//tutup switch sub menu minuman                    
                    }while(pilih2 != 5);                                
                    break;
                case 3: //sub menu pembeli
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU PEMBELI ---");
                    System.out.println(" 1. Tambah Data Pembeli");
                    System.out.println(" 2. Ubah Data Pembeli");
                    System.out.println(" 3. Lihat Data Pembeli");
                    System.out.println(" 4. Hapus Data Pembeli");
                    System.out.println(" 5. Keluar");
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
                                System.out.println("    Hapus Data Pembeli");
                                System.out.println("    Yakin Menghapus Data Pembeli?");
                                System.out.println("    1. Ya\n  2. Tidak");
                                System.out.print("    Jawab : ");
                                int jawab1 = sc.nextInt();
                                    if(jawab1 == 1){
                                    pembeli = null;
                                    System.out.println("    Data Pembeli Telah Dihapus...");                              
                                }else{
                                    System.out.println("    Data Pembeli Batal Dihapus..");
                                }//tutup if else konfirmasi hapus data pembeli 
                                break;
                            case 5:
                                System.out.println("    Kembali ke menu utama...\n");                                
                                break;
                                }//tutup switch sub menu pembeli                   
                    }while(pilih2 != 5);
                    break;
                case 4: //sub menu transaksi
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU TRANSAKSI ---");
                    System.out.println(" 1. Buat Transaksi");
                    System.out.println(" 2. Ubah Transaksi");
                    System.out.println(" 3. Lihat Transaksi");
                    System.out.println(" 4. Hapus Transaksi");
                    System.out.println(" 5. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                pembeli.tambahMakanan(makanan);       
                                break;
                            case 2:
                                cMakanan makanan2 = new cMakanan();
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
                case 5:
                    System.out.println("  Terimakasih Telah Datang...");
                    break;
            }//tutup switch pilih1
        }while(pilih1 != 5);//tutup do while menu utama

    }  
}
