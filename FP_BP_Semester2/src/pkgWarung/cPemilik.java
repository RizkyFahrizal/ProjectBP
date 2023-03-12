/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgWarung;

public class cPemilik {
    private String nama;
    private String alamat;
    private cRumahMakan rumahMakan; 
    
    //relasi asosiasi HAS A
    //implementasi relasi HAS A

    cPemilik(){
        System.out.println("Objek pemilik dibuat...");  
    }
    
    cPemilik(String namaPemilik, String alamatPemilik){
        nama = namaPemilik;
        alamat = alamatPemilik;
        System.out.println("    Objek "+nama+" dibuat...");
    }
    
    //setter
    public void setAlamatPemilik(String alamatPemilik){
        alamat = alamatPemilik;
    }

    public void setNamaPemilik(String namaPemilik){
        nama = namaPemilik;
    }    
    
    //getter
    public String ToString(){
        return nama+" ["+alamat+"] ";
    }
    
    public void buatRumahMakan(cRumahMakan rm){
        rumahMakan = rm; 
    }

    public void lihatRumahMakan(){
        if(rumahMakan != null){
            System.out.println("   "+nama+ " pemilik Rumah Makan "+rumahMakan.ToString());            
        }else{
            System.out.println("   Tidak punya warung...");
        }
    }
    
    public void hapusRumahMakan(){
        rumahMakan = null;
        System.out.println("   Rumah Makan dihapus...");
    }
    
    public void ubahRumahMakan(cRumahMakan rm){
        rumahMakan = rm;
    }
}
