package util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Cronometro {

    private Date inicio, fim, tempoTotal;
    private long total;

    public void iniciar() {
        inicio = new Date();
    }

    public void parar() {
        fim = new Date();
    }

    public String tempoInicial() {
    
        SimpleDateFormat formatohora = new SimpleDateFormat("mm:ss:SS");
        return formatohora.format(inicio);
    
    }

    public String tempoFinal() {
        
        SimpleDateFormat formatohora = new SimpleDateFormat("mm:ss:SS");
        return formatohora.format(fim);
    
    }

    public long tempoTotal() {
        return fim.getTime() - inicio.getTime();
    }

    public String tempoTotalToDate() {

        Date date = new Date(tempoTotal());
        SimpleDateFormat formatohora = new SimpleDateFormat("mm:ss:SSS");
        return formatohora.format(date);
        
    }
    
    @Override
    public String toString() {
        
        return "Tempo Inicial: " + tempoInicial()
             + "\nTempo Final: " + tempoFinal()
             + "\nTempo Total: " + tempoTotalToDate();
        
    }
    
}
