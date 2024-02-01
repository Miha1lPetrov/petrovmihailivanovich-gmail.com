package day008;

public class Task1 {
    public static void main(String[] args) {
        String s = "";


        long before = System.currentTimeMillis(); //с помощью этого .currentTimeMillis() метода получаем текущее время в миллисекундах
                                                //кладем сначала ДО цикла и потом ПОСЛЕ
        for (int i = 0; i <= 20000; i++) {
            s += i + " ";                  //выдает предупреждение String concatenation '+=' in loop - о том что здесь конкатенация
            //System.out.print(i + " ");   //строк внутри цикла и это плозо тк класс String НЕ предназначен для множественного изменения строк
                                            //делаем через SB тк он изменяем а тут будет 20к НОВЫХ строк
        }

        long after = System.currentTimeMillis();
        //и отняв before от after мы и получим время выполнения данного цикла с конкатенацией
        System.out.println("Время выполнения цикла с классом String: " + (after-before) + " миллисекунд");
        //System.out.println(s);


        before = System.currentTimeMillis(); //без long просто просто перезапишем эту же перем

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        after = System.currentTimeMillis();
        System.out.println("Время выполнения цикла с классом SB: " + (after-before) + " миллисекунд");

        //System.out.println(sb.toString());


    }
}
