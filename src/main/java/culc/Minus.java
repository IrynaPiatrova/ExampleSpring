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
    @Override
    public double getA() {
        return a;
    }
    @Override
    public void setA(double a) {
        this.a = a;
    }
    @Override
    public double getB() {
        return b;
    }
    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double culc() {
        return a - b;
    }
}
