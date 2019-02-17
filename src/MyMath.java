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
        /*
         * Kasta ArithmeticException direkt istället för att påbörja en
         * beräkning som förr eller senare kommer innebära en division med noll.
         */
        if (a < 0)
            throw new ArithmeticException();
        if (a == 0)
            return 1;
        return a * fac(a - 1);
    }
}
