package HomeWork.Lesson11;

import java.util.Arrays;

public class Car {

    String color;
    String engine;
    int numDoor;

    Car(String color, String engine, int numDoor){
        this.color = color;
        this.engine = engine;
        this.numDoor = numDoor;
    }

}

class carTest{

    static void changeDoor(Car c, int door){
        c.numDoor= door;
    }

    static void changecolor(Car c1, Car c2){
        String c = c1.color;
        c1.color = c2.color;
        c2.color = c;
    }

    public static void main(String[] args) {

        Car c1 = new Car("red", "V6", 4);
        Car c2 = new Car("black", "V8", 2);

        System.out.println("Цвет + кол-во дверей машины 1: " + c1.color + " " + c1.numDoor);
        System.out.println("Цвет + кол-во дверей машины 2: " + c2.color + " " + c2.numDoor);
        System.out.println();

        //Используем статичный метод для замены дверей
        changeDoor(c1, 6);
        System.out.println("поменяли колво дверей машины 1: "  + c1.numDoor);
        changeDoor(c2, 10);
        System.out.println("поменяли колво дверей машины 2: "  + c2.numDoor);
        System.out.println();
        //Использую метод по замене цвета машин друг у друга

        changecolor(c1, c2);
        System.out.println("Поменяли цвет у машин местами, машина 1 был red стал : " + c1.color);
        System.out.println("Поменяли цвет у машин местами, машина 2 был black стал: " + c2.color);



    }

}
