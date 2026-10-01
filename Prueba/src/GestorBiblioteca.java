import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    private List <Material> materiales;

    public listaMateriales() {
        materiales = new ArrayList<>();



    }
















    public GestorBiblioteca(List<Material> materiales) {
        this.materiales = materiales;
    }


    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}
