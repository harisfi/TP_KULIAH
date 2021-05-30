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
public class StudentManager {
    Connection conn = null;
    Statement st = null;
    String url = "jdbc:mysql://localhost:3306/university";
    String user = "root";
    String pass = "";
    
    public StudentManager() {
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
        List students = new ArrayList();
        try {
            rs = st.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                Student s = new Student();
                s.setNim(rs.getString("nim"));
                s.setName(rs.getString("name"));
                s.setAddress(rs.getString("address"));
                s.setEmail(rs.getString("email"));
                students.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    
    public int store(Student s) {
        int result = 0;
        try {
            result = st.executeUpdate(
                    "INSERT INTO Student VALUES('" +
                            s.getNim() + "', '" +
                            s.getName()+ "', '" +
                            s.getAddress() + "', '" +
                            s.getEmail() + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int update(Student s) {
        int result = 0;
        try {
            result = st.executeUpdate("UPDATE Student SET " + 
                    "nim = '" + s.getNim() + "', " +
                    "name = '" + s.getName() + "', " +
                    "address = '" + s.getAddress() + "', " +
                    "email = '" + s.getEmail() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int delete(Student s) {
        int result = 0;
        try {
            result = st.executeUpdate("DELETE FROM Student WHERE nim = " + s.getNim() + "'");
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
