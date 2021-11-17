package com.sofka.university.ejercicio16;

import com.sofka.university.capturarDatos.CapturarDatos;

public class CrearPersonas {

    public static void iniciarPersonas() {
     
    
        Persona[] personas = new Persona[3];
        
        for(int i=0; i<3;i++){
            System.out.println("Por favor ingrese el nombre de la persona: "+(i+1));
            String nombre = CapturarDatos.pedirDatos();
            System.out.println("Por favor ingrese la edad de "+nombre+":");
            int edad = Integer.parseInt(CapturarDatos.pedirDatos());
            System.out.println("Por favor ingrese el sexo(H hombre/M mujer) de "+nombre+":");
            char sexo = CapturarDatos.pedirDatos().charAt(0);
            System.out.println("Por favor ingrese el peso en kg de "+nombre+":");
            double peso = Double.parseDouble(CapturarDatos.pedirDatos());
            System.out.println("Por favor ingrese la altura en metros de "+nombre+":");
            double altura = Double.parseDouble(CapturarDatos.pedirDatos());
            personas[i] = new Persona(nombre, edad, peso, altura, sexo);
        }
        
        

        //Ejecución metodos, peso
        System.out.println(personas[0].getName()+". "+personas[0].estadoPeso());
        System.out.println(personas[1].getName()+". "+personas[1].estadoPeso());
        System.out.println(personas[2].getName()+". "+personas[2].estadoPeso());

        //edad
        System.out.println(personas[0].getName()+" "+personas[0].mayor()+" es mayor de edad");
        System.out.println(personas[1].getName()+" "+personas[1].mayor()+" es mayor de edad");
        System.out.println(personas[2].getName()+" "+personas[2].mayor()+" es mayor de edad");

        //toString
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        System.out.println("personas[2] = " + personas[2]);
    }

}
