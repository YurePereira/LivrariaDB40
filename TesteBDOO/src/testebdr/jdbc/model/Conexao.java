package testebdr.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static String status = "Não conectou...";

    public Conexao() {}

    public static Connection getConexao() {

        Connection conn = null;

        try {

            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase ="livraria";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "";      //sua senha de acesso

            conn = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (conn != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return conn;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }

    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {
        return status;
    }

    //Método que fecha sua conexão//
    public static boolean desconectar() {

        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

}
