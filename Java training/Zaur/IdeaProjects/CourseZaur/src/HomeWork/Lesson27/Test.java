package HomeWork.Lesson27;

public class Test {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Mech");//Создали обьект класса Mechenosec
        System.out.println(mech.getName());
        mech.swim();
        mech.eat();
        mech.sleep();
        System.out.println();

        Speak_able pinya = new Pingvin("Pinya");
        //создали объект класса Pingvin, на этот объект ссылается переменная-pinya типа интерфейс-Speak_able
        //и ТОЛЬКО МЕТОДЫ ИНТЕРФЕЙСА ОН ВИДИТ ( либо перезаписанные в родительском или саб-класса)
        pinya.speak();
        Speak_able.method();//Сатичный метод у интерфейс обращение только через имя интерфейса
        //Все ссылаясь интерфейсом на объект пингвин больше ничего вывести не можем
        pinya.method2();//перезаписанный метод в родителе Bird (в интерфейсе он абстрактный - пустой)
        System.out.println();

        Animal lev = new Lev("levushka");
        //создали объект класса Lev, на этот объект ссылается переменная-lev типа Animal
        //он видит методы и поля ТОЛЬКО класса Animal (в приоритете ПЕРЕЗАПИСАННЫЕ В КЛАССЕ Lev)
        //Метод run он не видит тк это отдельный специфический метод принадлежит только классу Lev
        lev.eat();
        lev.sleep();
        System.out.println();

        Mammal lev_mammal = new Lev("LevMammal");
        //создали объект класса Lev, на этот объект ссылается переменная-lev-mammal типа Mammal
        //он видит методы:
        //1)Класса mammal (в приоритете перезаписанные для класса Lev)
        //2)Класса animal (в приоритете перезаписанные для класса Lev, потом по иерархии Mammal)
        //3)интерфейсы которые mammal имплементит (если методы в интерфейсе default то только те методы которые перезаписаны)
        lev_mammal.eat();
        lev_mammal.sleep();
        lev_mammal.run();
        lev_mammal.method2();//перезаписанный метод в родителе Mammal
        lev_mammal.speak();// не перезаписанный дефолтный метод интерфейса который имплементит класс mammal

        //Абстрактные классы НЕ имеют объектов
        //Animal a = new Animal();
        //Mammal m = new Mammal();
        //так же Fish и Bird

    }




}
