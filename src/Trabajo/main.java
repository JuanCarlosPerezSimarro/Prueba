package Trabajo;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*Primer commit*/
/*Creada la rama develop*/
public class main {
    public static void main(String[] args) {
        /*
         * Ejemplo de uso del método CalculosMatematicos.divisores
         * Este método descompone un número en factores primos
         * Retornando un mapa con los factores primos
         */
        int num = 180;
        SortedMap<Integer,Integer> divisores = new TreeMap<>();
        divisores=calculosMatematicos.divisores(num);
        for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
            int divisor=entrada.getKey();
            int numeroVeces=entrada.getValue();
            for(int i=1;i<=numeroVeces;i++) {
                System.out.println(num+"\t|\t"+divisor);
                num=num/divisor;
            }
        }

        fracciones ejempoFraccion = new fracciones(3, 100);
        System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+ejempoFraccion);
    }
}
