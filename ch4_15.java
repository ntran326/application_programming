// Nhu Tran

import java.util.Scanner;

public class ch4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.next();

        char ch = letter.charAt(0);
        ch = Character.toLowerCase(ch);

        int num = 0;
        if (Character.isLetter(ch)) {
			if (ch >= 'w')
				num = 9;
			else if (ch >= 't')
				num = 8;
			else if (ch >= 'p')
				num = 7;
			else if (ch >= 'm')
				num = 6;
			else if (ch >= 'j')
				num = 5;
			else if (ch >= 'g')
				num = 4;
			else if (ch >= 'd')
				num = 3;
			else if (ch >= 'a')
				num = 2;
			System.out.println("The corresponding number is " + num);

		}

		else
			System.out.println(ch + " is an invalid input");
            
	}
}