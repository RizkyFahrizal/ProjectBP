/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress2;

public class cMakanan {
    private String nama;
    private int harga;

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
