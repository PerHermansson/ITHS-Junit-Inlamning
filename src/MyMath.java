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
        x %= (Math.PI * 2);
        if (x < -Math.PI)
            x += Math.PI * 2;
        else if (x > Math.PI)
            x -= Math.PI * 2;
        double y = x;
        for (int i = 1; i <= 5; ++i)
            y += ((i % 2 == 1) ? -1 : 1)
                    * Math.pow(x, i * 2 + 1) / fac(i * 2 + 1);
        return y;
    }
}
