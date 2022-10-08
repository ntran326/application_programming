// Nhu Tran

import java.util.Scanner;

public class ch2_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int zone = input.nextInt();
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + zone) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" 
        + currentSecond); 
    }
}
