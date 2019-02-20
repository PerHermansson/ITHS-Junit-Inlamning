public class BasicMath {

    public int divide(int a, int b)
    {
        return a / b;
    }

    public int multiply(int a, int b){
        return (a * b);
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public static int fibonacci(int x) throws Exception {
        if(x < 0){
            throw new Exception();
        }
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

}

