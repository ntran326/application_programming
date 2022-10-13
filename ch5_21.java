// Nhu Tran

import java.util.Scanner;

public class ch5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loan = input.nextDouble();

        System.out.print("Enter numbers of years: ");
        int years = input.nextInt();

        double annualInt = 5.0;

        System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        while (annualInt <= 8.0) {
            double monthlyInt = annualInt / 1200;
            double monthlyPay = loan * monthlyInt / (1 - 1 / Math.pow(1 + monthlyInt, years * 12));
            double totalPay = monthlyPay * years * 12;

            System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInt, monthlyPay, totalPay);

            annualInt = annualInt + 1.0 / 8;
        }
    }
}
