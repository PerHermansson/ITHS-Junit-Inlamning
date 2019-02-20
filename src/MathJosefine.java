
public class MathJosefine {

    public int add(int a, int b)
    {
        long sum = (long)a + (long)b;

        if (sum > Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        else {
            return a + b;
        }
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        long product = (long)a * (long)b;

        if (product > Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        else {
            return a * b;
        }
    }

    public int divide(int a, int b)
    {
        return a / b;
    }

    public int factorial(int b){

        if (b < 0)
            throw new IllegalArgumentException();

        int a = 1;

        if (b >= 0) {
            for (int i = 1; i <= b; ++i) {
                a = a * i;
            }
        }

        if (a < 0){
            throw new ArithmeticException();
        } else {
            return a;
        }
    }

    public int fibonacciSum(int value)
    {
        if (value < 0)
            throw new IllegalArgumentException();

        long a = 0, b = 1, sum = 0;

        for (int i = 1; i <= value; ++i)
        {

            sum = a + b;
            a = b;
            b = sum;
        }

        if (sum > Integer.MAX_VALUE){
            throw new ArithmeticException();
        } else {
            return (int)sum;
        }
    }

    public boolean fibonacciNumber(int value)
    {
        if (value < 0)
            throw new IllegalArgumentException();

        int a = 0, b = 1, sum = 0;

        while(sum < value)
        {

            sum = a + b;
            a = b;
            b = sum;
        }

        if(sum == value)
            return true;
        else
            return false;

    }

}
