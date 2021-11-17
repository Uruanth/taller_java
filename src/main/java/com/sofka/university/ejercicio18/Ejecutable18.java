package com.sofka.university.ejercicio18;

import java.util.Random;

public class Ejecutable18 {

    public static void empezar() {
        Serie[] series = new Serie[5];
        Videojuego[] videojuego = new Videojuego[5];


        //Construir series
        series[0] = new Serie("Serie 1", 4, "Comedia", "Un aleman");
        series[1] = new Serie("Serie 2", 1, "Terror", "Utto aleman");
        series[2] = new Serie("Serie 3", 2, "Accion", "Non aleman");
        series[3] = new Serie("Serie 4", "Scobby Dooh");
        series[4] = new Serie();

        //Construir VideoJuegos
        videojuego[0] = new Videojuego("VideoJuego 1", 12, "Acción", "Netondi");
        videojuego[1] = new Videojuego("VideoJuego 2", 42, "Plataformas", "Sage");
        videojuego[2] = new Videojuego("VideoJuego 3", 20, "Simulación", "Ictavasaen");
        videojuego[3] = new Videojuego("VideoJuego 4", 15);
        videojuego[4] = new Videojuego();


        //Entregar
        Random rand = new Random();
        int entregados = rand.nextInt(4);
        for (int i = 0; i < entregados; i++) {
            series[i].entregar();
        }
        entregados = rand.nextInt(4);
        for (int i = 0; i < entregados; i++) {
            videojuego[i].entregar();
        }

        //Contar entregados
        System.out.println("Las series entregados fueron: " + contarSeriesEntregadas(series));
        System.out.println("Los juegos entregados fueron: " + contarJuegosEntregados(videojuego));


        //Mas temporadas y mas horas estimadas
        System.out.println("La serie con mas temporadas es: " + masTemporadas(series));
        System.out.println("El juego con mas horas estimadas es: " + masHorasEstimadas(videojuego));
    }


    private static int contarSeriesEntregadas(Serie[] series) {
        int total = 0;
        for (Serie s : series) {
            if (s.isEntregado()) {
                s.devolver();
                total++;
            }
        }

        return total;
    }

    private static int contarJuegosEntregados(Videojuego[] videojuegos) {
        int total = 0;
        for (Videojuego v : videojuegos) {
            if (v.isEntregado()) {
                v.devolver();
                total++;
            }
        }
        return total;
    }

    private static Videojuego masHorasEstimadas(Videojuego[] videojuegos) {
        Videojuego vMasHoras = videojuegos[0];
        for (int i = 1; i < videojuegos.length; i++) {
            if (vMasHoras.getHoras_estimadas() < videojuegos[i].getHoras_estimadas())
                vMasHoras = videojuegos[i];
        }
        return vMasHoras;
    }

    private static Serie masTemporadas(Serie[] series) {
        Serie vMasTemporadas = series[0];
        for (int i = 1; i < series.length; i++) {
            if (vMasTemporadas.getNumeroTemporadas() < series[i].getNumeroTemporadas())
                vMasTemporadas = series[i];
        }
        return vMasTemporadas;
    }

}
