package HomeWork.Lesson025;

public class Cat extends Pet{
    public Cat(String name){
        this.name = name;
        System.out.println("i am cat and my name is " + name);
    }
    public void sleep(){
        System.out.println("cat sleeps");
    }


}
