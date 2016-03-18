package testebdoo;

import model.LivroBDOOFacade;
import util.Cronometro;

public class TesteBDOOSelectAll {

    public static void main(String[] args) {

        Cronometro crn = LivroBDOOFacade.testeSelectAll();
        System.out.println(crn.toString());
        
    }
    
}
