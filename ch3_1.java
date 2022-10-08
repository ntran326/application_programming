// Nhu Tran

import java.util.Scanner;

public class ch3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.sqrt((b * b) - (4 * a * c));

        if (discriminant > 0) {
            double equat_1 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            double equat_2 = (-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            System.out.println("The equation has two roots " + equat_1 + " and " + equat_2);
        } else if (discriminant == 0) {
            double equa_3 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            ;
            System.out.println("The equation has one root " + equa_3);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

}
