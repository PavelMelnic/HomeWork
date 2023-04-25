package HomeWork;

public class L7HW_2 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 10)-3);
            System.out.println(arr[i]);
        }

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