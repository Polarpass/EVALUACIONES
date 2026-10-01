public abstract class Material implements IReservable {
    private String titulo;
    private String anioPublicacion;
    private int copiasDisponibles;

    public Material() {
    }

    public Material(String titulo, String anioPublicacion, int copiasDisponibles) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }








    public abstract void calcularCostoPrestamo ();








    public abstract void obtenerDetalles();





    @Override
    public String toString() {
        return "Material{" +
                "titulo='" + titulo + '\'' +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                '}';
    }
}
