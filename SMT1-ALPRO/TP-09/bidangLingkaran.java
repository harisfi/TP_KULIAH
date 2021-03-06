
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hryzx
 */
public class bidangLingkaran extends javax.swing.JFrame {
    DefaultComboBoxModel<String> mdl = new DefaultComboBoxModel();
    
    static Object kolom[] = {"Radius", "Jenis", "Hasil"};
    int baris = 0;
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);

    /**
     * Creates new form bidangLingkaran
     */
    public bidangLingkaran() {
        initComponents();
        
        TNama.setEditable(false);
        
        mdl.addElement("--Pilih Hitung--");
        mdl.addElement("Keliling");
        mdl.addElement("Luas");
        CHitung.setModel(mdl);
        
        TabelLingkaran.setModel(tbl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LJudul = new javax.swing.JLabel();
        PanelKiri = new javax.swing.JPanel();
        LNamaBidang = new javax.swing.JLabel();
        LRadius = new javax.swing.JLabel();
        LHitung = new javax.swing.JLabel();
        PanelKanan = new javax.swing.JPanel();
        TNama = new javax.swing.JTextField();
        TRadius = new javax.swing.JTextField();
        BProses = new javax.swing.JButton();
        CHitung = new javax.swing.JComboBox<>();
        PanelTabel = new javax.swing.JScrollPane();
        TabelLingkaran = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bidang Lingkaran");

        LJudul.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        LJudul.setForeground(new java.awt.Color(51, 0, 153));
        LJudul.setText("Bidang Lingkaran");
        LJudul.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        LNamaBidang.setText("Nama Bidang:");

        LRadius.setText("Radius:");

        LHitung.setText("Hitung");

        javax.swing.GroupLayout PanelKiriLayout = new javax.swing.GroupLayout(PanelKiri);
        PanelKiri.setLayout(PanelKiriLayout);
        PanelKiriLayout.setHorizontalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNamaBidang)
                    .addComponent(LRadius)
                    .addComponent(LHitung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKiriLayout.setVerticalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LNamaBidang)
                .addGap(18, 18, 18)
                .addComponent(LRadius)
                .addGap(18, 18, 18)
                .addComponent(LHitung)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TNama.setText("Lingkaran");

        BProses.setText("Proses");
        BProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelKananLayout = new javax.swing.GroupLayout(PanelKanan);
        PanelKanan.setLayout(PanelKananLayout);
        PanelKananLayout.setHorizontalGroup(
            PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TNama)
                    .addComponent(TRadius)
                    .addGroup(PanelKananLayout.createSequentialGroup()
                        .addComponent(BProses)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CHitung, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelKananLayout.setVerticalGroup(
            PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BProses)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabelLingkaran.setModel(new javax.swing.table.DefaultTableModel(
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
        PanelTabel.setViewportView(TabelLingkaran);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(LJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProsesActionPerformed
        double radius, keliling, luas;
        
        if (TRadius.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Radius tidak boleh kosong", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            radius = Double.parseDouble(TRadius.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukan harus berupa angka", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        switch (CHitung.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(this, "Pilih opsi hitung", "Error", JOptionPane.WARNING_MESSAGE);
                break;
            case 1:
                keliling = Math.PI * radius * 2;
                keliling = (double) Math.round(keliling * 10.0) / 10.0;
                JOptionPane.showMessageDialog(this, "Nama:\t" + TNama.getText() +
                                                    "\nRadius:\t" + TRadius.getText() +
                                                    "\nKeliling:\t" + keliling,
                                                    "Hasil", JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object[]{TRadius.getText(), CHitung.getSelectedItem(), keliling});
                TabelLingkaran.setModel(tbl);
                break;
            case 2:
                luas = Math.PI * Math.pow(radius, 2);
                luas = (double) Math.round(luas * 10.0) / 10.0;
                JOptionPane.showMessageDialog(this, "Nama:\t" + TNama.getText() +
                                                    "\nRadius:\t" + TRadius.getText() +
                                                    "\nLuas:\t" + luas,
                                                    "Hasil", JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object[]{TRadius.getText(), CHitung.getSelectedItem(), luas});
                TabelLingkaran.setModel(tbl);
                break;
        }
    }//GEN-LAST:event_BProsesActionPerformed

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
            java.util.logging.Logger.getLogger(bidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bidangLingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BProses;
    private javax.swing.JComboBox<String> CHitung;
    private javax.swing.JLabel LHitung;
    private javax.swing.JLabel LJudul;
    private javax.swing.JLabel LNamaBidang;
    private javax.swing.JLabel LRadius;
    private javax.swing.JPanel PanelKanan;
    private javax.swing.JPanel PanelKiri;
    private javax.swing.JScrollPane PanelTabel;
    private javax.swing.JTextField TNama;
    private javax.swing.JTextField TRadius;
    private javax.swing.JTable TabelLingkaran;
    // End of variables declaration//GEN-END:variables
}
