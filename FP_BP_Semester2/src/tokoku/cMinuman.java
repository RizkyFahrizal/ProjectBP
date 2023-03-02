/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoku;

/**
 *
 * @author asus
 */
class cMinuman{
    //data
    private String namaMinuman;
    private int hargaMinuman;
    
    //method
    cMinuman(String nmin, int hmin){
        namaMinuman = nmin;
        hargaMinuman = hmin;
        
        System.out.println("  Minuman "+namaMinuman+" dibuat..");        
    }
    
    public void setNamaMinuman(String nmin){
        namaMinuman = nmin;
    }
    
    public void setHargaMinuman(int hmin){
        hargaMinuman = hmin;
    }
    
    public String getNamaMinuman(){
        return namaMinuman;
    }
    
    public int getHargaMinuman(){
        return hargaMinuman;
    }
    
    public String ToString(){
        return namaMinuman+" ["+hargaMinuman+"] ";
    }
}
