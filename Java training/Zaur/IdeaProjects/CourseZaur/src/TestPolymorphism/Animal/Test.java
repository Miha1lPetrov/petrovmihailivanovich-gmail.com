package TestPolymorphism.Animal;

public class Test {
    public static void main(String[] args) {

        Mouse m1 = new Mouse();
        m1.showInfoAboutMouse();
        //System.out.println(Mouse.showName()); //тут был объект мышь класса мышь
        m1.showInfoAboutAnimal(); //тк метод статичный он НЕ ПЕРЕЗАПИСЫВАЕТСЯ и с класса Mouse он его не возьмет ( метод отгосится к Animal)

        Animal a1 = new Mouse();
        //a1.showInfoMouse();//Нельзя вызвать тк в классе Animal НЕТ такого метода
        a1.showInfoAboutAnimal(); //тк метод статичный он НЕ ПЕРЕЗАПИСЫВАЕТСЯ и с класса Mouse он его не возьмет ( метод отгосится к Animal)

        Animal a2 = new Cat();//Тип переменной от Animal ссылается на объект Cat
        a2.showInfoAboutAnimal();//Cat наследует перезаписанный метод showName от мыши

        Mouse m2 = new Cat();
        //m2 будет наследовать и от mouse и от Animal


    }
}
