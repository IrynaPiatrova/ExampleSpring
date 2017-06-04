package culc;

/**
 * Created by John on 02.06.2017.
 */
public class Minus implements CulcInter {
    private double a;
    private double b;

    public Minus() {
    }

    public Minus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double culc() {
        return a - b;
    }
}
