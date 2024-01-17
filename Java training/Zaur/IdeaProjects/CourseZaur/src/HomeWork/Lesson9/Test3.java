package HomeWork.Lesson9;

public class Test3 {
    int a = 1;
    static int b = 2;
    void abc (int a){
        System.out.println(b);//статик перем
        System.out.println(a);//переменая параметра
        System.out.println(this.a);//перем поля
        System.out.println(Test3.b);//перем статик
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}
