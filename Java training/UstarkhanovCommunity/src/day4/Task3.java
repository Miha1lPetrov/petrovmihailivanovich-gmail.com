package day4;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)((Math.random()*50)+1);
            }
        }
        //для проверки
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //вывести индекс с макс суммой массива
        int [] max = new int[12];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count+= array[i][j];
            }
            max[i] = count;
            count = 0;
        }
        int m = Integer.MIN_VALUE;
        int m1 = 0;
        for (int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
            if (m<max[i]) {
                m = max[i];
                m1 = i;
            }
        }
        System.out.println(m);
        System.out.println(m1);

    }
}
