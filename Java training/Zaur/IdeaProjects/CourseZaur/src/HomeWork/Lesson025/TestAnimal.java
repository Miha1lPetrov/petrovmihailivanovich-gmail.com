package HomeWork.Lesson025;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d1 = new Dog("Uf-uf");//Вызвались конструкторы 1)Animal 2)Pet 3)Dog
        d1.play();//Метод класса Dog
        System.out.println(d1.paw);//поле класса pet
        System.out.println(d1.eyes);//поле класса Animal инициализированное в конструкторе Pet
        System.out.println(d1.tail);//поле класса Pet
        d1.run();//метод класса Pet
        d1.jump();//метод класса Pet
        d1.drink();//метод класса Animal
        d1.eat();//метод класса Animal
        System.out.println();

        Cat c1 = new Cat("Murzik");
        c1.sleep();
    }
}
