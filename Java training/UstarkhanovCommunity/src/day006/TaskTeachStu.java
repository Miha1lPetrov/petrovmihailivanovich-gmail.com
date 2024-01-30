package day006;

public class TaskTeachStu {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Svetlana", "Math");
        Student st1 = new Student("Bob");
        Teacher t2 = new Teacher("Zina", "English");

        t1.evaluate(st1);
        t2.evaluate(st1);


    }


}
