/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgWarung;

public class cRumahMakan {
    private String nama;
    private String alamat;
    
    cRumahMakan(){
        System.out.println("Objek rumah makan dibuat...");
    }
    
    cRumahMakan(String namaRumahMakan, String alamatRumahMakan){
        nama = namaRumahMakan;
        alamat = alamatRumahMakan;
        System.out.println("    Objek "+nama+" dibuat...");        
    }
    
    //setter
    public void setAlamatRumahMakan(String alamatRumahMakan){
        alamat = alamatRumahMakan;
    }

    public void setANamaRumahMakan(String namaRumahMakan){
        nama = namaRumahMakan ;
    }    
    
    //getter
    public String ToString(){
        return nama+" ["+alamat+"] ";
    }


}
