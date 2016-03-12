package testebdoo;

import testebdoo.model.*;

public class TesteBDOOInsert {

    public static void main(String[] args) {

        LivroDAO lDAO = new LivroDAO();
        Livro l = new Livro();
        l.setId_livro(1);
        l.setNm_livro("Java Orientado a objetos");
        
        lDAO.inserir(l);

    }
    
}
