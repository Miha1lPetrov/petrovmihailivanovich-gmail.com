package HomeWork.Lesson025;

public class Pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;
    public Pet(){
        System.out.println("I am Pet");
        eyes = 2;//инициализирует переменную с класса Animal
    }

    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }


}
