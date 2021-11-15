package com.sofka.university.ejercicio1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Declara 2 variables numéricas (con el valor que desees),
 * he indica cual es mayor de los dos. Si son iguales indicarlo también.
 * Ve cambiando los valores para comprobar que funciona.
 */
public class ejercicio {

    private double numero1;
    private double numero2;
    final private String error = "Algo salio mal";

    private String mayorQue() {
        if (numero1 > numero2) return "el " + numero1 + " es mayor que " + numero2;
        else return menorQue();
    }

    private String menorQue() {
        if (numero1 < numero2) return "el " + numero2 + " es mayor que " + numero1;
        else return iguales();
    }

    private String iguales() {
        if (numero1 == numero2) return "Los numeros son iguales";
        else return error;
    }

    public String comprobar() {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("logEjercicio");
        try{
            System.out.println("Ingrese el primer número:");
            this.numero1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            this.numero2 = scanner.nextDouble();
            return mayorQue();
        }catch (Exception e){
            logger.log(Level.WARNING, "Datos no soportados, ejercicio 1");
            return error;
        }


    }
}
