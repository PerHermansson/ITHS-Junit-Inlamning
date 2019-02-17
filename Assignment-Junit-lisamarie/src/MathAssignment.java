class MathAssignment {

    //method for addition

    int add(int a, int b) {

        return a + b;

    }

    double add(double a, double b) {

        return a + b;

    }

    //method for subtraction

    int subtraction(int a, int b) {

        return a - b;

    }

    double subtraction(double a, double b) {

        return a - b;

    }

    //methods for multiply

    int multiply(int a, int b) {

        return a * b;

    }

    Object multiply(Object a, Object b) {

        if (a instanceof Integer) {

            return a;

        } else {

            throw new ArithmeticException("Only Integers are allowed");

        }
    }

    //method for division

    int division(int a, int b) {

        if (a == 0) {

            throw new ArithmeticException("Cannot divide a number by zero");

        } else {

        }

        return a / b;
    }

}