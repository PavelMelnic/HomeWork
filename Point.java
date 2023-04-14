package HomeWork;

public class Point {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        int spaces = 0;
        System.out.println("Введите с клавиатуры символы с пробелами.");
        do {
            ch = (char) System.in.read();
            if(ch == ' ' ) spaces++;
        } while (ch !=  '.');
        System.out.println("Spaces: " + spaces);
    }
}