/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgWarung;

public class cPembeli {
    private String nama;
    private String alamat;
    private cMakanan makanan; //implementasi dari relasi HAS A
    
    public void beliMakanan(cMakanan m){
        makanan = m;
        System.out.println("    Pembelian suskes...");
    }
    
    public void tambahMakanan(cMakanan m){
        makanan = m;
        System.out.println("    Penambahan Makanan Sukses...");
    }
    
    public void lihatMakanan(){
        if(makanan != null){
            System.out.println("    "+nama+" membeli "+makanan.ToString());
        }else{
            System.out.println("    Makanan kosong!");
        }
    }
    
    public void ubahMakanan(cMakanan m){
        makanan = m;
        System.out.println("    Pengubahan sukses...");
    }
    
    public void hapusMakanan(){
        makanan = null;
        System.out.println("    Makanan dihapus...");
    }

    cPembeli(){
        System.out.println("    Objek pembeli dibuat...");  
    }
    
    cPembeli(String namaPembeli, String alamatPembeli){
        nama = namaPembeli;
        alamat = alamatPembeli;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setAlamatPembeli(String alamatPembeli){
        alamat = alamatPembeli;
    }

    public void setNamaPembeli(String namaPembeli){
        nama = namaPembeli;
    }    
    
    //getter
    
    //toString
    public String ToString(){
        return nama+" ["+alamat+"] ";
    }    
}
