package com.sofka.university.ejercicio13;


import java.time.LocalDateTime;


public class Ejercicio13 {


    private Ejercicio13() {
    }

    public static String tiempActual() {
        return "La fecha es " + fecha() + ".\nLa hora es " + hora();
    }


    private static String fecha() {
        String fecha = String.valueOf(LocalDateTime.now().getYear());
        fecha += "/" + LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getDayOfMonth();
        return fecha;
    }

    private static String hora() {
        String hora = String.valueOf(LocalDateTime.now().getHour());
        hora += ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond();
        return hora;
    }


}
