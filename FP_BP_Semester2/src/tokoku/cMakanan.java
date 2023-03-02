/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoku;

/**
 *
 * @author asus
 */
class cMakanan{
    
    //data
    private String namaMakanan;
    private int hargaMakanan;
    
    //method
    cMakanan(String nm, int hm){
        namaMakanan = nm;
        hargaMakanan = hm;
        
        System.out.println("  Menu "+namaMakanan+" dibuat..");
    }
    
    public void setNamaMakanan(String nm){
        namaMakanan = nm;
    }
    
    public void setHargaMakanan(int hm){
        hargaMakanan = hm;
    }
    
    public String getNamaMakanan(){
        return namaMakanan;
    }
    
    public int getHargaMakanan(){
        return hargaMakanan;
    }
    
    public String ToString(){
        return namaMakanan+" ["+hargaMakanan+"] ";
    }
}
