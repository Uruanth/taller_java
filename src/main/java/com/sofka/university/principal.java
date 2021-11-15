package com.sofka.university;

import com.sofka.university.ejercicio1.Comprobar;
import com.sofka.university.ejercicio2.Ejercicio2;
import com.sofka.university.ejercicio3.Circulo;
import com.sofka.university.ejercicio4.Producto;
import com.sofka.university.ejercicio5.ParesImpares;
import com.sofka.university.ejercicio6.ParesImparesFor;
import com.sofka.university.ejercicio7.MayorCero;
import com.sofka.university.ejercicio8.DiaLaboral;

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
                "5. Mostar pares e impares del 1 al 100 (Ciclo while)\n" +
                "6. Mostar pares e impares del 1 al 100 (Ciclo For)\n" +
                "7. Comprobar si un número es mayor que 0\n"+
                "8. Comprobar si es un día laboral\n"
        );

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        Logger logger = Logger.getLogger("mylog");
        switch (opcion) {
            case 1:
                System.out.println(Comprobar.comprobar(9, 8));
                break;
            case 2:
                double[] datos = Ejercicio2.pedirDatos();
                System.out.println(Comprobar.comprobar(datos[0], datos[1]));
                break;
            case 3:
                System.out.println("El área del círuclo es: " + Circulo.area());
                break;
            case 4:
                System.out.println(Producto.calcularPrecio());
                break;
            case 5:
                ParesImpares.mostrar();
                break;
            case 6:
                ParesImparesFor.mostrar();
                break;
            case 7:
                String ejercicio7;
                do {
                    ejercicio7 = MayorCero.comprobar();
                    System.out.println(ejercicio7);
                } while (ejercicio7.equals("Vualva intentar"));
                break;
            case 8:
                System.out.println(DiaLaboral.comprobar());
                break;
            default:
                logger.log(Level.INFO, "No encontro la opción");
                break;


        }


    }
}
