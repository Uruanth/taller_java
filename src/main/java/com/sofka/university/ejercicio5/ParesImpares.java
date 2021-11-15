package com.sofka.university.ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class ParesImpares {
    private ParesImpares() {
    }

    public static void mostrar(){
        System.out.println("Pares\tImpares");
        for( int i =0; i<50; i++){
            System.out.print(ParesImpares.pares().get(i)+"\t\t\t");
            System.out.println(ParesImpares.impares().get(i));
        }
    }

    private static List<Integer> pares(){
        int contador = 1;
        List<Integer> pares = new ArrayList<>();
        while(contador<101){
            if(contador%2 == 0) pares.add(contador);
            contador++;
        }
        return pares;

    }



    private static List<Integer> impares(){
        int contador = 1;
        List<Integer> impares = new ArrayList<>();
        while(contador<101){
            if(contador%2 != 0) impares.add(contador);
            contador++;
        }
        return impares;
    }
}
