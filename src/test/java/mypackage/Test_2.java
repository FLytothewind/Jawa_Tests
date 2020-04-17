package mypackage;

import java.util.ArrayList;
import java.util.List;

public class Test_2 {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(9);

        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(a);

        list.set(2, 100);

        System.out.println(list.get(2));

        int b;
        b = 0;
        b = b + 5;
        b = b - 3;
        b = b - 1 + 5;
        System.out.println(b);

        String driver;
        driver = "Hamish";
        System.out.println(driver.length());
        System.out.println(driver.toUpperCase());

        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double sum=maths+english+science+drama;
        double average=sum/4;
        System.out.println(average);

        String firstName;
        String lastName;
        String fullName;
        firstName = "Vova";
        lastName = "Mukhov";
        fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ".");
        System.out.println("There are " + fullName.length() + " letters in my name.");

        double fahrenheit = 68.0;
        double celsius;
        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius);

        boolean isRaining = true;
        if(isRaining) {
            System.out.println("Windshield wipers on.");
        }

//Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

        int month = 13; // should be a number 1-12
        String monthString;

        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
            // write case 12 and a default case below
        }
        System.out.println(monthString);





    }
}
