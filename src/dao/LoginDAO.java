/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import viewclient.Manager;

/**
 *
 * @author BVCN 88
 */
public class LoginDAO extends DAO{
    public LoginDAO(){
        super();
    }
    
    public boolean checkLogin(Manager manager) {
        boolean result = false;
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, manager.getUsername());
            ps.setString(2, manager.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean checkRegister(Manager manager) {
        String sqlAddEmployee = 
            "INSERT INTO user(username, password, email) VALUES(?,?,?)";     
        boolean result = true;
        try {
            PreparedStatement ps = con.prepareStatement(sqlAddEmployee, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, manager.getUsername());
            ps.setString(2, manager.getPassword());
            ps.setString(3, manager.getEmail());
      
            ps.executeUpdate();
            
        } catch(Exception e) {
            result = false;         
            try {               
                con.rollback();
            }catch(Exception ex) {
                result = false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {               
                //con.setAutoCommit(true);//set this line into comment in JUnit test mode
            }catch(Exception ex) {
                result = false;
                ex.printStackTrace();
            }
        }
        
        return result;
    }
}
