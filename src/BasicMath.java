public class BasicMath {
    /**
     * Divides a by b
     * @param a
     * @param b
     * @return The result of dividing a with b or Exception if b is zero
     */
    public static void main(String[] args) {

    }
    public int division(int a, int b)
    {
        if(a==-a)
        {
            System.out.println("This is dead code");
        }
        return a/b;
    }
    //addition funktion
    public int add(int a, int b)
    {
        return a+b;
    }

    // multiplicera funktion
    public int multiply(int a, int b) {
        return a*b;
    }

    //subtrahera funktion
    public int subtraction(int a, int b) {
        return a-b;
    }


    public long fibonacci(int n) {
        if(n <=1) return n;
        else return fibonacci(n-1) +fibonacci(n-2);
    }

}
