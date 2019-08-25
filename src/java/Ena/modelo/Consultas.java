/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ena.modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Consultas extends Conexion {

    public boolean Autenticacion(String usuario, String pass) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "select * from usuario";
        rs = st.executeQuery(Consulta);
        while (rs.next()) {
            if (usuario.equals(rs.getString("usuario")) && pass.equals(rs.getString("password"))) {
                return true;
            }
        }
        return false;
    }

    public ResultSet Get_Gerencia() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "select * from gerencia";
        rs = st.executeQuery(Consulta);
        return rs;
    }

    /* testeamos la consulta 
    public static void main(String[] args) throws SQLException{
    Consultas con= new Consultas();
    System.out.println("R:"+con.Autenticacion("pfuentea", "123"));
    
    
    }
     */
}
