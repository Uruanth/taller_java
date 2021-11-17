package com.sofka.university.ejercicio18;

public class Videojuego implements Entregable {

    //Constantes
    private static final int HORAS_JUEGO = 10;
    private static final boolean ENTREGADO = false;

    //Atributos
    private String title = "";
    private int horas_estimadas = HORAS_JUEGO;
    private boolean entregado = ENTREGADO;
    private String genero = "";
    private String companhia = "";


    public Videojuego() {
    }

    public Videojuego(String title, int horas_estimadas) {
        this.title = title;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String title, int horas_estimadas, String genero, String companhia) {
        this.title = title;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.companhia = companhia;
    }

    //Getters

    public String getTitle() {
        return title;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getcompanhia() {
        return companhia;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setcompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "title='" + title + '\'' +
                ", horas_estimadas=" + horas_estimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", companhia='" + companhia + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;

    }

    @Override
    public void devolver() {
        this.entregado = false;

    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object o) {
        int comparar = ((Integer) this.horas_estimadas).compareTo(((Videojuego) o).getHoras_estimadas());
        return comparar;
    }
}
