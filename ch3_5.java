// Nhu Tran

import java.util.Scanner;

public class ch3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int today = input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int future_date = (today + elapsed) % 7;
        String day_of_week = "";

        switch (today) {
            case 0:
                day_of_week = "Sunday";
                break;
            case 1:
                day_of_week = "Monday";
                break;
            case 2:
                day_of_week = "Tuesday";
                break;
            case 3:
                day_of_week = "Wednesday";
                break;
            case 4:
                day_of_week = "Thursday";
                break;
            case 5:
                day_of_week = "Friday";
                break;
            case 6:
                day_of_week = "Saturday";
                break;
        }

        if (future_date == 0) {
            System.out.println("Today is " + day_of_week + " and the future day is Sunday");
        } else if (future_date == 1) {
            System.out.println("Today is " + day_of_week + " and the future day is Monday");
        } else if (future_date == 2) {
            System.out.println("Today is " + day_of_week + " and the future day is Tuesday");
        } else if (future_date == 3) {
            System.out.println("Today is " + day_of_week + " and the future day is Wednesday");
        } else if (future_date == 4) {
            System.out.println("Today is " + day_of_week + " and the future day is Thursday");
        } else if (future_date == 5) {
            System.out.println("Today is " + day_of_week + " and the future day is Friday");
        } else if (future_date == 6) {
            System.out.println("Today is " + day_of_week + " and the future day is Satuday");
        }
    }

}