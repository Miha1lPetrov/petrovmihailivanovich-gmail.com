package day006;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weigth;
    private int fuel;

    public Airplane(String producer, int year, double length, double weigth){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel = 0;
    }

    public int getFuel(){
        return fuel;
    }

    public int setYear(int year){
        return this.year = year;
    }
    public double setLength(double length){
        return this.length = length;
    }


    public void info(){
        System.out.println("Производитель: " + producer + "\n" +
                "Год выпуска: " + year + "\n" +
                "Длина: " + length + "\n" +
                "Вес: " + weigth + "\n" +
                "Количество топлива: " + getFuel() + "\n");
    }

    public void fillUp(int inputFuel){
            fuel+=inputFuel;
    }

}
