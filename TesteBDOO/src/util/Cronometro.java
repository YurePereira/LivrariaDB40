package util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cronometro {

    private static Date inicio, fim, tempoTotal;
    private static long total;

    public static void iniciar() {
        inicio = new Date();
    }

    public static void parar() {
        fim = new Date();
    }

    public static String tempoInicial() {
    
        SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm:ss:SS");
        return formatohora.format(inicio);
    
    }

    public static String tempoFinal() {
        
        SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm:ss:SS");
        return formatohora.format(fim);
    
    }

    public static long tempoTotal() {
        return fim.getTime() - inicio.getTime();
    }

    public static String tempoTotalToDate() {

        Date date = new Date(tempoTotal());
        SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm:ss:SSS");
        return formatohora.format(date);
        
    }
    
}
