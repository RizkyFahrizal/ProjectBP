/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress6_fpUTS;

/**
 *
 * @author asus
 */
public class cBarang {
    protected String nama_barang;
    protected int harga_barang;
    
    cBarang(){
        nama_barang = " ";
        harga_barang = 0;
        System.out.println("    Objek barang dibuat...");
    }
    
    //setter
    public void setNama_Barang(String nb){
        nama_barang = nb;
    }
    
    public void setHarga_Barang(int hb){
        harga_barang = hb;
    }
    
    //getter
    public String getNama_Barang(){
        return nama_barang;
    }  
    
    public int getHarga_Barang(){
        return harga_barang;
    }    
}
