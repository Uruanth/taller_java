package com.sofka.university.ejercicio7;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class MayorCero {

    private MayorCero() {
    }

    public static String comprobar() {
        if (MayorCero.pedirDato() >= 0) return "El número ingresado es mayor que 0";
        else return "Vualva intentar";
    }


    private static double pedirDato() {
        System.out.println("Ingrese un número");
        Scanner scanner = new Scanner(System.in);
        String dato = scanner.nextLine();
        try {
            return Double.parseDouble(dato);
        } catch (Exception e) {
            return -0.0123;
        }
    }
}
