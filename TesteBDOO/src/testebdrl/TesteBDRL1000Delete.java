package testebdrl;

import model.LivroBDRLFacade;
import util.Cronometro;

public class TesteBDRL1000Delete {

    public static void main(String[] args) {
        
        Cronometro crn = LivroBDRLFacade.testeDelete(1000);
        System.out.println(crn.toString());
        
    }
    
}
