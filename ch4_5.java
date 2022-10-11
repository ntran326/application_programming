import java.util.Scanner;

import java.util.Scanner;

public class ch4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        int numSides = input.nextInt();

        System.out.println("Enter the sides: ");
        double side = input.nextDouble();


        double area = (numSides * Math.pow(side, 2)) /(4 * Math.tan(Math.PI/numSides));

        System.out.println("The area of the polygon is "+ area);
        
    }
}
