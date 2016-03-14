package testebdoo;

import java.util.Iterator;
import testebdoo.db4o.model.Livro;
import testebdoo.db4o.model.LivroDAO;

public class TesteBDOOListagem {

    public static void main(String[] args) {

        LivroDAO lDAO = new LivroDAO();
        
        //Recuperar todos os livros com id_livro igual a 1
        Iterator<Livro> iterator = lDAO.buscar().iterator();
	while (iterator.hasNext()) {

            Livro livro = (Livro) iterator.next();
            livro.toString();
            
	}

    }
    
}
