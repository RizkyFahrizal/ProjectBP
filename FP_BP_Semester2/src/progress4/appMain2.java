/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class appMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih1 = 0;
        
        cPembeli pembeli = new cPembeli();
        cMakanan menu[] = new cMakanan[7];
        
        //data menu makanan
        menu[0] = new cMakanan("nugget",48500);
        menu[1] = new cMakanan("beef",53000);
        menu[2] = new cMakanan("sosis",59000);
        menu[3] = new cMakanan("pangsit",20000);
        menu[4] = new cMakanan("dimsum",23000);
        menu[5] = new cMakanan("kentang",29000);
        menu[6] = new cMakanan("dumpling",18000);
       
        
        System.out.println("");
        System.out.println("|------------- ANGGOTA KELOMP0K 13 ------------|");
        System.out.println("| 1. Nanda Kharisma Safiri    22082010036      |");
        System.out.println("| 2. Risda Rahmawati Harsono  22082010040      |");        
        System.out.println("| 3. M. Rizky Fahrizal        22082010041      |");
        System.out.println("|----------------------------------------------|");
        
        System.out.println("");
        
        System.out.println("|----------------------------------------------|");
        System.out.println("| UMKM   : Fadillah Frozen Food                |");
        System.out.println("| Alamat : Gg. VI No.3, Rungkut Tengah         |");
        System.out.println("|          Kec. Gn. Anyar, Kota SBY, Jawa Timur|");
        System.out.println("|----------------------------------------------|");
        
        System.out.println("");
        
        do{
            System.out.println("\n----- MENU UTAMA -----");
            System.out.println("1. Pembeli");
            System.out.println("2. Makanan");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print("  Pilih = ");
            pilih1 = sc.nextInt();
            switch(pilih1){
                case 1: //sub menu pembeli
                    System.out.println("\n    ===== Tambahkan Data Pembeli =====");
                    System.out.print("    Nama Pembeli   : ");
                    sc.nextLine();
                    String namaPembeli = sc.nextLine();                    
                    System.out.print("    Alamat Pembeli : ");
                    String alamatPembeli = sc.next();
                    pembeli.setNamaPembeli(namaPembeli);
                    pembeli.setAlamatPembeli(alamatPembeli);
                    break;
                case 2: //sub menu makanan
                    System.out.println("\n      ===== Daftar Menu =====");
                    for(int i=0; i<menu.length; i++){
                        System.out.println("    "+menu[i].ToString());
                    }
                    System.out.println("");
                    break;
                case 3: //sub menu transaksi
                    System.out.println("\n    ===== Menu Transaksi =====");
                    cTransaksi beli = new cTransaksi();
                    beli.isiPembeli(pembeli);
                    int pilih2 = 0;
                    do{
                    System.out.println("    1. Isi Pembeli");
                    System.out.println("    2. Tambah Makanan");
                    System.out.println("    3. Lihat  Makanan");
                    System.out.println("    4. Hapus  Makanan");
                    System.out.println("    5. Selesai");
                    System.out.print("      Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            beli.isiPembeli(pembeli);
                            System.out.println("");
                            break;
                        case 2:
                            System.out.print("      Menu = ");
                            //sc.nextLine();
                            String cariMenu = sc.next();
                            boolean ada = false;
                            for(int i=0; i<menu.length; i++){
                                if(cariMenu.equalsIgnoreCase(menu[i].getNamaMakanan())){
                                    ada = true;
                                    beli.tambahMakanan(menu[i]);
                                    break;
                                }
                            }
                            if(ada == false){
                                System.out.println("      Menu tidak ada!"); 
                            }
                            System.out.println("");
                            break;
                        case 3:
                            beli.lihatMakanan();
                            System.out.println("");
                            break;
                        case 4:
                            System.out.println("      Makanan dihapus = ");
                            String hapusMkn = sc.next();
                            beli.hapusMakanan(hapusMkn);
                            break;
                        case 5:
                            System.out.println("      Kembali...");                            
                            break;
                    }
                    }while(pilih2 != 5);
                    break;
                case 4:
                    System.out.println(" Selesai, terimakasih...");
                    break;
            }
        }while(pilih1 != 4);
       
    }    
}
