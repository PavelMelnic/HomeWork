package HomeWork;


import java.util.Scanner;

public class L7HW_4 {
    public static void main(String[] args) {

//      String inputString = "QA Automation";
//      int stringLength = inputString.length();
//      String result = "";
//
//                for (int i=0; i<stringLength; i++) {
//                    result = inputString.charAt(i) + result;
//                }
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово с клавиатуры и нажмите ENTER");
        String inputString = scanner.nextLine();
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString);
    }
}
