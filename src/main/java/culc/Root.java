package culc;

/**
 * Created by John on 04.06.2017.
 */
public class Root implements CulcInter {
    private double a;

    public Root() {
    }

    public Root(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double culc() {
        return Math.sqrt(a);
    }
}
