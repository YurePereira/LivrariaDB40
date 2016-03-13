package testebdoo.db4o.model;

import com.db4o.ObjectSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LivroDAO extends DAO<Livro> {

    @Override
    public void inserir(Livro livro) {
        
        try {
            Conexao.getConexao().set(livro);
        } finally {
            Conexao.desconectar();
        }
    
    }

    @Override
    public List<Livro> buscar(Livro livro) {
    
        ObjectSet<Livro> lista;
        
        try {
            lista = Conexao.getConexao().get(livro);
            return lista;
        } finally {
            //Conexao.desconectar();
        }
        
    }
    
    @Override
    public List<Livro> buscar() {
    
        ObjectSet<Livro> lista;
        
        try {
            lista = Conexao.getConexao().get(Livro.class);
            return lista;
        } finally {
            //Conexao.desconectar();
        }
        
    }

    @Override
    public void atualizar(Livro o, Livro novosDados) {
    
        //Selecionar objetos livros a serem atualizados.
        ObjectSet<Livro> lista = Conexao.getConexao().get(o);
        
        //Fazer uma iteração em nada objeto livro.
        Iterator<Livro> iterator = lista.iterator();
	while (iterator.hasNext()) {
              
            Livro livro = iterator.next();
            livro.setNm_livro(novosDados.getNm_livro());
            livro.setDs_livro(novosDados.getDs_livro());
            livro.setCd_isbn(novosDados.getCd_isbn());
            livro.setDt_alterado(new Date(System.currentTimeMillis()));
            
            Conexao.getConexao().set(livro);
            
        }
        
    }

    @Override
    public List<Livro> deletar(Livro o) {
        
        //Selecionar objetos livros a serem atualizados.
        ObjectSet<Livro> lista = Conexao.getConexao().get(o);
        
        //Fazer uma iteração em nada objeto livro.
        Iterator<Livro> iterator = lista.iterator();
	while (iterator.hasNext()) {
              
            Livro livro = iterator.next();            
            Conexao.getConexao().delete(livro);
            
        }
    
        return lista;
        
    }

    
}
