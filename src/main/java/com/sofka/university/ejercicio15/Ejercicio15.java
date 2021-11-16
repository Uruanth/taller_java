package com.sofka.university.ejercicio15;

import com.sofka.university.capturarDatos.CapturarDatos;

public class Ejercicio15 {

    private static final String menu = "****** GESTION CINEMATOGRÁFICA ********\n" +
            "1-NUEVO ACTOR\n" +
            "2-BUSCAR ACTOR\n" +
            "3-ELIMINAR ACTOR\n" +
            "4-MODIFICAR ACTOR\n" +
            "5-VER TODOS LOS ACTORES\n" +
            "6- VER PELICULAS DE LOS ACTORES\n" +
            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
            "8-SALIR\n";


    public static String mostrarMenu() {
        int opcion;
        do {
            System.out.println(menu);
            try {
                opcion = Integer.parseInt(CapturarDatos.pedirDatos());
                if (opcion > 8) {
                    opcion = 0;
                    System.out.println("Opción incorrecta");
                }
            } catch (Exception e) {
                System.out.println("Opción incorrecta");
                opcion = 0;
            }
        } while (opcion < 8);
        return "Gracias, vuelva pronto";
    }

}
