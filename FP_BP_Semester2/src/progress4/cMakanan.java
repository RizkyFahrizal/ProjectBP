 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress4;


public class cMakanan {
    private String nama;
    private int harga;
    
    cMakanan(){
        nama = "";
        harga = 0;
        System.out.println("    Objek makanan dibuat...");
    }    
    
    cMakanan(String namaMakanan, int hargaMakanan){
        nama = namaMakanan;
        harga = hargaMakanan;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setNamaMakanan(String namaMakanan){
        nama = namaMakanan;
    }

    public void setHargaMakanan(int hargaMakanan){
        harga = hargaMakanan;
    }

    //getter
    public String getNamaMakanan(){
        return nama;
    }
    
    public int getHargaMakanan(){
        return harga; 
    }
    
    //toString
    public String ToString(){
        return "  Menu : "+nama+" ["+harga+"]";
    }    
}
