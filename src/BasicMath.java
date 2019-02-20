public class BasicMath {
    /**
     * Divides a by b
     * @param a
     * @param b
     * @return The result of dividing a with b or Exception if b is zero
     */
    public static void main(String[] args) {

    }
    public int div(int a, int b)
    {
        if(a==-a)
        //if(false)
        {
            System.out.println("This is dead code");
        }
        return a/b;
    }
    //add
    public int add(int a, int b)
    {
        return a+b;
    }

    //subtract
    public int minus(int a, int b)
    {
        return a-b;
    }

    // multiply
    public Object multiply(Object a, Object b){
        if(a instanceof Integer && b instanceof Integer)
        {
            return (int)a*(int)b;
        }else {

            throw new ArithmeticException("Not an integer.");
        }

    }
    // fibonacci
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
