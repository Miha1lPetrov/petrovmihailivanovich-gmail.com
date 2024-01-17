package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag){
            String s = sc.nextLine();
            if (s.equals("stop")){
                System.out.println("Остановка программы");
                flag = true;
            }else {
                switch (s){
                    case "Москва", "Владивосток", "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим", "Милан", "Турин":
                        System.out.println("Италия");
                        break;
                    default:
                        System.out.println("неизвстная страна");
                        break;
                }
            }
        }



    }
}
