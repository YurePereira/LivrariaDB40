package testebdoo;

import model.LivroBDOOFacade;
import util.Cronometro;

public class TesteBDOO1000Insert {

    public static void main(String[] args) {

        Cronometro crn = LivroBDOOFacade.testeInsert(1000);
        System.out.println(crn.toString());

    }

}
