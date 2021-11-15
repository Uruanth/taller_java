package com.sofka.university.ejercicio10;

import com.sofka.university.capturarDatos.CapturarDatos;

//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
public class Ejercicio10 {

    private Ejercicio10() {}

    public static String quitarEspacios(){
        System.out.println("Ingrese una frase:");
        String texto = CapturarDatos.pedirDatos();
        texto = texto.replace(" ", "");
       return texto;
    }

}
