/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import viewclient.Manager;

/**
 *
 * @author BVCN 88
 */
public class InsertDAO {
    public void update(){
        Connection com=null;
        PreparedStatement preparedStatement=null;
        try {
             Manager s= new Manager();
             Date date= new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
             String time=sdf.format(date.getTime());
             com=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatappuser","root", "");
             String sql="INSERT INTO lichsu(user,ngay)"+"values(?,?)";
             preparedStatement=com.prepareStatement(sql);
             preparedStatement.setString(1, s.getUsername());
             preparedStatement.setString(2, time);
             preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(InsertDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(com!=null){
                try {
                    com.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
