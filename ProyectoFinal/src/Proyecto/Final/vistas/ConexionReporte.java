/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.vistas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JUNIOR CHAVEZ
 */
public class ConexionReporte {

    public ConexionReporte() {
    }
    public Connection getConexion(){
        Connection con=null;
        String sDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String sUrl="jdbc:sqlserver://localhost:1433;databaseName=ProyectoFinalDB";
        try {
            Class.forName(sDriver).newInstance();
            con= DriverManager.getConnection(sUrl,"usr_proyectofinal","12345");
            System.out.println("conexion Exitosa");
        } catch (Exception e) {
            System.err.println("Error al conectar con la base de datos");
        }
        return con;
        
    }
}
