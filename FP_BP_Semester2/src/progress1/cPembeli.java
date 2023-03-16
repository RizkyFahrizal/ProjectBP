/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress1;

class cPembeli{
    
    //data
    private String namaPembeli;
    private String alamatPembeli;
    
    //method
    cPembeli(String n, String a){
        namaPembeli = n;
        alamatPembeli = a;
        System.out.println("  Pembeli" +namaPembeli+ " dibuat..");
    }
    
    public void setNamaPembeli(String n){
        namaPembeli = n;
    }
    
    public void setAlamatPembeli(String a){
        alamatPembeli = a;
    }
    
    public String getNamaPembeli(){
        return namaPembeli;
    }
    
    public String getAlamatPembeli(){
        return alamatPembeli;
    }
    
    public String ToString(){
        return namaPembeli+" ["+alamatPembeli+"] ";
    }
    
}