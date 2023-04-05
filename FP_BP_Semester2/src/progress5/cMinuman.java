/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress5;

//class anak minuman dari induk class menu
public class cMinuman extends cMenu{
    
    String topping;
    
    cMinuman(String n, int h){
        super(n, h);
        System.out.println("    Ini constructor anak....");
    }
    
    public void setTopping(String t){
        topping = t;
    }

    public String ToString(){
        return super.ToString()+"+"+topping;
    }
}
