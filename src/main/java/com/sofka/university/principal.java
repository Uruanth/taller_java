package com.sofka.university;

import com.sofka.university.ejercicio1.ejercicio;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {
    public static void main(String[] args) {


        System.out.println("Ingrese la opcion que desea: \n" +
                "1. Comprobar dos númros\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n" +
                "1. Ejercicio 1\n");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        Logger logger = Logger.getLogger("mylog");
        switch (opcion) {
            case 1:
                System.out.println(new ejercicio().comprobar());
                break;
            default:
                logger.log(Level.INFO, "No encontro la opción");
                break;


        }


    }
}
