package HomeWork;

class NumberFormatException{}
public class L7HW_3 {
    public static void main(String[] args) {

        String longestWord[] = {"Show", "must", "goooooo", "on!"};
        int l=0;
        String word = null;

        for (String s : longestWord)
            System.out.print(s + " ");
        System.out.println("\n");

         for (int i = 0; i < longestWord.length; i++){

             if (longestWord[i].length() > l) {
                 l = longestWord[i].length();
                 word = longestWord[i];
             }
         }
        System.out.println("Самое длинное слово в предложении: " +
                word);
    }
}

