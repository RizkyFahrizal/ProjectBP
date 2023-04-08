/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress6_fpUTS;

/**
 *
 * @author asus
 */
public class FrmMenu extends javax.swing.JFrame {
    
    int id_user = session.get_id_user();
    String nama_user = session.get_nama_user();
    String username = session.get_username();
    String password = session.get_password();
    String level = session.get_level();
    
    public FrmMenu(){
//        initComponents();
//        txtUID.setText(String.valueOf(id_user));
//        txtUsername.setText(nama_user);
//        txtPassword.setText(username);
//        txtNama.setText(password);
//        txtAlamat.setText(level);        
    }
    
}
