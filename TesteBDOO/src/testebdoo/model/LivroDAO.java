package testebdoo.model;

import com.db4o.ObjectSet;
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
    public Livro atualizar(Livro o) {
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public Livro deletar(Livro o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
