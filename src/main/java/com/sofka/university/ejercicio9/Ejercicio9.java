package com.sofka.university.ejercicio9;

import com.sofka.university.capturarDatos.CapturarDatos;


public class Ejercicio9 {

    private Ejercicio9() {}

    private static String texto = "La sonrisa sera la mejor arma contra la tristeza ";

    public static String cambiarCadena(){
        texto = texto.replace("a", "e");

        System.out.println("Ingrese el texto que desea agregar:");
        texto+=CapturarDatos.pedirDatos();
        return texto;
    }
}
