package model;

import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import testebdoo.db4o.model.LivroDAO;
import util.Cronometro;

public class LivroBDOOFacade {

    public static Cronometro testeInsert(int qtd) {

        Cronometro crn = new Cronometro();
        
        crn.iniciar();
        
        LivroDAO lDAO = new LivroDAO();

        for (int i = 0; i < qtd; i++) {

            Random rd = new Random();

            Livro l = new Livro();
            l.setId_livro(i);
            l.setNm_livro("Java Orientado a objetos" + rd.nextInt());
            l.setDs_livro("Descricao Java Orientado a objetos" + rd.nextInt());
            l.setDt_registrado(new Date());

            lDAO.inserir(l);

        }

        crn.parar();

        return crn;

    }
    
    public static Cronometro testeDelete(int qtd) {

        Cronometro crn = new Cronometro();
        
        crn.iniciar();
        
        LivroDAO lDAO = new LivroDAO();
        
        for (int i = 0; i < qtd; i++) {
                      
            Livro livro = new Livro();
            livro.setId_livro(i);

            lDAO.deletar(livro);      
        }
        
        crn.parar();
        
        return crn;
        
    }
    
    public static Cronometro testeUpdate(int qtd) {
        
        Cronometro crn = new Cronometro();
        
        crn.iniciar();
        
        LivroDAO lDAO = new LivroDAO();

        for (int i = 0; i < qtd; i++) {

            Random rd = new Random();

            Livro l = new Livro();
            l.setId_livro(i);
            l.setNm_livro("Java Orientado a objetos" + rd.nextInt());
            l.setDs_livro("Descricao Java Orientado a objetos" + rd.nextInt());
            l.setDt_registrado(new Date());

            lDAO.atualizar(l);

        }
        
        crn.parar();
        
        return crn;
        
    }
    
    public static Cronometro testeSelectAll() {
        
        Cronometro crn = new Cronometro();
        
        crn.iniciar();
        
        LivroDAO lDAO = new LivroDAO();
        
        //Recuperar todos os livros com id_livro igual a 1
        Iterator<Livro> iterator = lDAO.buscar().iterator();
	while (iterator.hasNext()) {

            Livro livro = (Livro) iterator.next();
            System.out.println(livro.toString());
            
	}
        
        crn.parar();
        
        return crn;
        
    }
    
    public static Cronometro testeSelect(int qtd) {
        
        Cronometro crn = new Cronometro();
        
        crn.iniciar();
        
        LivroDAO lDAO = new LivroDAO();
        Livro l;
     
        for (int i = 0; i < qtd; i++) {
        
            l = new Livro();
            l.setId_livro(i);

            //Recuperar todos os livros com id_livro igual a 1
            Iterator<Livro> iterator = lDAO.buscar(l).iterator();
            Livro livro = (Livro) iterator.next();
            System.out.println(livro.toString());

        }
        
        crn.parar();
        
        return crn;
        
    }

}
