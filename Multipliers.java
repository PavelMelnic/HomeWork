package HomeWork;

import java.util.Scanner;

public class Multipliers {
    public static void main(String[] args)
            throws java.io.IOException{

        int num;

        Scanner n = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        num = n.nextInt();
        System.out.print("Number divisors " + num + ": ");

        for (int j = 2; j < num; j++)
            if((num % j) == 0) System.out.print(j + " ");
        System.out.println();


    }
}