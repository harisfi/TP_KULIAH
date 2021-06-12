/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.form;

import app.db.Absensi;
import app.db.AbsensiManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hryzx
 */
public class FormAbsensi extends javax.swing.JFrame {
    int idAbsen;
    /**
     * Creates new form FormAbsensi
     */
    public FormAbsensi() {
        initComponents();
        tampilData();
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                cmbKelas.addItem("TI-" + i + (char)(65 + j));
            }
        }
    }

    private void tampilData() {
        AbsensiManager manager = new AbsensiManager();
        List<Absensi> absensis = new ArrayList<>();
        
        String header[] = {"Id", "Bidang Minat", "Kelas", "Mata Kuliah", "NIM", "Nama", "Status", "Keterangan", "Waktu"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        tblAbsensi.setModel(model);
        
        absensis = manager.index();
        for (int i = 0; i < absensis.size(); i++) {
            Object baris[] = {
                absensis.get(i).getId(),
                absensis.get(i).getBidangMinat(),
                absensis.get(i).getKelas(),
                absensis.get(i).getMataKuliah(),
                absensis.get(i).getNim(),
                absensis.get(i).getNama(),
                absensis.get(i).getStatus(),
                absensis.get(i).getKeterangan(),
                absensis.get(i).getWaktu()
            };
            model.addRow(baris);
        }
        
        manager.closeConnection();
    }
    
    private void clearInput() {
        txtId.setText("");
        cmbBidangMinat.setSelectedIndex(0);
        cmbKelas.removeAllItems();
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                cmbKelas.addItem("TI-" + i + (char)(65 + j));
            }
        }
        cmbMataKuliah.setSelectedIndex(0);
        txtNim.setText("");
        txtNama.setText("");
        buttonGroup1.clearSelection();
        txtKeterangan.setText("");
        txtWaktu.setText("");
    }
    
    private void selectTable() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            try {
                list.add(tblAbsensi.getValueAt(tblAbsensi.getSelectedRow(), i).toString());
            } catch (Exception e) {
                list.add("");
                e.printStackTrace();
            }
        }
        idAbsen = Integer.parseInt(list.get(0));
        txtId.setText(list.get(0));
        cmbBidangMinat.setSelectedItem(list.get(1));
        cmbKelas.setSelectedItem(list.get(2));
        cmbMataKuliah.setSelectedItem(list.get(3));
        txtNim.setText(list.get(4));
        txtNama.setText(list.get(5));
        switch (list.get(6)) {
            case "hadir":
                rdHadir.setSelected(true);
                break;
            case "izin":
                rdIzin.setSelected(true);
                break;
            case "absen":
                rdAbsen.setSelected(true);
                break;
        }
        txtKeterangan.setText(list.get(7));
        txtWaktu.setText(list.get(8));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        cmbBidangMinat = new javax.swing.JComboBox<>();
        cmbKelas = new javax.swing.JComboBox<>();
        cmbMataKuliah = new javax.swing.JComboBox<>();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        rdHadir = new javax.swing.JRadioButton();
        rdIzin = new javax.swing.JRadioButton();
        rdAbsen = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        txtWaktu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbsensi = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAMPTI (Sistem Absensi Mahasiswa Prodi Teknologi Informasi)");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Absensi"));

        txtId.setEditable(false);

        cmbBidangMinat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknologi Informasi dan Komputer", "Sistem Informasi", "Bisnis Digital & E-Commerce", "Film & Televisi" }));
        cmbBidangMinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBidangMinatActionPerformed(evt);
            }
        });

        cmbMataKuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemrograman Berorientasi Objek", "Pemrograman Web", "Algoritma dan Pemrograman", "Basis Data", "Rekayasa Perangkat Lunak", "Desain UI/UX", "Komputer Grafis", "Bahasa Indonesia", "Bahasa Inggris", "Agama" }));

        buttonGroup1.add(rdHadir);
        rdHadir.setText("Hadir");

        buttonGroup1.add(rdIzin);
        rdIzin.setText("Izin");

        buttonGroup1.add(rdAbsen);
        rdAbsen.setText("Absen");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        txtWaktu.setEditable(false);

        tblAbsensi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAbsensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAbsensiMouseClicked(evt);
            }
        });
        tblAbsensi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAbsensiKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAbsensi);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Bidang Minat:");

        jLabel4.setText("Id:");

        jLabel5.setText("Kelas:");

        jLabel6.setText("Mata Kuliah:");

        jLabel7.setText("NIM:");

        jLabel8.setText("Nama:");

        jLabel9.setText("Status:");

        jLabel10.setText("Keterangan:");

        jLabel11.setText("Waktu:");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(96, 96, 96))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(71, 71, 71)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(28, 28, 28)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(26, 26, 26)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(81, 81, 81)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(68, 68, 68)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(64, 64, 64)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdHadir)
                                .addGap(18, 18, 18)
                                .addComponent(rdIzin)
                                .addGap(18, 18, 18)
                                .addComponent(rdAbsen))
                            .addComponent(txtWaktu)
                            .addComponent(txtNama)
                            .addComponent(txtNim)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbMataKuliah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(cmbBidangMinat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBidangMinat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdAbsen)
                            .addComponent(rdIzin)
                            .addComponent(rdHadir)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnClear))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAMPTI");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(Sistem Absensi Mahasiswa Prodi Teknologi Informasi)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblAbsensiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAbsensiMouseClicked
        selectTable();
    }//GEN-LAST:event_tblAbsensiMouseClicked

    private void cmbBidangMinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBidangMinatActionPerformed
        cmbKelas.removeAllItems();
        switch (cmbBidangMinat.getSelectedIndex()) {
            case 0:
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 3; j++) {
                        cmbKelas.addItem("TI-" + i + (char)(65 + j));
                    }
                }
                break;
            case 1:
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 3; j++) {
                        cmbKelas.addItem("SI-" + i + (char)(65 + j));
                    }
                }
                break;
            case 2:
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 3; j++) {
                        cmbKelas.addItem("BE-" + i + (char)(65 + j));
                    }
                }
                break;
            case 3:
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 3; j++) {
                        cmbKelas.addItem("FTV-" + i + (char)(65 + j));
                    }
                }
                break;
        }
    }//GEN-LAST:event_cmbBidangMinatActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        AbsensiManager manager = new AbsensiManager();
        Absensi a = new Absensi();
        
        a.setBidangMinat(cmbBidangMinat.getItemAt(cmbBidangMinat.getSelectedIndex()));
        a.setKelas(cmbKelas.getItemAt(cmbKelas.getSelectedIndex()));
        a.setMataKuliah(cmbMataKuliah.getItemAt(cmbMataKuliah.getSelectedIndex()));
        a.setNim(txtNim.getText());
        a.setNama(txtNama.getText());
        if (rdHadir.isSelected()) {
            a.setStatus("hadir");
        } else if (rdIzin.isSelected()) {
            a.setStatus("izin");
        } else {
            a.setStatus("absen");
        }
        a.setKeterangan(txtKeterangan.getText());
        
        manager.store(a);
        manager.closeConnection();
        
        clearInput();
        tampilData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        AbsensiManager manager = new AbsensiManager();
        Absensi a = new Absensi();
        
        a.setId(Integer.parseInt(txtId.getText()));
        a.setBidangMinat(cmbBidangMinat.getItemAt(cmbBidangMinat.getSelectedIndex()));
        a.setKelas(cmbKelas.getItemAt(cmbKelas.getSelectedIndex()));
        a.setMataKuliah(cmbMataKuliah.getItemAt(cmbMataKuliah.getSelectedIndex()));
        a.setNim(txtNim.getText());
        a.setNama(txtNama.getText());
        if (rdHadir.isSelected()) {
            a.setStatus("hadir");
        } else if (rdIzin.isSelected()) {
            a.setStatus("izin");
        } else {
            a.setStatus("absen");
        }
        a.setKeterangan(txtKeterangan.getText());
        
        manager.update(a);
        manager.closeConnection();
        
        clearInput();
        tampilData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        AbsensiManager manager = new AbsensiManager();
        Absensi a = new Absensi();
        
        a.setId(Integer.parseInt(txtId.getText()));
        
        manager.delete(a);
        manager.closeConnection();
        
        clearInput();
        tampilData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tblAbsensi.clearSelection();
        clearInput();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblAbsensiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAbsensiKeyReleased
        try {
            selectTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblAbsensiKeyReleased

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
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAbsensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbBidangMinat;
    private javax.swing.JComboBox<String> cmbKelas;
    private javax.swing.JComboBox<String> cmbMataKuliah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdAbsen;
    private javax.swing.JRadioButton rdHadir;
    private javax.swing.JRadioButton rdIzin;
    private javax.swing.JTable tblAbsensi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
