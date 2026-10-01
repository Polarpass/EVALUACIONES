package org.example;

public class Material {
    private String titulo;
    private short anioPublicacion;
    private short copiasDisponibles;

    public Material(String titulo, short copiasDisponibles, short anioPublicacion) {
        this.titulo = titulo;
        this.copiasDisponibles = copiasDisponibles;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public short getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(short copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    void Material(){}

    void calcularCostoPrestamo(){}

    void obtenerDtalles(){}


}
