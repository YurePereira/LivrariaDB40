package testebdrl;

import java.util.Date;
import java.util.Random;
import model.Livro;
import testebdr.jdbc.model.LivroDAO;
import util.Cronometro;

public class TesteDBRL1000Update {

    public static void main(String[] args) {

        Cronometro.iniciar();

        LivroDAO lDAO;

        for (int i = 0; i < 1000; i++) {

            lDAO = new LivroDAO();
            Random rd = new Random();

            Livro l = new Livro();
            l.setId_livro(i);
            l.setNm_livro("Java Orientado a objetos 2" + rd.nextInt());
            l.setDs_livro("Descricao Java Orientado a objetos 2" + rd.nextInt());
            l.setDt_lancamento(new Date());
            l.setDt_alterado(new Date());

            lDAO.atualizar(l);

        }

        Cronometro.parar();

        System.out.println("Tempo Inicial: " + Cronometro.tempoInicial());
        System.out.println("Tempo Final: " + Cronometro.tempoFinal());
        System.out.println("Tempo Total: " + Cronometro.tempoTotalToDate());

    }
    
}
