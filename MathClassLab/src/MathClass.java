public class MathClass {
    // Addition Method
    public int addMethod(int a, int b){return a + b;}

    // Subtraction Method
    public int subtractMethod(int a, int b){return a - b;}

    // Multiplication Method
    public int multiplyMethod(Object a, Object b){

        if(a instanceof Integer && b instanceof Integer){
            return (int)a * (int) b;
        }else
            throw new ArithmeticException("Not an integer.");
    }


    // Dividation Method
    public long divideMethod(int a, int b) {
        long x = 0;
        if (b == 0) {
            System.out.print("None of the values can be zero!");
        } else
            x = a / b;
        return x;

    }

    public static int fib(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }
        else if (n < 2)
        {
            return n;
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // multiply
    public static int multiply(int a, int b){
        return a*b;
    }





}




