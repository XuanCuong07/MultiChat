/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BVCN 88
 */
public class DAO {
    public static Connection con;
    
    public DAO(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/chatappuser";
            try {
                con = DriverManager.getConnection(dbUrl, "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
