package day4;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random()*10000)+1);
        }

        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println();

        //а) наибольший элемент
        int max = Integer.MIN_VALUE;
        for (int x : array){
            if (x > max){
                max = x;
            }
        }
        System.out.println("максимальный элемент: " + max);

        //б) минимальный элемент
        int min = Integer.MAX_VALUE;
        for (int x : array){
            if (x < min){
                min = x;
            }
        }
        System.out.println("минимальный элемент: " + min);

        //в) кол-во элементов оканчивающихся на 0 + сумма этих элементов
        int count = 0;
        int count2 = 0;
        for (int x : array){
            String s = Integer.toString(x);
            String s1 = s.substring(s.length()-1);
            if (s1.equals("0")){
                count++;
                count2+=x;
            }
        }
        //Сделал интереснее через стринг , но можно было просто взять остаток от деления на 10
        int counetr = 0;
        for (int element : array){
            if (element % 10 == 0){
                counetr++;
            }
        }
        System.out.println("элементы на ноль через остаток от деления: " + counetr);
        System.out.println("Элементов оканчивающихся на ноль: " + count);
        System.out.println("Сумма элементов заканчивающихся на ноль: " + count2);




    }
}
