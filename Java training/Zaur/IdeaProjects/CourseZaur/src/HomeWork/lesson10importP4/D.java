package HomeWork.lesson10importP4;

import HomeWork.Lesson10p1.A;
import HomeWork.Lesson10p1.p2.B;
import HomeWork.Lesson10p1.p2.p3.C;
import HomeWork.lesson10importP4.p5.E;
public class D {
    public static void main(String[] args) {
        A a = new A();
        //a.infoA(); //Метод не сработал тк метод НЕ public

        B b = new B();
//        System.out.println(b.i);
//        b.infoB(); //Это статичные методы и перем класс B но они не public
        /*Сделал метод класс В public и тк он СТАТИЧНЫЙ вызываем через имя класса*/
        B.infoB();
        //System.out.println(B.i); //переменная i класса В не публичная ее не вызвать

        C c = new C();
        //C.infoC(); //так же статичный метод НО он не public по этому не выдаст

        E e = new E();
        /*Класс Е это подпакет класса D но не один и тот же пакет по этому default доступ не сработает*/
        System.out.println(E.I); //поменял константу на модификатор public
        E.infoE();
    }

}
