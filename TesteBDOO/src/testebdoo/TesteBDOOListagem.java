package testebdoo;

import java.util.Iterator;
import testebdoo.model.Livro;
import testebdoo.model.LivroDAO;

public class TesteBDOOListagem {

    public static void main(String[] args) {

        LivroDAO lDAO = new LivroDAO();
        
        //Recuperar todos os livros com id_livro igual a 1
        Iterator<Livro> iterator = lDAO.buscar().iterator();
	while (iterator.hasNext()) {

            Livro livro = (Livro) iterator.next();
            
            System.out.printf("Id: %d\n", livro.getId_livro());
            System.out.printf("Nome: %s\n", livro.getNm_livro());
            System.out.printf("Descrição: %s\n", livro.getDs_livro());
            System.out.printf("Data lançamento: %s\n", livro.getDt_lancamento());
            System.out.printf("ISBN: %s\n\n", livro.getCd_isbn());
            
	}
    }
    
}
