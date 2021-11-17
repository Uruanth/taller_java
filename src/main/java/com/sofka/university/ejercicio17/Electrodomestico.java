package com.sofka.university.ejercicio17;


public class Electrodomestico {
    //Constantes Clase
    protected static final double _PRECIO = 100;
    protected static final String _COLOR = "BLANCO";
    protected static final int _PESO = 5;
    protected static final String[] COLORES_DISPONIBLES = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
    protected static final char[] TIPO_CONSUMO = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected static final char _CONSUMO = TIPO_CONSUMO[5];

    //Atributos
    protected double precio_base = _PRECIO;
    protected String color = _COLOR;
    protected char consumo_energetico = _CONSUMO;
    protected int peso = _PESO;


    public Electrodomestico() {
        //this.consumo_energetico = comprobarConsumoEnergetico(this.consumo_energetico);
        //this.color = comporbarColor(this.color);
    }

    public Electrodomestico(double precio_base, int peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.consumo_energetico = comprobarConsumoEnergetico(this.consumo_energetico);
        //this.color = comporbarColor(this.color);
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = comporbarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }


    protected char comprobarConsumoEnergetico(char consumo) {
        String aux = "" + consumo;
        aux = aux.toUpperCase();
        consumo = aux.charAt(0);
        for (char _consumo : TIPO_CONSUMO) {
            if (_consumo == consumo) return consumo;
        }
        return _CONSUMO;
    }

    protected String comporbarColor(String color) {
        color = color.toUpperCase();
        for (String col : COLORES_DISPONIBLES) {
            if (col.equals(color)) return color;
        }
        return _COLOR;
    }

    public double precioFinal() {
        double precioFinal = precioPorConsumo();
        precioFinal += precioPorPeso();

        return precioFinal;
    }

    protected double precioPorConsumo() {
        double precioPorConsumo;
        switch (this.consumo_energetico) {
            case 'A':
                precioPorConsumo = this.precio_base + 100;
                break;
            case 'B':
                precioPorConsumo = this.precio_base + 80;
                break;
            case 'C':
                precioPorConsumo = this.precio_base + 60;
                break;
            case 'D':
                precioPorConsumo = this.precio_base + 50;
                break;
            case 'E':
                precioPorConsumo = this.precio_base + 30;
                break;
            case 'F':
            default:
                precioPorConsumo = this.precio_base + 10;
                break;


        }
        return precioPorConsumo;
    }

    protected double precioPorPeso() {
        double precioPorPeso = 0;
        if (this.peso >= 0 && this.peso <= 19) precioPorPeso += 10;
        if (this.peso >= 20 && this.peso <= 49) precioPorPeso += 50;
        if (this.peso >= 50 && this.peso <= 79) precioPorPeso += 80;
        if (this.peso >= 80) precioPorPeso += 100;
        return precioPorPeso;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", color='" + color + '\'' +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                '}';
    }

    //Getters
    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }
}
