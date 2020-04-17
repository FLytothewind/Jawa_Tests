package mypackage;

public class Test_7_Methods {

    public static void main(String[] args) {

        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));

        showSum(10, 51, 77);


        sayWhat();

        sayHello("Joe");

        showSumToPerson("Dildo", 15, 16, 17);


        int[] array = {1, 22, 52, 34, 16};

        int sum2 = getSum2(array, "Dildak");
    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static void showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }

    static void sayWhat() {
        System.out.println("WHAT?");
        System.out.println("I said WHAT?");
        System.out.println("Can you see me?");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
        System.out.println("Go fck yourself");
        System.out.println("Goodbye");
    }

    static  void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of program:");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program!");
    }

    static int getSum2(int[] array, String name) {
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum2);
        return sum2;
    }
}
