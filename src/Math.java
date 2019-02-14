public class Math {

    public int div(int a, int b)
    {
        return a/b;
    }
    public int add(int a, int b)
    {
        return a+b;
    }


    public int multiply(Object a, Object b){
        if ((b instanceof Integer)&&(a instanceof Integer)){
            return (int)a*(int)b;
        } else {
            throw new ArithmeticException("Not integer");
        }
    }

    public int substract(int a, int b)
    {
        return a-b;
    }

    public int fibonacci(int a){
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibonacci(a-2)+fibonacci(a-1);
    }

    public int faculty( int a){
        if (a == 1) return 1;
        return a*faculty(a-1);
    }

}

