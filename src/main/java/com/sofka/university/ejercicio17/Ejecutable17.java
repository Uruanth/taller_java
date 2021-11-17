package com.sofka.university.ejercicio17;

public class Ejecutable17 {

    public static void ejecutar() {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico(50, "rojo", 'D', 15);
        electrodomesticos[1] = new Electrodomestico(40, "verde", 'A', 35);
        electrodomesticos[2] = new Electrodomestico(30, 15);
        electrodomesticos[3] = new Electrodomestico(10, 15);

        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Lavadora(35, 45);
        electrodomesticos[6] = new Lavadora(70, "gris", 'N', 52, 8);

        electrodomesticos[7] = new Televisor();
        electrodomesticos[8] = new Televisor(100, 12);
        electrodomesticos[9] = new Televisor(200, "naranja", 'H', 20, 65, true);

        double precioElectrodomesticos=0;
        double precioLavadoras=0;
        double precioTelevisores=0;


        for(Electrodomestico el: electrodomesticos){
            System.out.println("\n"+el+" = " + el.precioFinal());
            if(el instanceof Electrodomestico) precioElectrodomesticos += el.precioFinal();
            if(el instanceof Lavadora) precioLavadoras += el.precioFinal();
            if(el instanceof Televisor) precioTelevisores += el.precioFinal();
        }

        System.out.println("\nprecio Electrodomesticos = " + precioElectrodomesticos);
        System.out.println("precio Televisores = " + precioTelevisores);
        System.out.println("precio Lavadoras = " + precioLavadoras);
    }

}
