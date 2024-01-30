package day006;

public class TaskCarMoto {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.info();
        Motorbike m1 = new Motorbike(2010, "Белый","кавасаки");
        m1.info();
        Motorbike.yearDifference(m1);
    }

}
