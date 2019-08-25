/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ena.modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String UserName = "ena";
    public static final String Password = "ena123";
    public static final String Host = "localhost";
    public static final String Port = "3307";
    public static final String DataBase = "requerimiento";
    public static final String ClassName = "com.mysql.jdbc.Driver";
    public static final String Url = "jdbc:mysql://" + Host + ":" + Port + "/" + DataBase;

    public java.sql.Connection con;

    public Conexion() {
        try {
            Class.forName(ClassName);
            con = DriverManager.getConnection(Url, UserName, Password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error:001");
        } catch (SQLException e) {
            System.out.println("Error:002");
        }
    }

}
