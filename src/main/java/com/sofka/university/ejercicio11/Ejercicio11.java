package com.sofka.university.ejercicio11;

import com.sofka.university.capturarDatos.CapturarDatos;

public class Ejercicio11 {

    private Ejercicio11() {
    }


    private static int contarCaracteres(String texto) {
        return texto.length();
    }

    private static int[] contarVocales(String texto) {
        int[] vocales = new int[5];
        String[] voc = {"a", "e", "i", "o", "u"};
        texto = texto.toLowerCase();
        for (int i = 0; i < 5; i++) {

            if (texto.indexOf(voc[i]) != -1) vocales[i] = texto.split(voc[i]).length;
            else vocales[i] = 0;

            if (vocales[i] > 1) vocales[i] -= 1;
        }
        return vocales;
    }

    public static String procesarFrase() {
        System.out.println("Ingrese una frase:");
        String texto = CapturarDatos.pedirDatos();
        int txtLongitude = contarCaracteres(texto);
        int[] numVocales = contarVocales(texto);

        return "La frase tiene una logitud de: " + txtLongitude + ", tiene:\n" +
                "a = " + numVocales[0] +
                "\ne = " + numVocales[1] +
                "\ni = " + numVocales[2] +
                "\no = " + numVocales[3] +
                "\nu = " + numVocales[4];
    }

}
