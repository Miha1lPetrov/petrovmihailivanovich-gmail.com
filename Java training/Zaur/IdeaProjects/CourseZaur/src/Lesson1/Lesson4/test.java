package Lesson1.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Animal a1 = new Animal(12);
        Dog d1 = new Dog(21);
        Animal an = new Dog(31);
        test(a1);
        test(d1);
        test(an);

        List <Animal> animals = new ArrayList<>();//АЛ состоящий из элементов типа Animal
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        test2(animals);

        List <Dog> dogs = new ArrayList<>();//АЛ состоящий из элементов типа Dog
        dogs.add(new Dog(3));
        dogs.add(new Dog(4));
        test2(dogs);


    }

    private static void test2(List<? extends Animal> list){ //тут работает wildcard "?" и добавляем extends Animal..
        for (Animal a : list){                              //и тдаем понять что мы можем подставить в этот метод
            System.out.println(a);             //только тот лист элементы которого либо Animal либо любой другой наследник
        }
    }
    public static void test(Animal a){
        a.eat();
    } //тест с полиморфизмом для обьектов a1, d1, an ( метод eat перезапиан в Dog)

}
