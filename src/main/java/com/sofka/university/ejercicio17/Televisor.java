package com.sofka.university.ejercicio17;

public class Televisor extends Electrodomestico {

    protected static final int RESOLUCION = 20;
    protected static final boolean SINTONIZADOR_TDT = false;

    protected int resolution = RESOLUCION;
    protected boolean sincronizador_tdt = SINTONIZADOR_TDT;

    public Televisor() {
    }

    public Televisor(double precio_base, int peso) {
        super(precio_base, peso);
    }

    public Televisor(double precio_base, String color, char consumo_energetico, int peso, int resolution, boolean sincronizador_tdt) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolution = resolution;
        this.sincronizador_tdt = sincronizador_tdt;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        precio += precioPorTDT();
        precio += precioPorResolution();
        return precio;
    }

    protected double precioPorResolution() {
        double precio = 0;
        if (this.resolution > 40) precio = super.precioFinal() * 0.3;
        return precio;
    }

    protected double precioPorTDT() {
        double precio = 0;
        if (this.sincronizador_tdt) precio = 50;
        return precio;

    }

    @Override
    public String toString() {
        return "Televisor{" +
                "precio_base=" + precio_base +
                ", color='" + color + '\'' +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                ", resolution=" + resolution +
                ", sincronizador_tdt=" + sincronizador_tdt +
                '}';
    }

    //Getters
    public int getResolution() {
        return resolution;
    }

    public boolean isSincronizador_tdt() {
        return sincronizador_tdt;
    }
}
