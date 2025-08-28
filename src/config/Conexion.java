
package config;

import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancov1", "root", "");
            System.out.println("La conexión resultó exitosa");
        }catch(Exception e){
            System.out.println("La conexión salio mala");
        }
    }
    public Connection getConnection(){
        return con;
    }
}
