import java.lang.Math;
import java.util.Arrays;

public class boletoSimple {
    
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int NUMS = 5;

    public static void main(String[] args){
        int[] boleto = generaBoleto();
        System.out.println(Arrays.toString(boleto));
    }

    public static int[] generaBoleto() {
        int[] numeros = new int[NUMS];

        for (int i=0; i < NUMS; i++) {
            numeros[i] = generaNumeros();
        }
        Arrays.sort(numeros);
        return numeros;        
    }

    private static int generaNumeros() {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }

    
}