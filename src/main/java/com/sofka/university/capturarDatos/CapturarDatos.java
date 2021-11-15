package com.sofka.university.capturarDatos;

import java.util.Scanner;

public class CapturarDatos {

    private  CapturarDatos(){}

    public static String pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
