package testebdoo;

import java.util.Iterator;
import java.util.List;
import testebdoo.db4o.model.Livro;
import testebdoo.db4o.model.LivroDAO;

public class TesteBDOOBuscar {
 
    public static void main(String[] args) {

        LivroDAO lDAO = new LivroDAO();
        Livro l = new Livro();
        l.setId_livro(1);
        
        //Recuperar todos os livros com id_livro igual a 1
        
        Iterator<Livro> iterator = lDAO.buscar(l).iterator();
	while (iterator.hasNext()) {

            Livro livro = (Livro) iterator.next();
            livro.toString();
            
	}

    }
    
}
