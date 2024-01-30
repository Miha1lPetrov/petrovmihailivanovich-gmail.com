package day006;

public class TaskAir {
    public static void main(String[] args) {

        Airplane a1 = new Airplane("S7 co.", 2005, 33.84, 34.3);
        a1.info();
        a1.setYear(2010);
        a1.setLength(40);
        a1.fillUp(50);
        a1.fillUp(70);
        a1.info();

    }



}
