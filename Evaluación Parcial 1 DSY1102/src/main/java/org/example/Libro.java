package org.example;

public class Libro {
    private String autor;
    private String estadoConservacion;
    private String reservado;

    public Libro(String autor, String estadoConservacion, String reservado) {
        this.autor = autor;
        this.estadoConservacion = estadoConservacion;
        this.reservado = reservado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    void Libro(){}

    void reservar (){}

    void calcularCostoPrestamo(){}

    void obtenerDtalles(){}
}
