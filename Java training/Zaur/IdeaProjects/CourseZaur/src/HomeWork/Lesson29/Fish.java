package HomeWork.Lesson29;

abstract class Fish extends Animal {
    Fish(String name){
        super(name);
    }

    void sleep(){ //перезаписали абстрактный метод ( но тк наш класс Fish abstract то могли и не перезаписывать как метод eat()
        System.out.println("всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}
