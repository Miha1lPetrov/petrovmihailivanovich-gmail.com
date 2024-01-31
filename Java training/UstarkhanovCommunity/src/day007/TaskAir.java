package day007;

public class TaskAir {

    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 2010, 40, 40000);
        Airplane airplane2 = new Airplane("Airbus", 2011, 40, 45000);

        airplane1.info();

        Airplane.compareAirplanes(airplane1, airplane2);

    }


}
