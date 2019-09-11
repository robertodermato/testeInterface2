import java.util.Comparator;

public class ComparadorArea implements Comparator<Pais> {

    @Override
    public int compare(Pais um, Pais outro) {
        return um.getArea() - outro.getArea();
    }
}
