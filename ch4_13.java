// Nhu Tran

import java.util.Scanner;

public class ch4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.charAt(0);

        if (Character.isLetter(ch)) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(ch + " is a vowel");
                    break;
                default:
                    System.out.print(ch + " is a consonant");
            }
        }

        else {
            System.out.print(ch + " is an invalid input");
        }
    }
}
