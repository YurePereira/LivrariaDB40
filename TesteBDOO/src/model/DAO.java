package model;

import java.util.List;

public abstract class DAO<E> {
     
    abstract public void inserir(E o);
    abstract public void atualizar(E o);
    abstract public void deletar(E o);
    abstract public List<E> buscar(E o);
    abstract public List<E> buscar();
    
}
