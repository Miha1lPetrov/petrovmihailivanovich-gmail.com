package HomeWork.Lesson8;

public class StaticFinal {
    static final double PI = 3.14;

    double ploshadKruga(int r){
        return PI * r* r;
    }

    static double dlinaOkr(int r){
        return 2 * PI * r;
    }

    void infoShow(int r){
        System.out.println("radius " + r);
        System.out.println("ploshad kruga = " + ploshadKruga(r));
        System.out.println("dliba okr = " + dlinaOkr(r));
    }
}

class Test2 {
    public static void main(String[] args) {
        //Вызываем без создания объекта класса StaticFinal
        System.out.println(StaticFinal.PI); //тк пи статичный вызываем через класс
        System.out.println(StaticFinal.dlinaOkr(10));//можем вызвать тк статичный метод
        //все больше вызвать без объекта ничего не можем

        StaticFinal sf = new StaticFinal();
        System.out.println(sf.ploshadKruga(10));
        System.out.println(sf.dlinaOkr(10)); //даже ide не выдает данный метод тк лучше так не делать а только через класс! Писал ручками
        sf.infoShow(10);



    }


}
