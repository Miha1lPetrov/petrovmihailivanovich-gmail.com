package day009;

public class Task1 {
    public static void main(String[] args) {
        Student st1 = new Student("Cat", "StudentPetya");
        Teacher t1 = new Teacher("Math", "TeacherVasya");
        System.out.println("Название группы студента " + st1.getTitleGroup());
        System.out.println("Название предмета у учителя который он ведет " + t1.getNameLesson());

        st1.printInfo();
        t1.printInfo();
    }
}
