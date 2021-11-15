package com.sofka.university;

import com.sofka.university.ejercicio1.Comprobar;
import com.sofka.university.ejercicio2.CapturaDatos;
import com.sofka.university.ejercicio3.Circulo;
import com.sofka.university.ejercicio4.Producto;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {
    public static void main(String[] args) {


        System.out.println("Ingrese la opcion que desea: \n" +
                "1. Comprobar dos númros\n" +
                "2. Pediro dos números para comprobar\n" +
                "3. Calcular área de un círculo\n" +
                "4. Calcular precio total\n" +
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
                System.out.println(Comprobar.comprobar(9, 8));
                break;
            case 2:
                double[] datos = CapturaDatos.pedirDatos();
                System.out.println(Comprobar.comprobar(datos[0], datos[1]));
                break;
            case 3:
                System.out.println("El área del círuclo es: " + Circulo.area());
                break;
            case 4:
                System.out.println(Producto.calcularPrecio());
                break;
            default:
                logger.log(Level.INFO, "No encontro la opción");
                break;


        }


    }
}
