package testebdrl;

import model.LivroBDRLFacade;
import util.Cronometro;

public class TesteBDRLSelectAll {

    public static void main(String[] args) {

        Cronometro crn = LivroBDRLFacade.testeSelectAll();
        System.out.println(crn.toString());
        
    }
}
