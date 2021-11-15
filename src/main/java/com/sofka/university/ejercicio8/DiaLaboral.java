package com.sofka.university.ejercicio8;


import com.sofka.university.capturarDatos.CapturarDatos;

/**
 * Crea una aplicación por consola que nos pida un día de la semana y
 * que nos diga si es un día laboral o no. Usa un switch para ello.
 */
public class DiaLaboral {

    private DiaLaboral() {
    }

    public static String comprobar() {
        System.out.println("Ingrese un dia:");
        String dia = CapturarDatos.pedirDatos();
        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                return "Es un dia laboral";
            default:
                return "No es un dia laboral";
        }

    }

}
