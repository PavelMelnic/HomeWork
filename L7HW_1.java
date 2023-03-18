package HomeWork;

public class L7HW_1 {
    public static void main(String[] args) {
       float [] array =  new float[] {10.0F, 20.0F, 40.0F, 80.0F, 1.0F};

       for (int i = 0; i < array.length; i++) {

           array[i] = array[i]- array[i] * (25.0F / 100);

           if (array[i] < 1) {
               array[i] =  array[i] + (50.0F / 100) ;
           }

           System.out.println(array[i]);

       }



    }
}
