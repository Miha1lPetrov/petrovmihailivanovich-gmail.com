package TestPolymorphism;

public class X {
    public X(){
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X " + i );
    }

    public static void main(String[] args) {
        X x = new Y(18);
    }

}
class Y extends X{
//    public Y(int i){ //В данном примере конструктор обращается к суперкласс ( конструктору супер класса)
//        System.out.println("Y");//БЕЗ ПАРАМЕТРОВ! тк не указали точно
//    }

    public Y(int i){ //тут уже через super ТОЧНО указали какой констукртор вызывать у родительского класса!
        super(i);
        System.out.println("Y");
    }
}
