public class AudioLibro extends Material {
    private int duracionMinutos;

    public AudioLibro() {
    }

    @Override
    public void calcularCostoPrestamo() {



    }





    @Override
    public void obtenerDetalles() {
        System.out.println("Duracion del audio libro:" + duracionMinutos);
        System.out.println("Anio publicacion: " + super.getAnioPublicacion());
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Copias disponibles " + super.getCopiasDisponibles());
    }

    public AudioLibro(String titulo, String anioPublicacion, int copiasDisponibles, int duracionMinutos) {
        super(titulo, anioPublicacion, copiasDisponibles);
        this.duracionMinutos = duracionMinutos;
    }





























    @Override
    public String toString() {
        return "AudioLibro{" +
                "duracionMinutos=" + duracionMinutos +
                '}';
    }

    @Override
    public String isReservado() {
        return "";
    }

    @Override
    public String reserva() {
        return "";
    }
}
