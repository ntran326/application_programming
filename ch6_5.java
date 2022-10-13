// Nhu Tran

import java.util.Scanner;

public class ch6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

		
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		displaySortedNumbers(number1, number2, number3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double count; 
		
		if (num2 < num1 && num2 < num3){
			count = num1;
			num1 = num2;
			num2 = count;
		}

		else if (num3 < num1 && num3 < num2) {
			count = num1; 
			num1 = num3;
			num3 = count;
		}

		if (num3 < num2) {
			count = num2;
			num2 = num3;
			num3 = count;
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
