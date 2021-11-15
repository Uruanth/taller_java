package com.sofka.university.ejercicio6;


import java.util.ArrayList;
import java.util.List;

//Realiza el ejercicio anterior usando un ciclo for.
public class ParesImparesFor {

    private ParesImparesFor() {
    }

    public static void mostrar() {
        System.out.println("Pares\tImpares");
        for (int i = 0; i < 50; i++) {
            System.out.print(ParesImparesFor.pares().get(i) + "\t\t\t");
            System.out.println(ParesImparesFor.impares().get(i));
        }
    }

    private static List<Integer> pares() {
        List<Integer> pares = new ArrayList<>();
        for (int contador = 1; contador < 101; contador++) {
            if (contador % 2 == 0) pares.add(contador);
        }
        return pares;
    }

    private static List<Integer> impares() {
        List<Integer> impares = new ArrayList<>();
        for (int contador = 1; contador < 101; contador++) {
            if (contador % 2 != 0) impares.add(contador);
        }
        return impares;
    }
}
