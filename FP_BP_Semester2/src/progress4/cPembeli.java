/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress4;

public class cPembeli {
    
    private String nama;
    private String alamat;
    
    cPembeli(){
        nama = "";
        System.out.println("    Objek pembeli dibuat...");
    }
    
    cPembeli(String namaPembeli, String alamatPembeli){
        nama = namaPembeli;
        alamat = alamatPembeli;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setNamaPembeli(String namaPembeli){
        nama = namaPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli){
        alamat = alamatPembeli;
    }    
    
    //getter
    public String getNamaPembeli(){
        return nama;
    }
    
    public String getAlamatPembeli(){
        return alamat;
    }
    
    //toString
    public String ToString(){
        return "    Pembeli : "+nama+" ["+alamat+"] ";
    }        
    
}
