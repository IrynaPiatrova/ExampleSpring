package culc;

/**
 * Created by John on 04.06.2017.
 */
public class Multiplication implements CulcInter {
    private double a;
    private double b;

    public Multiplication() {
    }

    public Multiplication(double a, double b) {
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
        return a * b;
    }
}
