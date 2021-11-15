package com.sofka.university.ejercicio2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CapturaDatos {


    public static double[] pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("CaptDatos");
        double[] result = new double[2];
        try {
            System.out.println("Ingrese el primer número");
            result[0] = scanner.nextDouble();
            System.out.println("Ingrese el segundo número");
            result[1] = scanner.nextDouble();
        } catch (Exception e) {
            logger.log(Level.WARNING, "Error con los datos, ejercicio 2");
        }
        return result;
    }

}
