package testebdoo.db4o.model;

import com.db4o.ObjectContainer;
import model.DAO;
import com.db4o.ObjectSet;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.Livro;

public class LivroDAO extends DAO<Livro> {

    private ObjectContainer conn;
    
    public LivroDAO() {
        Conexao.conectar();
        conn = Conexao.getConexao();
    }
    
    @Override
    public void inserir(Livro livro) {
        
        conn.set(livro);
    
    }

    @Override
    public List<Livro> buscar(Livro livro) {
    
        ObjectSet<Livro> lista;
        
        lista = conn.get(livro);
        return lista;
        
    }
    
    @Override
    public List<Livro> buscar() {
    
        ObjectSet<Livro> lista;
        
        lista = conn.get(Livro.class);
        return lista;
        
    }

    @Override
    public void atualizar(Livro o) {
    
        Livro livroAtualizado = new Livro();
        livroAtualizado.setId_livro(o.getId_livro());
        //Selecionar objetos livros a serem atualizados.
        ObjectSet<Livro> lista = conn.get(livroAtualizado);
        
        //Fazer uma iteração em nada objeto livro.
        Iterator<Livro> iterator = lista.iterator();
	while (iterator.hasNext()) {
              
            Livro livro = iterator.next();
            livro.setNm_livro(o.getNm_livro());
            livro.setDs_livro(o.getDs_livro());
            livro.setCd_isbn(o.getCd_isbn());
            livro.setDt_alterado(new Date(System.currentTimeMillis()));
            
            Conexao.getConexao().set(livro);
            
        }
        
    }

    @Override
    public void deletar(Livro o) {
        
        //Selecionar objetos livros a serem atualizados.
        ObjectSet<Livro> lista = conn.get(o);
        
        //Fazer uma iteração em nada objeto livro.
        Iterator<Livro> iterator = lista.iterator();
	while (iterator.hasNext()) {
              
            Livro livro = iterator.next();            
            Conexao.getConexao().delete(livro);
            
        }
        
    }
    
    public void limpar() {
     
        String nome = "livraria.yap";  
        File file = new File(nome);  
        file.delete();
        
    }
    
    public void desconectar() {
        Conexao.desconectar();
    }
    
}
