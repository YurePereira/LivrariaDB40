package testebdrl;

import model.LivroBDRLFacade;
import util.Cronometro;

public class TesteDBRL1000Insert {

    public static void main(String[] args) {
        
        Cronometro crn = LivroBDRLFacade.testeInsert(1000);
        System.out.println(crn.toString());
        
    }
    
}
