package HomeWork;

import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {

        for (; ; ) {
            double num;
            Scanner n = new Scanner(System.in);
            System.out.print("\nEnter integer number: ");
            num = n.nextDouble();

            if ((num % 2) == 0) {
                System.out.print("Number " + num + " is EVEN");
            } else {
                System.out.print("Number " + num + " is ODD");
            }


            System.out.println();
        }
    }
}