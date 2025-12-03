public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return a * b + c;
    }

    public static double expSum(double x) {
        // TODO
        return multadd(x, Math.exp(-x), (1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        // TODO: test methods

        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));
        System.out.println("multadd(1.5, 2, 0.5) = " + multadd(1.5, 2, 0.5));

        double result1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        double result2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("ln(10) + ln(20) = " + result2);

         double x = 2.0;
        System.out.println("expSum(" + x + ") = " + expSum(x));
    }
}
