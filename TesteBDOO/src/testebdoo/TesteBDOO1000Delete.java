package testebdoo;

import testebdoo.db4o.model.Livro;
import testebdoo.db4o.model.LivroDAO;

public class TesteBDOO1000Delete {

    public static void main(String[] args) {
        
        LivroDAO lDAO = new LivroDAO();
        
        Livro livro = new Livro();
        livro.setId_livro(1);
        
        lDAO.deletar(livro);
        
    }   
    
}
