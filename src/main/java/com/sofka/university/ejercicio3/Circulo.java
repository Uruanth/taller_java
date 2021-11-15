package com.sofka.university.ejercicio3;



import java.util.Scanner;

public class Circulo {

    private Circulo() {

    }

    public static double area(){
        double radius = capturaRadius();
        return Math.PI*Math.pow(radius,2);
    }

    private static double capturaRadius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        String dato = scanner.nextLine();
        return Double.parseDouble(dato);
    }
}
