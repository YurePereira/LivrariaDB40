package util;

import java.util.Date;
import java.text.SimpleDateFormat;

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
        
        long segundos = tempoTotal() / 1000;
        long s = segundos / 60;
        long m = (segundos / 60) % 60;
        long h = (segundos / (60 * 60)) % 24;
        long ms = h % 1000;
        return String.format("%d:%02d:%02d:%03d", h,m,s,ms);
        
    }
    
}
