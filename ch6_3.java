// Nhu Tran

import java.util.Scanner;

public class ch6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer to reverse: ");
        int number = input.nextInt();

        System.out.printf("%d reversed is %d%n", number, reverse(number));
        System.out.printf("%d is %s palindrone%n", number, isPalindrone(number) ? "a" : "not a");
    }

    public static int reverse(int number) {
        String reversedNum = "";

        while(number != 0) {
            reversedNum += number % 10;
            number = number / 10;
        }

        return Integer.parseInt(reversedNum);
    }

    public static boolean isPalindrone(int number) {
        if (number == reverse(number))
            return true;

        return false;
    }
}
