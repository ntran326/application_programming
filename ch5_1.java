// Nhu Tran

import java.util.Scanner;

public class ch5_1 {
    public static void main(String[] args) {
        System.out.println("Enter an integer, the input ends if it is 0: ");
        Scanner in = new Scanner(System.in);

        int input;
        int num = 0;
        int pos = 0;
        int neg = 0;
        double total = 0;

        while ((input = in.nextInt()) != 0) {
            if (input > 0) {
                pos++;
                num++;

            }

            else if (input < 0) {
                neg++;
                num++;

            }

            total += input;

            if (input == 0) {
                break;

            }
        }

        double average = total / num;

        if (num > 0) {
            System.out.println("The number of positives: " + pos);
            System.out.println("The number of negatives: " + neg);
            System.out.println("The total is: " + total);
            System.out.println("The average is: " + average);

        } 
        
        else {
            System.out.println("No numbers are entered except 0");
            
        }
    }
}