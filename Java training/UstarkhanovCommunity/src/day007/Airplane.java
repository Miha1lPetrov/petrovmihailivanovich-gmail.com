package day007;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;

    public Airplane(String producer, int year, int length, int weigth){
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
    public double setLength(int length){
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

    public static void compareAirplanes(Airplane a1 , Airplane a2){
        if(a1.length > a2.length){
            System.out.println("Самолет " + a1.producer + " длиннее чем самолет  " + a2.producer);
        }else if(a1.length < a2.length){
            System.out.println("Самолет " + a2.producer + " длиннее чем самолет  " + a1.producer);
        }else {
            System.out.println("длины самолетов равны");
        }
    }


}
