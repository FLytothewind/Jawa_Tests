package mypackage;

public class Test_8_Exception {

    public static void main(String[] args) {

        devide(10, 2);
        devide2(10, 0);

    }

    public static void devide(int a, int b) {
        try {
            System.out.println("Results is: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");
        }
    }


    public static void devide2(int c, int d) {
            if (d == 0) {
                throw new ArithmeticException("Can not devide by zero!");
            } else {
                System.out.println("Result is: " + c/d);
        }
    }
}
