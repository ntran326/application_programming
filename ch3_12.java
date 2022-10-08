// Nhu Tran

import java.util.Scanner;

public class ch3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

    
        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        if (digit1 == digit3){
            System.out.println(number + " is Palindrome");

        }
        else {
            System.out.println(number + " is not Palindrome");

        }
    }
}
