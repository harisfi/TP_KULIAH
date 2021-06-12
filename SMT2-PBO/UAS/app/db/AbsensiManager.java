/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hryzx
 */
public class AbsensiManager {
    Connection conn = null;
    Statement st = null;
    String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
    String user = "root";
    String pass = "";
    
    public AbsensiManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List index() {
        ResultSet rs = null;
        List absens = new ArrayList();
        try {
            rs = st.executeQuery("SELECT * FROM tbl_absensi ORDER BY id DESC");
            while (rs.next()) {
                Absensi a = new Absensi();
                a.setId(rs.getInt("id"));
                a.setBidangMinat(rs.getString("bidang_minat"));
                a.setKelas(rs.getString("kelas"));
                a.setMataKuliah(rs.getString("mata_kuliah"));
                a.setNim(rs.getString("nim"));
                a.setNama(rs.getString("nama"));
                a.setStatus(rs.getString("status"));
                a.setKeterangan(rs.getString("keterangan"));
                a.setWaktu(rs.getTimestamp("waktu"));
                absens.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return absens;
    }
    
    public int store(Absensi a) {
        int result = 0;
        try {
            result = st.executeUpdate(
                    "INSERT INTO tbl_absensi(bidang_minat, kelas, mata_kuliah, nim, nama, status, keterangan) VALUES('" +
                            a.getBidangMinat()+ "', '" +
                            a.getKelas() + "', '" +
                            a.getMataKuliah() + "', '" +
                            a.getNim() + "', '" +
                            a.getNama() + "', '" +
                            a.getStatus() + "', '" +
                            a.getKeterangan() + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int update(Absensi a) {
        int result = 0;
        try {
            result = st.executeUpdate("UPDATE tbl_absensi SET " + 
                    "bidang_minat = '" + a.getBidangMinat() + "', " +
                    "kelas = '" + a.getKelas() + "', " +
                    "mata_kuliah = '" + a.getMataKuliah() + "', " +
                    "nim = '" + a.getNim() + "', " +
                    "nama = '" + a.getNama() + "', " +
                    "status = '" + a.getStatus() + "', " +
                    "keterangan = '" + a.getKeterangan() +
                    "' WHERE id = '" + a.getId() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int delete(Absensi a) {
        int result = 0;
        try {
            result = st.executeUpdate("DELETE FROM tbl_absensi WHERE id = '" + a.getId() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void closeConnection() {
        try {
            conn.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
