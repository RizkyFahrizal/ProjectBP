/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgWarung;

/*

    kalimat/narasi proses bisnis:
    Rumah Makan Nusantara adalah milik Pak Teguh
    class: rumahMakan, pak teguh (pemilik). 

*/



import java.util.Scanner;

public class appRumahMakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cPemilik owner = new cPemilik("Pak Teguh", "Bandung");
        cRumahMakan rumahMakan = new cRumahMakan("Nusantara", "Jatinagor");
        
        int pilih1 = 0, pilih2 = 0;
        do{
            System.out.println("=== M E N U   U T A M A ===");
            System.out.println("1. Pemilik");
            System.out.println("2. Rumah Makan");
            System.out.println("3. Buat Warung");            
            System.out.println("4. Selesai");
            System.out.print("  Pilih = ");
            pilih1 = sc.nextInt();
            switch(pilih1){
                case 1: //sub menu pemilik
                    do{
                    System.out.println("");
                    System.out.println(" --- MENU PEMILIK ---");
                    System.out.println(" 1. Data Baru");
                    System.out.println(" 2. Ubah Data");
                    System.out.println(" 3. Lihat Data");
                    System.out.println(" 4. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Pemilik Baru +++");
                                System.out.print("    Nama Pemilik          = ");
                                sc.nextLine();
                                String namaPemilik = sc.nextLine();
                                System.out.print("    Alamat Pemilik        = ");
                                String alamatPemilik = sc.next();
                                owner = new cPemilik(namaPemilik, alamatPemilik);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Pemilik +++");
                                System.out.print("    Alamat Pemilik Baru   = ");                                
                                String alamatBaru = sc.next();
                                owner.setAlamatPemilik(alamatBaru);
                                break;
                            case 3:
                                String t = owner.ToString();
                                System.out.println("    Pemilik : "+t);
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
                    System.out.println(" --- MENU RUMAH MAKAN ---");
                    System.out.println(" 1. Data Baru");
                    System.out.println(" 2. Ubah Data");
                    System.out.println(" 3. Lihat Data");
                    System.out.println(" 4. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("");
                                System.out.println("    +++ Tambahkan Data Rumah Makan Baru +++");
                                System.out.print("    Nama Rumah Makan          = ");
                                sc.nextLine();
                                String namaRumahMakan = sc.nextLine();
                                System.out.print("    Alamat Rumah Makan        = ");
                                String alamatRumahMakan = sc.next();
                                rumahMakan = new cRumahMakan(namaRumahMakan, alamatRumahMakan);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("    +++ Ubah Data Rumah Makan +++");
                                System.out.print("    Alamat Rumah Makan Baru   = ");                                
                                String alamaRMtBaru = sc.next();
                                rumahMakan.setAlamatRumahMakan(alamaRMtBaru);
                                break;
                            case 3:
                                String t = owner.ToString();
                                System.out.println("    Rumah Makan : "+t);
                                break;
                            case 4:
                                System.out.println("    Kembali ke menu utama...\n");                                
                                break;
                                }//tutup switch sub menu pemilik                    
                    }while(pilih2 != 4);                    
                    break;
                case 3: //pembuatan data rumah makan + pemiliknya
                    do{
                    System.out.println("");
                    System.out.println(" --- KELOLA RUMAH MAKAN ---");
                    System.out.println(" 1. Tambah Rumah Makan");
                    System.out.println(" 2. Lihat Rumah Makan");
                    System.out.println(" 3. Hapus Rumah Makan");
                    System.out.println(" 4. Ubah Rumah Makan");
                    System.out.println(" 5. Kembali");
                    System.out.print("   Pilih = ");
                    pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                owner.buatRumahMakan(rumahMakan);
                                System.out.println("   Pembuatan Sukses...");       
                                break;
                            case 2:
                                owner.lihatRumahMakan();
                                break;
                            case 3:
                                owner.hapusRumahMakan();
                                break;
                            case 4:
                                owner.ubahRumahMakan(rumahMakan);
                                break;
                            case 5:
                                System.out.println("   Kembali ke menu utama...");
                                break;
                                }//tutup switch case sub menu buat rumah makan 
                    }while(pilih2 != 5);
                    break;
                case 4:
                    break;
            }// tutup switch menu utama 
        }while(pilih1 != 4); //end do while menu utama
        
    }
}
