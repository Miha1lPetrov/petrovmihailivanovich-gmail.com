package TestPolymorphism;

public class Test {
    public static void main(String[] args) {

        A c1 = new C();
        c1.abc(new B()); //Выведет "А" тк в классе А метод abc НЕ ПЕРЕЗАПИСАЛИ
        //Если в классе А метод будет "void abc(B b);" о выведет "С" тк все 3 метода были бы перезаписаны

    }
}
