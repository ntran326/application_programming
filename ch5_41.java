// Nhu Tran

import java.util.Scanner;

public class ch5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


		System.out.print("Enter numbers: ");
		int num = input.nextInt();
        int max = 0;
		int count = 1;	


		while(num != 0){
            if(num > max){
                count = 1;
                max = num;
            }

            else if (max == num)
                count++;
                num = input.nextInt();
        }

            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
    }
}
