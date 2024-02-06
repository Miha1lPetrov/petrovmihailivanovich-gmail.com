package Lesson1;

public class Human {
    String name;
    public Human(String name){
        this.name = name;
        System.out.println("human " + name);
    }

}

class Student extends Human{
    public Student(String name){
        super(name);
        System.out.println("Student " + name);
    }

    public static void main(String[] args) {
        Student st1 = new Student("VovaSt");
        Human h1 = new Human("vovaHuman");
        System.out.println();
        Human h2 = new Student("HumSt");
    }


}