package HomeWork.Lesson4;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double sredMath;
    double sredEco;
    double sredEng;

}

class StudentTest{

    static void sred(String s, double d1, double d2, double d3){ //Почему статик ОБЭМА без статик не работало
        double sred = (d1 + d2 + d3)/3;
        System.out.println("Средняя у " + s + " = " + sred);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

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

        System.out.println("Средняя у " + st1.name + " = " + ((st1.sredMath + st1.sredEco + st1.sredEng)/3));
        sred(st1.name, st1.sredMath, st1.sredEco, st1.sredEng);


    }



}
