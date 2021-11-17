package com.sofka.university.ejercicio16;


import java.util.Random;

public class Persona {


    //Constantes Clase
    private static final int BAJO_PESO = -1;
    private static final int PESO_NORMAL = 0;
    private static final int SOBREPESO = 1;
    private static final char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    //Atributos
    private String name;
    private int edad = 0;
    private String DNI;
    private double peso = 0;
    private double altura = 0;
    private static final char SEXO_DEFAULT = 'H';
    private char sexo = SEXO_DEFAULT;


    public Persona() {
        this.DNI = generarDNI();
    }

    public Persona(String name, int edad, char sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
        comprobarSexo(this.sexo);
    }

    public Persona(String name, int edad, double peso, double altura, char sexo) {
        this.name = name;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo(this.sexo);
        this.DNI = generarDNI();
    }

    public Persona(String name, int edad, double peso, double altura, char sexo, String DNI) {
        this.name = name;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.DNI = generarDNI();
        comprobarSexo(this.sexo);
    }

    private int calcularIMC() {
        double IMC = (this.peso / (Math.pow(this.altura, 2)));
        if (IMC < 20) return Persona.BAJO_PESO;
        else if (IMC >= 20 && IMC <= 25) return Persona.PESO_NORMAL;
        else if (IMC > 25) return Persona.SOBREPESO;
        return 2;

    }

    private boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public String mayor() {
        if (esMayorDeEdad()) return "Si";
        return "No";
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') this.sexo = SEXO_DEFAULT;
        else this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }

    public String estadoPeso() {
        switch (calcularIMC()) {
            case -1:
                return "Esta debajo del peso ideal";
            case 0:
                return "Esta en el peso ideal";
            case 1:
                return "Esta con sobre peso";
            case 2:
            default:
                return "Datos errados para el calculo";
        }


    }

    private int generarNumeroDNI() {
        Random rand = new Random();
        int DNI = rand.nextInt(99999999);
        return DNI;
    }

    private String generarDNI() {
        int numeroDNI = generarNumeroDNI();
        char letraDNI = letrasDNI[(numeroDNI % 23)];

        return "" + numeroDNI + letraDNI;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
