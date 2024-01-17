package day3;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 5){
            count++;
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a == 0 || b == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
        System.out.println("Завершили программу");


    }
}
