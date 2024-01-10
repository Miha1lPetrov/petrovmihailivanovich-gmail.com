package HomeWork.Lesson6;

public class StudentConstructor {

    int id;
    String name;
    String surname;
    int course;
    double sredMath;
    double sredEco;
    double sredEng;

    StudentConstructor(int id, String name, String surname, int course, double sredMath, double sredEco, double sredEng){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.sredMath = sredMath;
        this.sredEco = sredEco;
        this.sredEng = sredEng;
    }

    StudentConstructor(int id, String name, String surname, int course){
        this(id, name, surname, course, 0.0,0.0,0.0); //тут через this вызвали КОНСТУКРТОР
    }
    StudentConstructor(){}

}

class StudentTest{
    public static void main(String[] args) {
        StudentConstructor sc1 = new StudentConstructor(1, "Dodyanus", "Dodyanovich", 4, 3.5,2.9,1.3);
        StudentConstructor sc2 = new StudentConstructor(2,"Dimon", "Dimonovich", 2); // создали обьект с данными которые нужны на этом старте допустим
        StudentConstructor sc3 = new StudentConstructor();

    }

}
