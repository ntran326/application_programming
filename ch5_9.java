// Nhu Tran

import java.util.Scanner;

public class ch5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers of student: ");
        int num = input.nextInt();
        int scoreHighest1 = 0;
        int scoreHighest2 = 0;
        String name1 = "";
        String name2 = "";

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a student name: ");
            String name = input.next();

            System.out.println("Enter a student score: ");
            int score = input.nextInt();

            if (score > scoreHighest1) {
                scoreHighest2 = scoreHighest1;
                name2 = name1;
                scoreHighest1 = score;
                name1 = name;

            }

            else if (score > scoreHighest2) {
                scoreHighest2 = score;
                name2 = name;

            }
        }

        System.out.println("The student with the highest score is " + 
            name1 + " with a score of " + scoreHighest1);
        System.out.println("The student with the second highest score is " + 
            name2 + " with a score of " + scoreHighest2);

    }
}
