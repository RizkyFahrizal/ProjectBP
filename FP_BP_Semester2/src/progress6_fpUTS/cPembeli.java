/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress6_fpUTS;

/**
 *
 * @author asus
 */
public class cPembeli extends cTransaksi{
    protected String nama_pelanggan, level_pembeli, kasir;  
    
    //setter
    public void setNamaPelanggan(String n){
       nama_pelanggan = n;
    }
    
    public void setLevel(String lvl){
        level_pembeli = lvl;
    }
    
    
    //getter
    public String getNamaPelanggan(String n){
        return nama_pelanggan;
    }
    
    public String getLevel(String lvl){
        return level_pembeli;
    }    
    
}
