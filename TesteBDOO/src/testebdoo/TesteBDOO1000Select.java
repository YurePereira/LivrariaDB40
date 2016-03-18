package testebdoo;

import model.LivroBDOOFacade;
import util.Cronometro;

public class TesteBDOO1000Select {
 
    public static void main(String[] args) {

        Cronometro crn = LivroBDOOFacade.testeSelect(1000);
        System.out.println(crn.toString());

    }
    
}
