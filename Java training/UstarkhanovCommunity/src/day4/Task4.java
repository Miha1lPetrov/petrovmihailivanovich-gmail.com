package day4;

public class Task4 {
    public static void main(String[] args) {

        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random()*10000)+1);
        }

        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();

        int sum1 = 0;
        int index = 0;
        for (int i = 0; i < array.length-2; i++) {
            int sum2 = array[i] + array[i+1] + array[i+2];
            if (sum1 < sum2){
                sum1 = sum2;
                index = i;
            }
            sum2 = 0;
        }
        System.out.println(sum1 + " " + index);

    }
}
