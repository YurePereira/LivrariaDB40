package testebdrl;

import model.LivroBDRLFacade;
import util.Cronometro;

public class TesteDBRL1000Update {

    public static void main(String[] args) {

        Cronometro crn = LivroBDRLFacade.testeUpdate(1000);
        System.out.println(crn.toString());

    }
    
}
