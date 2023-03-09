package HomeWork;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число:");
        String x = num.nextDouble()%2==0 ? "Четное" : "Не четное";
        System.out.println(x);
    }
}
