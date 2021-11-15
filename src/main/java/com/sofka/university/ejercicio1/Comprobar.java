package com.sofka.university.ejercicio1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Declara 2 variables numéricas (con el valor que desees),
 * he indica cual es mayor de los dos. Si son iguales indicarlo también.
 * Ve cambiando los valores para comprobar que funciona.
 */
public class Comprobar {

    private static double numero1;
    private static double numero2;
    final static private String error = "Algo salio mal";

    private static String mayorQue() {
        if (numero1 > numero2) return "el " + numero1 + " es mayor que " + numero2;
        else return menorQue();
    }

    private static String menorQue() {
        if (numero1 < numero2) return "el " + numero2 + " es mayor que " + numero1;
        else return iguales();
    }

    private static String iguales() {
        if (numero1 == numero2) return "Los numeros son iguales";
        else return error;
    }

    public static String comprobar(double num1, double num2) {
        numero1 = num1;
        numero2 = num2;
        return mayorQue();
    }
}
