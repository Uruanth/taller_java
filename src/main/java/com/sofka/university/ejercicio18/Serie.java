package com.sofka.university.ejercicio18;

public class Serie implements  Entregable{

    //Constantes
    private static final int TEMPORADAS = 3;
    private static final boolean ENTREGADO = false;


    //Atributos
    private String title = "";
    private int numeroTemporadas = TEMPORADAS;
    private boolean entregado = ENTREGADO;
    private String genero = "";
    private String creador = "";


    public Serie() {
        
        Integer ent = numeroTemporadas;
        ent.compareTo((Integer) TEMPORADAS);
        
    }

    public Serie(String title, String creador) {
        this.title = title;
        this.creador = creador;
    }

    public Serie(String title, int numeroTemporadas, String genero, String creador) {
        this.title = title;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //Getters

    public String getTitle() {
        return title;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        int comparar = ((Integer) this.numeroTemporadas).compareTo(((Serie) o).getNumeroTemporadas());
        return comparar;
    }


}
