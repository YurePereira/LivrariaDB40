package testebdoo;

import model.Livro;
import testebdoo.db4o.model.LivroDAO;

public class TesteBDOOInsert {

    public static void main(String[] args) {

        LivroDAO lDAO = new LivroDAO();
        Livro l = new Livro();
        l.setId_livro(1);
        l.setNm_livro("Java Orientado a objetos");
        
        lDAO.inserir(l);

    }
    
}
