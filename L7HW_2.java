package HomeWork;

public class L7HW_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 4, -6, -8, 110, 52, 44, 126, 181, -20};
        double avg = 0;
        double sum = 0;
        double mod = 0;
        double min = 0;
        double cls = 0;


        for (int j : arr) {

            avg = (sum += j) / arr.length;
        }
        System.out.println("Среднее значение: " + avg);
        min = avg;
        for (int j : arr) {
            mod = Math.abs(avg - j);

            if (mod < min) {
                min = mod;
                cls = j;
            }


            }

        System.out.println("Ближайшее к среднему значению: " + cls);



    }
}