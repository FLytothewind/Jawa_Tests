package mypackage;

import javax.swing.table.TableRowSorter;

public class Test_3 {
    public static void main(String[] args) {

        boolean canSeePlayer = false;
        boolean playerPoweredUp = true;


        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }


        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature > 50) {
            System.out.println("Let’s stay home.");
        } else {
            System.out.println("Let’s go out!");
        }


        int time = 12;
        String timeOfDay;

        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
            System.out.println(timeOfDay);
        }
        else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
            System.out.println(timeOfDay);
        }
        else {
            timeOfDay = "night";
            System.out.println(timeOfDay);
        }


        int weekday = 5;
        boolean holiday = false;
        if (weekday >= 1 && weekday <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

        int dayOfWeek = 1;
        String schedule;

        switch(dayOfWeek) {
            case 1: schedule = "Gym in the morning";
            break;
            case 2: schedule = "Class after work";
            break;
            case 3: schedule = "Meetings all day";
            break;
            case 4: schedule = "Work from home";
            break;
            case 5: schedule = "Game night after work";
            break;
            case 6: schedule = "Free!";
            break;
            case 7: schedule = "Free!";
            break;
            default: schedule = "Invalid Data";
        }
        System.out.println(schedule);

        double [] m = {4.0, 6.2, 3.75, 5.1, 9.99};
        double s = m[0] + m[3];
        System.out.println(s);










    }
}