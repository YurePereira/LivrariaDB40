package testebdrl;

import model.LivroBDRLFacade;
import util.Cronometro;

public class TesteBDRL1000Select {

    public static void main(String[] args) {

        Cronometro crn = LivroBDRLFacade.testeSelect(1000);
        System.out.println(crn.toString());

    }
    
}
