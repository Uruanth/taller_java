package com.sofka.university.ejercicio4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Producto {

    private final static double iva = 0.21;

    public static String calcularPrecio() {
        double precio = pedirDatos();
        if(precio == 0) return "Precio incorrecto";
        else return ""+(precio + precio*iva);
    }

    private static double pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        String dato = scanner.nextLine();
        try {
            double precio = Double.parseDouble(dato);
            return precio;
        } catch (Exception e){
            Logger logger = Logger.getLogger("MyLog");
            logger.log(Level.WARNING, "Dato incorrecto");
            return 0;
        }
    }

}
