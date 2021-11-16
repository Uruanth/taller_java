package com.sofka.university.ejercicio16;

import com.sofka.university.capturarDatos.CapturarDatos;

public class CrearPersonas {

    public static void iniciarPersonas() {
        System.out.println("Por favor ingrese el nombre de la persona:");
        String nombre = CapturarDatos.pedirDatos();
        System.out.println("Por favor ingrese la edad de "+nombre+":");
        int edad = Integer.parseInt(CapturarDatos.pedirDatos());
        System.out.println("Por favor ingrese el sexo(H hombre/M mujer) de "+nombre+":");
        char sexo = CapturarDatos.pedirDatos().charAt(0);
        System.out.println("Por favor ingrese el peso en kg de "+nombre+":");
        double peso = Double.parseDouble(CapturarDatos.pedirDatos());
        System.out.println("Por favor ingrese la altura en metros de "+nombre+":");
        double altura = Double.parseDouble(CapturarDatos.pedirDatos());

        //Creando personas
        Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        //Valores persona 3
        persona3.setName("Alexander Perilla");
        persona3.setEdad(26);
        persona3.setPeso(80);
        persona3.setAltura(1.8);
        persona3.setSexo('H');

        //Ejecución metodos, peso
        System.out.println(persona1.getName()+". "+persona1.estadoPeso());
        System.out.println(persona2.getName()+". "+persona2.estadoPeso());
        System.out.println(persona3.getName()+". "+persona3.estadoPeso());

        //edad
        System.out.println(persona1.getName()+" "+persona1.mayor()+" es mayor de edad");
        System.out.println(persona2.getName()+" "+persona2.mayor()+" es mayor de edad");
        System.out.println(persona3.getName()+" "+persona3.mayor()+" es mayor de edad");

        //toString
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("persona3 = " + persona3);
    }

}
