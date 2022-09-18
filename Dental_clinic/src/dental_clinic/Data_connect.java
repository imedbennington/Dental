/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dental_clinic;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Data_connect {
    Connection cnx;
    String url_database;
    String url_driver;
    public  Data_connect(){
    String urldriver ="com.mysql.jdbc.Driver";
    String urldatabase ="jdbc:mysql://localhost:3306/dentist";
    //pilote
    try{
        Class.forName(urldriver);
        System.out.println("Chargement de piloe reussi");
    }
    catch(ClassNotFoundException exp){
        System.out.println("driver not found");
    }
    //data base connection
    try{
        cnx = DriverManager.getConnection(urldatabase,"root","");
        System.out.println("Chargement base de donnee reussi");
    }
    catch(SQLException err){
       System.out.println("data base not found"); 
    }
}
   Connection obtenircon (){
      return cnx; 
    } 
}