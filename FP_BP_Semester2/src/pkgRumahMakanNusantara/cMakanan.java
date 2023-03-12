/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgRumahMakanNusantara;


public class cMakanan {
    private String nama;
    private int harga;
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

    cMakanan(){
        System.out.println("    Objek makanan dibuat...");  
    }
    
    cMakanan(String namaMakanan, int hargaMakanan){
        nama = namaMakanan;
        harga = hargaMakanan;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setHargaMakanan(int hargaMakanan){
        harga = hargaMakanan;
    }

    public void setNamaMakanan(String namaMakanan){
        nama = namaMakanan;
    }    
    
    //getter
    public String ToString(){
        return nama+" ["+harga+"] ";
    }         
}
