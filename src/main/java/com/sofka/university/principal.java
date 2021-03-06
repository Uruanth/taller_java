package com.sofka.university;

import com.sofka.university.ejercicio1.Comprobar;
import com.sofka.university.ejercicio10.Ejercicio10;
import com.sofka.university.ejercicio11.Ejercicio11;
import com.sofka.university.ejercicio12.Ejercicio12;
import com.sofka.university.ejercicio13.Ejercicio13;
import com.sofka.university.ejercicio14.Ejercicio14;
import com.sofka.university.ejercicio15.Ejercicio15;
import com.sofka.university.ejercicio16.CrearPersonas;
import com.sofka.university.ejercicio17.Ejecutable17;
import com.sofka.university.ejercicio17.Electrodomestico;
import com.sofka.university.ejercicio18.Ejecutable18;
import com.sofka.university.ejercicio2.Ejercicio2;
import com.sofka.university.ejercicio3.Circulo;
import com.sofka.university.ejercicio4.Producto;
import com.sofka.university.ejercicio5.ParesImpares;
import com.sofka.university.ejercicio6.ParesImparesFor;
import com.sofka.university.ejercicio7.MayorCero;
import com.sofka.university.ejercicio8.DiaLaboral;
import com.sofka.university.ejercicio9.Ejercicio9;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {
    public static void main(String[] args) {

        boolean flag = true;

        do {
            try {


                System.out.println("\nIngrese la opcion que desea: \n" +
                        "0. Salir\n" +
                        "1. Comprobar dos númros\n" +
                        "2. Pedir dos números para comprobar\n" +
                        "3. Calcular área de un círculo\n" +
                        "4. Calcular precio total\n" +
                        "5. Mostar pares e impares del 1 al 100 (Ciclo while)\n" +
                        "6. Mostar pares e impares del 1 al 100 (Ciclo For)\n" +
                        "7. Comprobar si un número es mayor que 0\n" +
                        "8. Comprobar si es un día laboral\n" +
                        "9. Remplazar por e y agregar la cadena que se desea\n" +
                        "10. Quitar los espacios a una frase\n" +
                        "11. Contar longitud y vocales de una frase\n" +
                        "12. Comparar dos palabras\n" +
                        "13. Fecha y hora actual en formato (AAAA/MM/DD) y (HH:MM:SS)\n" +
                        "14. Contar de x a 1000\n" +
                        "15. Menú cinematográfico\n" +
                        "16. Personas\n" +
                        "17. Electrodomesticos\n" +
                        "18. Videojuegos y series\n"
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
                    case 9:
                        System.out.println(Ejercicio9.cambiarCadena());
                        break;
                    case 10:
                        System.out.println(Ejercicio10.quitarEspacios());
                        break;
                    case 11:
                        System.out.println(Ejercicio11.procesarFrase());
                        break;
                    case 12:
                        System.out.println(Ejercicio12.iniciar());
                        break;
                    case 13:
                        System.out.println(Ejercicio13.tiempActual());
                        break;
                    case 14:
                        System.out.println(Ejercicio14.deXa1000());
                        break;
                    case 15:
                        System.out.println(Ejercicio15.mostrarMenu());
                        break;
                    case 16:
                        CrearPersonas.iniciarPersonas();
                        break;
                    case 17:
                        Ejecutable17.ejecutar();
                        break;
                    case 18:
                        Ejecutable18.empezar();
                        break;
                    case 0:
                        flag = false;
                        break;
                    default:
                        logger.log(Level.INFO, "No encontro la opción");
                        break;

                }


            } catch (Exception e) {
                flag = true;
                System.out.println("Error en el programa, vuelva a intentar");
            }
        } while (flag);


    }
}
