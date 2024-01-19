package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10)+1; //записываем в каждую ячейку рандомное ЦЕЛОЕ число от 0 до 10
        }

        for (int x: array){
            System.out.print(x+" ");
        }
        System.out.println();
        //выввести строковый массив можно и через метод .toString() класса Arrays пример ниже
        System.out.println(Arrays.toString(array));

        //Общий цикл для всех задач
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>8){
                count++;
            }
            if (array[i]==1) {
                count2++;
            }
            if (array[i]%2==0) {
                count3++;
            }else {
                count4++;
            }
            sum+=array[i];
        }

        //а) Длина массива
        System.out.println("Длина массива " + array.length);

        //б) кол-во чисел больше 8
        System.out.println("Количество чисел больше 8: " + count);

        //в) кол-во числе равных 1
        System.out.println("Количество чисел равных 1: " + count2);

        //г) количество четных чисел
        System.out.println("Количество четных чисел: " + count3);

        //д)количество нечетных чисел
        System.out.println("Кол-во нечетных чисел: " + count4);

        //е) сумма чисел
        System.out.println(sum);
    }



}
