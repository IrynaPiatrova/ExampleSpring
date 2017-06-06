package culc;

import java.util.Scanner;

/**
 * Created by John on 06.06.2017.
 */
public class Solver implements SqrtSolver {
    private CulcInter divide;
    private CulcInter minus;
    private CulcInter multiplication;
    private CulcInter plus;
    private CulcInter root;
    private double a;
    private double b;
    private double c;

    public Solver(CulcInter divide, CulcInter minus, CulcInter multiplication, CulcInter plus, CulcInter root) {
        this.divide = divide;
        this.minus = minus;
        this.multiplication = multiplication;
        this.plus = plus;
        this.root = root;
    }

    public Solver() {
    }

    public CulcInter getDivide() {
        return divide;
    }

    public void setDivide(CulcInter divide) {
        this.divide = divide;
    }

    public CulcInter getMinus() {
        return minus;
    }

    public void setMinus(CulcInter minus) {
        this.minus = minus;
    }

    public CulcInter getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(CulcInter multiplication) {
        this.multiplication = multiplication;
    }

    public CulcInter getPlus() {
        return plus;
    }

    public void setPlus(CulcInter plus) {
        this.plus = plus;
    }

    public CulcInter getRoot() {
        return root;
    }

    public void setRoot(CulcInter root) {
        this.root = root;
    }

    @Override
    public void getX() {
        insertValues();
        double d = getD();
        root.setA(d);
        double culcRoot = root.culc();
        double x1 = getX1Value(culcRoot);
        double x2 = getX2Value(culcRoot);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }

    public double getX1Value(double d) {
        return getResoult(divide, getZnam(plus, d), getDel());
    }

    public double getX2Value(double d) {
        return getResoult(divide, getZnam(minus, d), getDel());
    }

    public double getDel() {
        return getResoult(multiplication, 2, a);
    }

    public double getZnam(CulcInter culcInter, double d) {
        return getResoult(culcInter, gerOtrB(), d);
    }

    public double gerOtrB() {
        return getResoult(multiplication, -1, b);
    }

    public double getD() {
        double resoultMult = getResoult(multiplication, 4, c);
        double resoultMultA = getResoult(multiplication, resoultMult, a);
        return getResoult(minus, Math.pow(b, 2), resoultMultA);
    }

    private double getResoult(CulcInter culc, double x, double y) {
        culc.setA(x);
        culc.setB(y);
        return culc.culc();
    }

    public void insertValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уравнение вида: a*x^2 + b*x + c = 0 ");
        System.out.println("Введите a: ");
        a = getValue(scanner);
        System.out.println("Введите b: ");
        b = getValue(scanner);
        System.out.println("Введите c: ");
        c = getValue(scanner);
    }

    private static double getValue(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextDouble();
        }
        return 0;
    }
}
