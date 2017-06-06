package culc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by John on 02.06.2017.
 */
public class Start {
    private static double a;
    private static double b;
    private static double c;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("configprob.xml");
        SqrtSolver solver = (SqrtSolver) classPathXmlApplicationContext.getBean("solver");
        solver.getX();
        /*CulcInter plus = (CulcInter) classPathXmlApplicationContext.getBean("plus");
        CulcInter minus = (CulcInter) classPathXmlApplicationContext.getBean("minus");
        CulcInter multipl = (CulcInter) classPathXmlApplicationContext.getBean("multipl");
        CulcInter root = (CulcInter) classPathXmlApplicationContext.getBean("root");
        CulcInter divide = (CulcInter) classPathXmlApplicationContext.getBean("divide");*/
        /*CulcInter culcPlus = new Plus(args[0], args[1]);*/
        // System.out.println(culcPlus.culc());
        /*culc.CulcInter culcMinus = new culc.Minus(args[0], args[1]);
        System.out.println(culcMinus.culc());*/
        /*culc.Plus culculator = new culc.Plus();
        System.out.println(culculator.culc(args[0], args[1]));*/ //2
        //System.out.println(args[0] + args[1]); //1

        /*insertValues();
        double d = getD(multipl, minus);
        root.setA(d);
        double culcRoot = root.culc();
        double x1 = getX1(multipl, plus, divide, culcRoot);
        double x2 = getX1(multipl, minus, divide, culcRoot);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);*/
    }
}

    /*private static double getX1(CulcInter multipl, CulcInter plus, CulcInter divide, double d) {
        divide.setA(getZnam(multipl, plus, d));
        divide.setB(getDel(multipl));
        return divide.culc();
    }

    private static double getX2(CulcInter multipl, CulcInter minus, CulcInter divide, double d) {
        divide.setA(getZnam(multipl, minus, d));
        divide.setB(getDel(multipl));
        return divide.culc();
    }

    private static double getDel(CulcInter multipl) {
        multipl.setA(2);
        multipl.setB(a);
        return multipl.culc();
    }

    private static double getZnam(CulcInter multipl, CulcInter plus, double d) {
        plus.setA(gerOtrB(multipl));
        plus.setB(d);
        return plus.culc();
    }

    private static double gerOtrB(CulcInter multipl) {
        multipl.setA(-1);
        multipl.setB(b);
        return multipl.culc();
    }

   *//* private static double getZnam(CulcInter multipl, CulcInter minus, double d) {
        minus.setA(gerOtrB(multipl));
        minus.setB(d);
        return minus.culc();
    }*//*

    private static double getD(CulcInter multipl, CulcInter minus) {
        multipl.setA(4);
        multipl.setB(c);
        multipl.setA(multipl.culc());
        multipl.setB(a);
        minus.setA(Math.pow(b, 2));
        minus.setB(multipl.culc());
        return minus.culc();
    }

    private static void insertValues() {
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
*/