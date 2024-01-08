package day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        //Задарние 1
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if (i <= 0){
//            System.out.println("Ошибка ввода");
//        } else if (i <= 4) {
//            System.out.println("Малоэтажный дом");
//        } else if (i <= 8) {
//            System.out.println("Среднеэтажный дом");
//        } else {
//            System.out.println("Многоэтажный дом");
//        }

        //Задание 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a < b){
//            for (int i = a +1; i < b ; i++) {
//                if (i % 5 == 0 && i % 10 != 0){
//                    System.out.print(i + " ");
//                }
//            }
//        }else{
//            System.out.println();
//        }

        //Задание 3 тоэе что и выше но с цилом while
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a < b){
//            int i = a;
//            while (i < b){
//                i++;
//                if (i % 5 == 0 && i % 10 != 0){
//                    System.out.print(i + " ");
//                }
//
//            }
//        }else{
//            System.out.println();
//        }

        //Задание 4
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        if (d < -3) {
            System.out.println(420);
        } else if (d < 5) {
            double res = (d + 3) * (Math.pow(d, 2) - 2);
            System.out.println(res);
        } else {
            double res = (Math.pow(d, 2) - 10) / (d + 7);
            System.out.println(res);
        }
    }
}
