/*
 * MyMath.java
 *
 * Torgny Lyon <torgny@abc.se>
 */

public class MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int fac(int a) {
        int r = 1;
        /*
         * Kasta ArithmeticException direkt istället för att påbörja en
         * beräkning som förr eller senare kommer innebära en division med noll.
         */
        if (a < 0)
            throw new ArithmeticException();
        for (int i = 1; i <= a; i++)
            r *= i;
        return r;
    }

    public double sin(double x) {
        if (x < 0)
            x = x * -1 + Math.PI;
        if (x > 2 * Math.PI) {  /* Reducera till mellan 0 och 2PI */
            int n = (int) (x / (2 * Math.PI));
            x -= n * (2 * Math.PI);
        }
        if (x == Math.PI / 2.0)
            return 1;
        else if (x == 3.0 * Math.PI / 2.0)
            return -1;
        return 0;
    }
}
