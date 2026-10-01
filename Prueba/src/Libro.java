public class Libro extends Material {
    private String autor;
    private String estadoConservacion;
    private String reservado;

    public Libro() {
    }


    int costo = 0;

    @Override
    public void calcularCostoPrestamo() {
        costo = 3500;
        if (estadoConservacion.equalsIgnoreCase("Deteriorado")){
            costo * 0.20




        }

    }

    @Override
    public void obtenerDetalles() {
        System.out.println("Titulo del libro: " + getTitulo() );
        System.out.println("Estado del libro: " + estadoConservacion);
        System.out.println("Està reservado: " + reservado);
        System.out.println("Anio de publicacion: " + super.getAnioPublicacion());
        System.out.println("Autor del libro: " + autor);
        System.out.println("Copias disponibles: " + super.getCopiasDisponibles());

    }




    public Libro(String titulo, String anioPublicacion, int copiasDisponibles, String autor, String estadoConservacion, String reservado) {
        super(titulo, anioPublicacion, copiasDisponibles);
        this.autor = autor;
        this.estadoConservacion = estadoConservacion;
        this.reservado = reservado;
    }

    public Libro(String autor, String estadoConservacion, String reservado) {
        this.autor = autor;
        this.estadoConservacion = estadoConservacion;
        this.reservado = reservado;
    }





























    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", estadoConservacion='" + estadoConservacion + '\'' +
                ", reservado='" + reservado + '\'' +
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
