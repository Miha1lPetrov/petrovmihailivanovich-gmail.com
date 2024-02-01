package HomeWork.Lesson025;

public class Dog extends Pet{

    public Dog(String name){
        this.name = name;//инициализируем переменную класса Pet
        System.out.println("I am dog my name is " + name);
    }

    public void play(){
        System.out.println("Dog plays");
    }

}
