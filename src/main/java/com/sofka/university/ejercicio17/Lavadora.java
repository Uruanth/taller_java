package com.sofka.university.ejercicio17;

public class Lavadora extends Electrodomestico {

    protected static final int CARGA_DEFAULT = 5;

    protected int carga = CARGA_DEFAULT;

    public Lavadora() {
    }

    public Lavadora(double precio_base, int peso) {
        super(precio_base, peso);
    }

    public Lavadora(double precio_base, String color, char consumo_energetico, int peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        precio += precioPorCarga();
        return precio;
    }

    protected double precioPorCarga() {
        double precioCarga = 0;
        if (this.carga > 30) precioCarga = 50;
        return precioCarga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio_base=" + precio_base +
                ", color='" + color + '\'' +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }

//Getters

    public int getCarga() {
        return carga;
    }
}
