// Nhu Tran

import java.util.Scanner;

public class ch2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int less10 = num % 10;
        num /= 10;
        int tens = num % 10;
        num /= 10;
        int hundreds = num % 10;
        num /= 10;
        int sum = less10 + tens + hundreds;

        System.out.println("The sum of the digit is " + sum);
        
    }
}
