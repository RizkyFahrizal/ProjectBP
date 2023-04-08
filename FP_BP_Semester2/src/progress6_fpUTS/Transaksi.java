/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package progress6_fpUTS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Transaksi extends javax.swing.JFrame {


    public static ArrayList<cBarang>barang;
    
    public Transaksi() {
        initComponents();
        IDBarang.setVisible(false);        
        table();
    }

    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_barang");
        tbl.addColumn("nama_barang");
        tbl.addColumn("harga_barang");
        tbl.addColumn("kategori_barang");        
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getInt("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getDouble("harga_barang"),
                    rs.getString("kategori_barang")
                });
                TableMenuBarang.setModel(tbl);
            }
//            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }        
    }

    void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_barang");
        tbl.addColumn("nama_barang");
        tbl.addColumn("harga_barang");
        tbl.addColumn("kategori_barang");
        
        
        
        try {
            String sql = "SELECT * FROM barang WHERE nama_barang like '%" + tCari.getText() + "%'";
            String sql2 = "SELECT * FROM barang WHERE harga_barang like '%" + tCari.getText() + "%'";
            String sql3 = "SELECT * FROM barang WHERE kategori_barang like '%" + tCari.getText() + "%'";            
            
            if(!sql.isEmpty()){    
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
                }
            }
            if(!sql2.isEmpty()){
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql2);
            
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
                }
            }
            if(!sql3.isEmpty()){
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql3);
            
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada" + e.getMessage());
        }
        
    }
    
        void refresh(){
            try{
            String refresh = "SELECT*FROM barang WHERE nama_barang='" +BarangTransaksi.getText()+ "'";
            Connection con1 = (Connection) Koneksi.getConnection();
            PreparedStatement pst2 = con1.prepareStatement(refresh);
            pst2.execute();
            tCari.setText("");
            table();
            hapusForm();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());                
            }
        }  
        
        void hapusForm(){
        BarangTransaksi.setText("");
        HargaTransaksi.setText("");
        IDBarang.setText("");
        JumlahBarangTransaksi.setText("");
        //PembeliTransaksi.setText("");
        TotalHargaBarangTransaksi.setText("");
        }        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PembeliTransaksi = new javax.swing.JTextField();
        BarangTransaksi = new javax.swing.JTextField();
        HargaTransaksi = new javax.swing.JTextField();
        TotalHargaBarangTransaksi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMenuBarang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TambahJumlahBarang = new javax.swing.JButton();
        KurangiJumlahBarang = new javax.swing.JButton();
        JumlahBarangTransaksi = new javax.swing.JTextField();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        MasukkanKeranjangTransaksi = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        IDBarang = new javax.swing.JTextField();
        HapusBarangKeranjang = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 245, 235));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Pembeli");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Jumlah");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Harga");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        HargaTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTransaksiActionPerformed(evt);
            }
        });

        TotalHargaBarangTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaBarangTransaksiActionPerformed(evt);
            }
        });

        TableMenuBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableMenuBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMenuBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMenuBarang);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("KERANJANG");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barang", "Harga", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        TambahJumlahBarang.setBackground(new java.awt.Color(24, 58, 29));
        TambahJumlahBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TambahJumlahBarang.setForeground(new java.awt.Color(255, 255, 255));
        TambahJumlahBarang.setText("+");
        TambahJumlahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahJumlahBarangMouseClicked(evt);
            }
        });
        TambahJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahJumlahBarangActionPerformed(evt);
            }
        });

        KurangiJumlahBarang.setBackground(new java.awt.Color(228, 128, 102));
        KurangiJumlahBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KurangiJumlahBarang.setForeground(new java.awt.Color(255, 255, 255));
        KurangiJumlahBarang.setText("-");
        KurangiJumlahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KurangiJumlahBarangMouseClicked(evt);
            }
        });

        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCariMouseClicked(evt);
            }
        });
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        MasukkanKeranjangTransaksi.setBackground(new java.awt.Color(240, 160, 75));
        MasukkanKeranjangTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MasukkanKeranjangTransaksi.setText("MASUKKAN KERANJANG");
        MasukkanKeranjangTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukkanKeranjangTransaksiActionPerformed(evt);
            }
        });

        btnTampil.setBackground(new java.awt.Color(24, 58, 29));
        btnTampil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTampil.setForeground(new java.awt.Color(255, 255, 255));
        btnTampil.setText("REFRESH");
        btnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTampilMouseClicked(evt);
            }
        });

        IDBarang.setBackground(new java.awt.Color(249, 245, 235));

        HapusBarangKeranjang.setBackground(new java.awt.Color(240, 160, 75));
        HapusBarangKeranjang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HapusBarangKeranjang.setText("HAPUS BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TambahJumlahBarang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JumlahBarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(KurangiJumlahBarang))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(129, 129, 129)
                                    .addComponent(IDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PembeliTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(BarangTransaksi)
                                    .addComponent(HargaTransaksi)
                                    .addComponent(TotalHargaBarangTransaksi)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTampil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MasukkanKeranjangTransaksi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HapusBarangKeranjang)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PembeliTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JumlahBarangTransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TambahJumlahBarang)
                        .addComponent(KurangiJumlahBarang)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(HargaTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TotalHargaBarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(MasukkanKeranjangTransaksi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTampil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HapusBarangKeranjang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahJumlahBarangActionPerformed

    private void tCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:

        cari();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariActionPerformed

    private void MasukkanKeranjangTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukkanKeranjangTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasukkanKeranjangTransaksiActionPerformed

    private void btnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTampilMouseClicked
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btnTampilMouseClicked

    private int jumlah;
    private void TambahJumlahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahJumlahBarangMouseClicked
       jumlah++;
       JumlahBarangTransaksi.setText(Integer.toString(jumlah));
    }//GEN-LAST:event_TambahJumlahBarangMouseClicked

    private void KurangiJumlahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KurangiJumlahBarangMouseClicked
        JumlahBarangTransaksi.setText(String.valueOf(jumlah--));
    }//GEN-LAST:event_KurangiJumlahBarangMouseClicked

    private void TableMenuBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMenuBarangMouseClicked
        int baris = TableMenuBarang.rowAtPoint(evt.getPoint());
        String ib = TableMenuBarang.getValueAt(baris, 0).toString();
        IDBarang.setText(ib);        
        String nb = TableMenuBarang.getValueAt(baris, 1).toString();
        BarangTransaksi.setText(nb);
        String hb = TableMenuBarang.getValueAt(baris, 2).toString();
        HargaTransaksi.setText(hb);        
    }//GEN-LAST:event_TableMenuBarangMouseClicked
    
    
    private void TotalHargaBarangTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaBarangTransaksiActionPerformed
        double banyak = Double.parseDouble(JumlahBarangTransaksi.getText());
        double harga = Double.parseDouble(HargaTransaksi.getText());
        double grandtotal = banyak * harga;
        TotalHargaBarangTransaksi.setText(Double.toString(grandtotal));
    }//GEN-LAST:event_TotalHargaBarangTransaksiActionPerformed

    private void HargaTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTransaksiActionPerformed

    }//GEN-LAST:event_HargaTransaksiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarangTransaksi;
    private javax.swing.JButton HapusBarangKeranjang;
    private javax.swing.JTextField HargaTransaksi;
    private javax.swing.JTextField IDBarang;
    private javax.swing.JTextField JumlahBarangTransaksi;
    private javax.swing.JButton KurangiJumlahBarang;
    private javax.swing.JButton MasukkanKeranjangTransaksi;
    private javax.swing.JTextField PembeliTransaksi;
    private javax.swing.JTable TableMenuBarang;
    private javax.swing.JButton TambahJumlahBarang;
    private javax.swing.JTextField TotalHargaBarangTransaksi;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tCari;
    // End of variables declaration//GEN-END:variables
}
