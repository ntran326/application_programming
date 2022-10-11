import java.util.Scanner;

public class ch4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        int remainder;

        if (decimal >= 0 && decimal <= 9) {
            System.out.println("The hex value is " + decimal);
        }

        else if (decimal >= 10 && decimal <= 15) {
            remainder = decimal % 16;

            if (remainder == 10) {
                System.out.print("The hex value is A");

            }

            else if (remainder == 11) {
                System.out.print("The hex value is B");

            }

            else if (remainder == 12) {
                System.out.print("The hex value is C");

            }

            else if (remainder == 13) {
                System.out.print("The hex value is D");

            }

            else if (remainder == 14) {
                System.out.print("The hex value is E");

            }

            else if (remainder == 15) {
                System.out.print("The hex value is F");

            }

        }

        else {
            System.out.println(decimal + " is an nvalid input");
            
        }
    }
}