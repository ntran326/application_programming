// Nhu Tran

import java.util.Scanner;

public class ch3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number scissor(0), rock(1) or paper(2): ");
        int num = input.nextInt();

        int comp = (int) (Math.random() * 3);

        System.out.print("The computer is ");
        switch (comp) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");

        }

        System.out.print(" You are "); 
        switch (num) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");

        }

        if (num == comp) {
            System.out.println(" It is a draw!");

        } 
        
        else {
            boolean win = (num == 1 && comp == 0) ||
                    (num == 0 && comp == 2) ||
                    (num == 2 && comp == 1);

            if (win) {
                System.out.print(" You won!");

            } 
            else {
                System.out.print(" You lost!");

            }

        }

    }

}
