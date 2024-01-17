package HomeWork.Lesson9;

public class Test2 {
    int a = 1;
    static int b = 2;
    static void abc(final int a){
        System.out.println(a);//константная переменная параметра
        System.out.println(Test2.b);//стиатичная перем b
        //a = 10;//видим что она константа
    }

    public static void main(String[] args) {
        abc(5);

    }
}
