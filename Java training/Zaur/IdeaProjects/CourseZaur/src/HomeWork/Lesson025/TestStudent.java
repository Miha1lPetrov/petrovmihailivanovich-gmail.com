package HomeWork.Lesson025;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Vasya"));
        st1.setCourse(1);
        st1.setGrade(5);
        Student.info(st1);
        st1.getName().append("KUKU");//не изменит им тк в самом методе мы вызываем копию и у этой копии выводим имя
        System.out.println(st1.getName());

        Student st2 = new Student();
        st2.setName(new StringBuilder("Bo"));
        st2.setCourse(5);
        st2.setGrade(0);



    }


}
