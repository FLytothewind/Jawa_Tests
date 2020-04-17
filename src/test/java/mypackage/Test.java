package mypackage;



public class Test {

    public static void main(String[] args) {


        int a = 3;
        switch (a) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("I don't know the number");


        }
        System.out.println();
        System.out.println("Start program");
        for (int i = 0; i < 5; i++) {
            System.out.println(i * 10);
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is:" + array[i]);
        }

        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }


    }
}
