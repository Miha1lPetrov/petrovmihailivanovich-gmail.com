package HomeWork.Lesson025;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name); //если возвращаемое значение изменяемый как SB то лучше возвращать копию!
        return sb;//вернули копию          //чтобы через метод get мы не могли поменять его значения методом .append()допустим
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() < 3){
            System.out.println("Имя не должно быть меньше 3ех символов");
        }else{
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4){
            this.course = course;
        }else {
            System.out.println("Курс может быть с 1го по 4ый");
        }

    }

    public void setGrade(int grade) {
        if (grade >=1 && grade <= 10){
            this.grade = grade;
        }else{
            System.out.println("Оценка должна быть от 1 до 10");
        }
    }

    public static void info(Student st){
        System.out.println("Студент по имени: " + st.getName() + "\n" +
                "Учится на " + st.getCourse() + " курсе" + "\n" +
                "Его оценка: " + st.getGrade());
    }

}
