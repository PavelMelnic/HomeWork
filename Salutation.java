package HomeWork;

import java.util.Scanner;

public class Salutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your language:\n1. Русский\n2. Romana\n3. English\n4. Latinus");
        int select = input.nextInt();
        String salutation = "";
        switch (select) {
            case 1 -> salutation = "Привет!!!";
            case 2 -> salutation = "Salut!!!";
            case 3 -> salutation = "Hello!!!";
            case 4 -> salutation = "Salve!!!";
            default -> System.out.println("Error");
        }
        System.out.println(salutation);

    }
}
