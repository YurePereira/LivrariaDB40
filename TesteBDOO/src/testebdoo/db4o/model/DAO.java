package testebdoo.db4o.model;

import java.util.List;

abstract class DAO<E> {
    
    protected Conexao conn;
    
    protected DAO() {
        conn = new Conexao();
    }
    
    abstract public void inserir(E o);
    abstract public void atualizar(E o, E oNewData);
    abstract public List<E> deletar(E o);
    abstract public List<E> buscar(E o);
    abstract public List<E> buscar();
    
}
