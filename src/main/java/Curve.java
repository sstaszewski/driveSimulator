import java.util.LinkedList;
import java.util.List;

public class Curve {

    private List<Curve> curves;

    public Curve() {
        curves = new LinkedList();
    }

    public void addCurve(Curve curve) {
        curves.add(curve);
    }

    public void removeCurve(Curve curve){
        curves.remove(curve);
    }
}
