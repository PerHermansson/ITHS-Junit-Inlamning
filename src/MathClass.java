public class MathClass {
    public int intAdd(int x, int y) {
        return x + y;
    }

    public int intSub(int x, int y) {
        return x - y;
    }

    public int intMultiply(int x, int y) {
        return x * y;
    }

    public int intDivisionBool(int x, int y) {
        return x / y;
    }

    public int intDivision(int x, int y) {
        return x / y;
    }

    public static int fibonacciCode(int x) throws Exception {
        if(x < 0){
            throw new Exception();
        }
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonacciCode(x - 1) + fibonacciCode(x - 2);
        }
    }
}