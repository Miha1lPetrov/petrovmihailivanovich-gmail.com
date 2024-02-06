package HomeWork.Lesson27;

abstract class Mammal extends Animal implements Speak_able{
    Mammal(String name){
        super(name);
    }

    abstract void run();
    public void method2(){
        System.out.println("method2 который абстрактный у интерфейса перезаписал в Mammal");
    }
}
