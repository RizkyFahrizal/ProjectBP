/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress3;


public class cMinuman {
    private String nama;
    private int harga;

    cMinuman(){
        System.out.println("    Objek minuman dibuat...");  
    }
    
    cMinuman(String namaMinuman, int hargaMinuman){
        nama = namaMinuman;
        harga = hargaMinuman;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setHargaMinuman(int hargaMinuman){
        harga = hargaMinuman;
    }

    public void setNamaMinuman(String namaMinuman){
        nama = namaMinuman;
    }    
    
    //getter
    public String ToString(){
        return nama+" ["+harga+"] ";
    }    
}
