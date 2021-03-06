package com.sofka.university.ejercicio14;

import com.sofka.university.capturarDatos.CapturarDatos;

public class Ejercicio14 {
    private  Ejercicio14(){}

    public static String deXa1000() {
        int input = solicitarNumero();
        return completarConteo(input);
    }

    private static int solicitarNumero() {
        System.out.println("Ingrese un número entero:");

        try {
            return Integer.parseInt(CapturarDatos.pedirDatos());
        } catch (Exception e) {
            System.out.println("El dato ingresado es incorrecto");
            return solicitarNumero();
        }
    }

    public static String completarConteo(int numero) {
        StringBuilder result = new StringBuilder();
        while (numero < 999) {
            for (int i = 0; i < 5; i++) {
                if (numero > 998) break;
                numero += 2;
                result.append(numero) ;
                result.append("\t\t") ;
            }
            if (numero > 998) break;
            result.append("\n") ;
        }

        return result.toString();
    }
}
