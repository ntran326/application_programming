// Nhu Tran

import java.util.Scanner;

public class ch2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter the number of minutes: ");
       int minutes = input.nextInt();

       // 1 year = 525600 minutes
       int years = minutes / 525600;
       // 1 day = 1440 minutes 
       int days = (minutes % 525600) / 1440;

       System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days");
       
    }
}
