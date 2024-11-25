/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Ideapad Slim3
 */
public class KoneksiDatabase {
    
    Connection Con;
    private Connection KoneksiDataBase(){
         try{
             //membuat Driver Dataabse
             Class.forName("com.mysql.jdbc.Driver");
             //untuk mengkoneksikan dp ke driver
             Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signin", "root", "");
             return Con;
             
         } catch (Exception e){
             //panel koneksi berhasil
             JOptionPane.showMessageDialog(null, e);
             return null;
             
         }}}
    
    

