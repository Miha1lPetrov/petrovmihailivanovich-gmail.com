package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Стоп цифра - 0 ноль");

        while (!flag){
            System.out.println("Введите 2 числа делимое и делитель");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a == 0 || b == 0){
                System.out.println("ввели стоп слово (0) делить на ноль нельзя, прорамма завершается");
                flag = true;
            }else{
                System.out.println("Результат деления a на b равен: " + (a/b));
            }
        }
    }
}
