/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress5;

//induk dari class makanan dan class minuman 

public class cMenu {
    protected String nama;
    protected int harga;
    
    cMenu(){
        nama = "";
        harga = 0;
        System.out.println("    Objek menu dibuat...");
    }    
    
    cMenu(String n, int h){
        nama = n;
        harga = h;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setNama(String n){
        nama = n;
    }

    public void setHarga(int h){
        harga = h;
    }

    //getter
    public String getNama(){
        return nama;
    }
    
    public int getHarga(){
        return harga; 
    }
    
    //toString
    public String ToString(){
        return " "+nama+" ["+harga+"]";
    }            
}
