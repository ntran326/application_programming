// Nhu Tran

import java.util.Scanner;

public class ch5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();

		int index = 0;
		String prefix = "";		

		while (s1.charAt(index) == s2.charAt(index)) {
			prefix += s1.charAt(index);
			index++;
		}


		if (prefix.length() > 0)
			System.out.println("The commmon prefix is " + prefix);

		else
			System.out.println(s1 + " and " + s2 +
				" have no commmon prefix");
    }
}
