package testebdoo;

import java.util.Date;
import java.util.Random;
import testebdoo.db4o.model.Livro;
import testebdoo.db4o.model.LivroDAO;

public class TesteBDOO1000Insert {

    public static void main(String[] args) {

        LivroDAO lDAO;

        for (int i = 0; i < 1000; i++) {

            lDAO = new LivroDAO();
            Random rd = new Random();

            Livro l = new Livro();
            l.setId_livro(i);
            l.setNm_livro("Java Orientado a objetos" + rd.nextInt());
            l.setDs_livro("Descricao Java Orientado a objetos" + rd.nextInt());
            l.setDt_registrado(new Date());

            lDAO.inserir(l);

        }

    }

}
