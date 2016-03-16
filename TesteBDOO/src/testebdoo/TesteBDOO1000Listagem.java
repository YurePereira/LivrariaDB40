package testebdoo;

import java.util.Iterator;
import model.Livro;
import testebdoo.db4o.model.LivroDAO;
import util.Cronometro;

public class TesteBDOO1000Listagem {

    public static void main(String[] args) {

        Cronometro.iniciar();
        
        LivroDAO lDAO = new LivroDAO();
        
        //Recuperar todos os livros com id_livro igual a 1
        Iterator<Livro> iterator = lDAO.buscar().iterator();
	while (iterator.hasNext()) {

            Livro livro = (Livro) iterator.next();
            System.out.println(livro.toString());
            
	}
        
        Cronometro.parar();
        
        System.out.println("Tempo Inicial: " + Cronometro.tempoInicial());
        System.out.println("Tempo Final: " + Cronometro.tempoFinal());
        System.out.println("Tempo Total: " + Cronometro.tempoTotalToDate());
        
    }
    
}
