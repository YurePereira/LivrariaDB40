package testebdr.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conn;
    
    public static void conectar() {
        
        try {

            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase ="livraria";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "";

            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        
    }
    
    public static void desconectar() {

        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
    
    public static Connection getConexao() {
        return conn;
    }

}
