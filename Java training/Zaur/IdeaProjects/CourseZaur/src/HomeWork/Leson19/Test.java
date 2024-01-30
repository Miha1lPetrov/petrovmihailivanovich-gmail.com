package HomeWork.Leson19;

public class Test {

    //пример как работает varargs те аргументы кол-во которых совершенно разное ( можно даписать Стринг и тд но varargs обязательно полсдений)
    static void sum(String s, int ... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(s);
    }

    public static void main(String[] args) {

        Test.sum("Hola",5,5,5);

        //Далее про цикл foreach
        int [] array = {0, 5, 2, 10};
        int [][] array2 = {{0,5,12},{7},{34,21,22}};
        //foreach может просто выводить на экран элементы он не может менять элемент массива ( for классический может)
        //тк внутри for мы работали конкретно  с самим элементом а не с переменной как в foreach

        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        //двумерный массив
        for (int[] a1 : array2){
            for (int a2 : a1){
                System.out.print(a2 + " ");
            }
        }
    }

}
