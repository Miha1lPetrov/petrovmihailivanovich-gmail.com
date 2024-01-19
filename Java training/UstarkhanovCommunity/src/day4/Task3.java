package day4;

import java.util.Arrays;

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
        //так же можно вывести строковое представление массива через метод .deepToString() класса Arrays
        System.out.println(Arrays.deepToString(array));


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
            System.out.println(max[i]);//вывел для проверки условия
            if (m<max[i]) {
                m = max[i];
                m1 = i;
            }
        }
        System.out.println(m);
        System.out.println(m1);

        /* Можно было сделать проще бежать черех вложенные циклы пример*/
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;//сразу обнуляем при следующем переходе на строку
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; //Сначала я суммирую и далее смотрю по условию
            }
            if (maxSum <= sum){ //не строгое неравенство если строки по сумме будут одинаковы но вывести надо последнюю строку
                maxSum = sum;
                maxIndex = i;
            } //вот и все
        }
        System.out.println(maxSum);
        System.out.println(maxIndex);

    }
}
