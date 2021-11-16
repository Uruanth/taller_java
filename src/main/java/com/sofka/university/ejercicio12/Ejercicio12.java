package com.sofka.university.ejercicio12;

import com.sofka.university.capturarDatos.CapturarDatos;

public class Ejercicio12 {

    private Ejercicio12() {
    }

    public static String iniciar() {

        String[] palabras = pedirPalabras();
        if (compararPalbras(palabras)) {
            return "Las palabras son iguales";
        } else {
            String[] result = diferenciasPalabras(palabras);
            return "La palabra '" + result[0] + "' tiene las diferencias con la palabra " + result[1];
        }

    }

    private static String[] pedirPalabras() {
        String[] palabras = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la palabra: " + (i+1));
            palabras[i] = CapturarDatos.pedirDatos();
            while (palabras[i].contains(" ")) {

                System.out.println("La palabra no puede tener espacios, vuelva a ingresar");
                palabras[i] = CapturarDatos.pedirDatos();
            }
        }
        return palabras;
    }

    private static boolean compararPalbras(String[] palabra) {
        return palabra[0].equals(palabra[1]);
    }


    private static String[] diferenciasPalabras(String[] palabras) {
        char[] palabra1 = palabras[0].toCharArray();
        char[] palabra2 = palabras[1].toCharArray();
        System.out.println("palabra1 = " + palabra1.toString());
        System.out.println("palabra2 = " + palabra2.toString());
        int contador = Math.min(palabra1.length, palabra2.length);
        palabras[0] = "";
        palabras[1] = "";
        for (int i = 0; i < contador; i++) {
            if (palabra1[i] != palabra2[i]) {
                palabras[0] += palabra1[i];
                palabras[1] += " -" + palabra2[i] + "-";
            } else {
                palabras[0] += palabra1[i];
                palabras[1] += palabra2[i];
            }
        }

        while (contador < palabra1.length) {
            palabras[0] += palabra1[contador];
            contador++;
        }
        while (contador < palabra2.length) {
            palabras[1] += " -" + palabra2[contador] + "-";
            contador++;
        }

        return palabras;
    }

}
