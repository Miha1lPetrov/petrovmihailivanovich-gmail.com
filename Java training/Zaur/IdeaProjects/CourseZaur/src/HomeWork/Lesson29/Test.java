package HomeWork.Lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mech");
        Animal a2 = new Lev("Leva");
        Animal a3 = new Pingvin("Pinya");

        Animal[] array1 = {a1 , a2 ,a3};
        for (Animal a : array1){
            if (a instanceof Mechenosec){
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.swim();
                m.eat();
                m.sleep();
            }
        }
        //и тд для других классов

    }




}
