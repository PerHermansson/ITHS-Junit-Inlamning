public class Math {

        public int div(int a, int b) {
            if (a == -a) {
                System.out.println("Can not be done " + a);
            }
            return a / b;


        }

        public double div(double a, double b) {
            return a / b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b) {
            return a + b;
        }

        public static String add(String a, String b) {

            return a + b;
        }


        public int multiply(int a, int b) {
            return a * b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public double sub(double a, double b) {
            return a - b;
        }

        public static String sub(String a, String b) {
            int i = a.indexOf(b);
            if (i != -1) {
                return a.substring(0, i) + a.substring(i + b.length());
            }
            return a;

        }
}
