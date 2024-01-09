package HomeWork.Lesson5;



public class StudentMethod {
    int id;
    String name;
    String surname;
    int year;
    double sredMath;
    double sredEco;
    double sredEng;

    double sredArif(StudentMethod s1){
        double res = (s1.sredEco + s1.sredEng + s1.sredMath)/3;
        System.out.println("Средняя оценка у " + s1.name + " равна " + res);
        return res;
    }

}
class StudentTest{

    static void sred(String s, double d1, double d2, double d3){ //Почему статик ОБЭМА без статик не работало
        double sred = (d1 + d2 + d3)/3;
        System.out.println("Средняя у " + s + " = " + sred);
    }

//    double sredArif(StudentMethod s1){
//        double res = (s1.sredEco + s1.sredEng + s1.sredMath)/3;
//        System.out.println("Средняя оценка у " + s1.name + " равна " + res);
//        return res;
//    }

    public static void main(String[] args) {
        StudentMethod st1 = new StudentMethod();
        StudentMethod st2 = new StudentMethod();
        StudentMethod st3 = new StudentMethod();

        st1.name = "Sanya";
        st1.sredMath = 4.5;
        st1.sredEco = 3.2;
        st1.sredEng = 3.9;

        st2.name = "Jora";
        st2.sredMath = 2.5;
        st2.sredEco = 4.2;
        st2.sredEng = 5.9;

        st3.name = "Dodyanus";
        st3.sredMath = 1.5;
        st3.sredEco = 2.2;
        st3.sredEng = 1.9;

//        System.out.println("Средняя у " + st1.name + " = " + ((st1.sredMath + st1.sredEco + st1.sredEng)/3));
//        sred(st1.name, st1.sredMath, st1.sredEco, st1.sredEng);

//        StudentTest st = new StudentTest(); Это если бы создали метод внутри класса StudentTest
//        double a = st.sredArif(st1);
//        System.out.println(a);

        //Если метод создан в классе StudentMethod но походу лучше так не делать тк через один обьекты мы вызываем другой
        st1.sredArif(st3);
        double a = st1.sredArif(st2);
        System.out.println(a);
    }
}
