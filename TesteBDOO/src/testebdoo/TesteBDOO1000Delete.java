package testebdoo;

import model.LivroBDOOFacade;
import util.Cronometro;

public class TesteBDOO1000Delete {

    public static void main(String[] args) {
        
        Cronometro crn = LivroBDOOFacade.testeDelete(1000);
        System.out.println(crn.toString());

    }   
    
}
