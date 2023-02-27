/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgWarung2;
import java.util.Scanner;
/**
 *
 * @author user
 */

    class pembeli{
        //data
        private String nama;
        private String alamat;
        
       //method
        pembeli(String n,String a){
            nama=n;
            alamat=a;
            System.out.println("Pembeli "+nama+" dibuat...");
        }
        public void setNama(String n){
            nama=n;
        }
        public void setAlamat(String a){
            alamat=a;
        }
        public String getNama(){
            return nama;
        }
        public String getAlamat(){
            return alamat;
        }
        public String ToString(){
            return nama+" ["+alamat+"]";
        }
    }
    
    class makanan{
        //data
        private String namaMakanan;
        private int hargaMakanan;
        
        //method
        makanan(String n,int h){
            namaMakanan=n;
            hargaMakanan=h;
            System.out.println("Menu "+namaMakanan+" dibuat...");
        }
        public void setNamaMakanan(String n){
            namaMakanan = n;
        }
        public void setHargaMakanan(int h){
            hargaMakanan = h;
        }
        public String getNamaMakanan(){
            return namaMakanan;
        }
        public int getHargaMakanan(){
            return hargaMakanan;
        }
        public String ToString(){
            return namaMakanan+" ["+hargaMakanan+"]";
        }
    }

public class appWarung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
    }
    
}
