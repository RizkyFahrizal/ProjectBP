/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress6_fpUTS;

/**
 *
 * @author asus
 */
public class cKategori {

    protected String kategori;
    
    cKategori(){
        kategori = " ";
        System.out.println("    Objek kategori dibuat...");
    }
    
    //setter
    public void setKategori(String k){
        kategori = k;
    }
    
    //getter
    public String getKategori(){
        return kategori;
    }
}
