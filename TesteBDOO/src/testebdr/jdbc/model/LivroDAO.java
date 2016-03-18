package testebdr.jdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.DAO;
import model.Livro;

public class LivroDAO extends DAO<Livro> {

    Connection conn = null;
    PreparedStatement preparedStatement = null;
    Statement statement = null;
    private final String INSERT = "INSERT INTO livro"
            + "(id_livro, nm_livro, ds_livro, cd_isbn, dt_lancamento, dt_registrado) VALUES "
            + "(?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE livro "
            + "SET nm_livro = ?, ds_livro = ?, cd_isbn = ?, dt_lancamento = ?, dt_alterado = ?"
            + " WHERE id_livro = ?";
    private final String DELETE = "DELETE FROM livro "
            + " WHERE id_livro = ?";
    private final String SELECT = "SELECT * FROM livro"
            + " WHERE id_livro = ?";
    private final String SELECT_ALL = "SELECT * FROM livro";
    private final String TRUNCATE = "TRUNCATE TABLE livro";

    @Override
    public void inserir(Livro livro) {
        
        try {

            Conexao.conectar();
            conn = Conexao.getConexao();
            
            preparedStatement = conn.prepareStatement(INSERT);
            preparedStatement.setInt(1, livro.getId_livro());
            preparedStatement.setString(2, livro.getNm_livro());
            preparedStatement.setString(3, livro.getDs_livro());
            preparedStatement.setString(4, livro.getCd_isbn());
            preparedStatement.setDate(5, (java.sql.Date) livro.getDt_lancamento()); 
            preparedStatement.setTimestamp(6, new Timestamp(new Date().getTime()));
            //Executar a afirmação insert
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                }
            }
            
            Conexao.desconectar();

        }

    }

    @Override
    public void atualizar(Livro livro) {
    
        try {

            Conexao.conectar();
            conn = Conexao.getConexao();
            
            preparedStatement = conn.prepareStatement(UPDATE);
            preparedStatement.setString(1, livro.getNm_livro());
            preparedStatement.setString(2, livro.getDs_livro());
            preparedStatement.setString(3, livro.getCd_isbn());
            preparedStatement.setTimestamp(4, new Timestamp(livro.getDt_lancamento().getTime()));
            preparedStatement.setTimestamp(5, new Timestamp(new Date().getTime()));
            preparedStatement.setInt(6, livro.getId_livro());
            //Executar a afirmação insert
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                }
            }

            Conexao.desconectar();

        }

    }

    @Override
    public void deletar(Livro livro) {
        
        List<Livro> list = null;
        
        try {
            
            Conexao.conectar();
            conn = Conexao.getConexao();
            
            preparedStatement = conn.prepareStatement(DELETE);
            preparedStatement.setInt(1, livro.getId_livro());
            
            preparedStatement.execute();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            Conexao.desconectar();
        }
    
    }

    @Override
    public List<Livro> buscar(Livro livro) {
    
        List<Livro> list = new ArrayList<>();
        ResultSet rs;
        
        try {
            
            Conexao.conectar();
            conn = Conexao.getConexao();
            
            preparedStatement = conn.prepareStatement(SELECT);
            preparedStatement.setInt(1, livro.getId_livro());
            
            rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                
                Livro l = new Livro();
                l.setId_livro(rs.getInt("id_livro"));
                l.setNm_livro(rs.getString("nm_livro"));
                l.setDs_livro(rs.getString("ds_livro"));
                l.setCd_isbn(rs.getString("cd_isbn"));
                l.setDt_lancamento(rs.getDate("Dt_lancamento"));
                l.setDt_registrado(rs.getDate("Dt_registrado"));
                l.setDt_alterado(rs.getDate("Dt_alterado"));
                l.setFl_status(rs.getBoolean("fl_status"));
                
                list.add(l);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage()); 
        } 
        
        return list;
         
    }

    @Override
    public List<Livro> buscar() {
    
        List<Livro> list = new ArrayList<>();
        Conexao.conectar();
        conn = Conexao.getConexao();
        ResultSet rs = null;
        
        try {
            
            statement = conn.createStatement();
            rs = statement.executeQuery(SELECT_ALL);
            
            while (rs.next()) {
                
                Livro l = new Livro();
                l.setId_livro(rs.getInt("id_livro"));
                l.setNm_livro(rs.getString("nm_livro"));
                l.setDs_livro(rs.getString("ds_livro"));
                l.setCd_isbn(rs.getString("cd_isbn"));
                l.setDt_lancamento(rs.getDate("Dt_lancamento"));
                l.setDt_registrado(rs.getDate("Dt_registrado"));
                l.setDt_alterado(rs.getDate("Dt_alterado"));
                l.setFl_status(rs.getBoolean("fl_status"));
                
                list.add(l);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage()); 
        } finally {
            Conexao.desconectar();
        }    
        
        return list;
    
    }
    
    public void limpar() {
        
        try {
            Conexao.conectar();
            conn = Conexao.getConexao();
            statement = conn.createStatement();
            statement.executeUpdate(TRUNCATE);
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage()); 
        } finally {           
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex.getMessage()); 
            }
            Conexao.desconectar();
        }
        
    }

}
