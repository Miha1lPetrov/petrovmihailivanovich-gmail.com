package HomeWork.Lesson29;

abstract class Bird extends Animal implements Speak_able {

    Bird(String name){
        super(name);
    }
    abstract void fly();

    public void speak(){
        System.out.println(name + " sings");
    }
    public void method2(){
        System.out.println("method2 который абстрактный у интерфейса перезаписал в Bird");
    }

}
