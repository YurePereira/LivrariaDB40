package testebdoo;

import model.Livro;
import testebdoo.db4o.model.LivroDAO;
import util.Cronometro;

public class TesteBDOO1000Delete {

    public static void main(String[] args) {
        
        Cronometro.iniciar();
        
        LivroDAO lDAO = new LivroDAO();
        
        for (int i = 0; i < 1000; i++) {
                      
            Livro livro = new Livro();
            livro.setId_livro(i);

            lDAO.deletar(livro);      
        }
        
        Cronometro.parar();
        
        System.out.println("Tempo Inicial: " + Cronometro.tempoInicial());
        System.out.println("Tempo Final: " + Cronometro.tempoFinal());
        System.out.println("Tempo Total: " + Cronometro.tempoTotalToDate());

    }   
    
}
