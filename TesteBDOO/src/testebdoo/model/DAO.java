package testebdoo.model;

import java.util.List;

abstract class DAO<E> {
    
    protected Conexao conn;
    
    protected DAO() {
        conn = new Conexao();
    }
    
    abstract public void inserir(E o);
    abstract public E atualizar(E o);
    abstract public E deletar(E o);
    abstract public List<E> buscar(E o);
    abstract public List<E> buscar();
    
}
