package HomeWork.Lesson12;
import HomeWork.Lesson11.StudentForLesson12;
public class StudentTest {

    static void comparisonStudent1(StudentForLesson12 st1, StudentForLesson12 st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Студенты равны");
        }else {
            System.out.println("Студенты не равны");
        }
    }

    static void comparisonStudent2(StudentForLesson12 st1, StudentForLesson12 st2){
        if (st1.name.equals(st2.name)){
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("Студенты полностью равны");
                }else {
                    System.out.println("У студентов одинаковые имена и курс, НО разные оценки");
                }
            }else if(st1.grade == st2.grade){
                System.out.println("У студентов одинаковые имена и оценки, НО разные курсы");
            }else{
                System.out.println("у студентов одинаковые только имена");
            }
        } else if (st1.course == st2.course) {
            if (st1.grade == st2.grade){
                System.out.println("У студентов одинаковые курс и оценки, НО разные имена");
            }else {
                System.out.println("У студентов одинаковые ТОЛЬКО курсы");
            }
        } else if (st1.grade == st2.grade) {
            System.out.println("У студентов одинаковые ТОЛЬКО оценки");
        }else{
            System.out.println("Студенты НЕ равны");
        }
    }

    public static void main(String[] args) {
        //Полностью равные студенты
//        StudentForLesson12 st1 = new StudentForLesson12("Вова", 4, 5);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые только имя и курс
//        StudentForLesson12 st1 = new StudentForLesson12("Вова", 4, 3);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые ТОЛЬКО имя
//        StudentForLesson12 st1 = new StudentForLesson12("Вова", 3, 3);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые курсы и оценки , но разные имена
//        StudentForLesson12 st1 = new StudentForLesson12("Вова1", 4, 5);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые только курсы
//        StudentForLesson12 st1 = new StudentForLesson12("Вова1", 4, 3);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые только оценки
//        StudentForLesson12 st1 = new StudentForLesson12("Вова1", 1, 5);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //Одинаковые имена и оценки
//        StudentForLesson12 st1 = new StudentForLesson12("Вова", 3, 5);
//        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
//        comparisonStudent1(st1, st2);
//        comparisonStudent2(st1, st2);

        //студенты не равны
        StudentForLesson12 st1 = new StudentForLesson12("Вова1", 3, 3);
        StudentForLesson12 st2 = new StudentForLesson12("Вова", 4, 5);
        comparisonStudent1(st1, st2);
        comparisonStudent2(st1, st2);


    }

}
