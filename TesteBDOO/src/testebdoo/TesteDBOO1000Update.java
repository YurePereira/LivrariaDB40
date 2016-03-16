package testebdoo;

import java.util.Date;
import java.util.Random;
import model.Livro;
import testebdoo.db4o.model.LivroDAO;
import util.Cronometro;

public class TesteDBOO1000Update {

    public static void main(String[] args) {

        Cronometro.iniciar();

        LivroDAO lDAO;

        for (int i = 0; i < 1000; i++) {

            lDAO = new LivroDAO();
            Random rd = new Random();

            Livro l = new Livro();
            l.setId_livro(i);
            l.setNm_livro("Java Orientado a objetos" + rd.nextInt());
            l.setDs_livro("Descricao Java Orientado a objetos" + rd.nextInt());
            l.setDt_registrado(new Date());

            lDAO.atualizar(l);

        }

        Cronometro.parar();

        System.out.println("Tempo Inicial: " + Cronometro.tempoInicial());
        System.out.println("Tempo Final: " + Cronometro.tempoFinal());
        System.out.println("Tempo Total: " + Cronometro.tempoTotalToDate());

    }
    
}
