package HomeWork;

import java.util.Scanner;

public class L7HW_5 {
    public static void main(String[] args) {


        System.out.println("Введите текст с клавиатуры: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String[] words = inputText.split(" ");

        for (String subStr:words) {

            String text = subStr;
            StringBuffer buffer = new StringBuffer(text);
            buffer.reverse();
            String data = buffer.toString();
            if (text.equals(data)) {
                System.out.println("Палиндром: " + text);
            }
        }
    }
}
