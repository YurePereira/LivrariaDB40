package testebdoo;

import model.LivroBDOOFacade;
import util.Cronometro;

public class TesteDBOO1000Update {

    public static void main(String[] args) {

        Cronometro crn = LivroBDOOFacade.testeUpdate(1000);
        System.out.println(crn.toString());

    }
    
}
