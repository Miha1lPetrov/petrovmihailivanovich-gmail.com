package day006;

public class Motorbike {

    private int yearOfReleas;
    private String color;
    private String model;

    public Motorbike(int yearOfReleas, String color, String model){
        this.yearOfReleas = yearOfReleas;
        this.color = color;
        this.model = model;
    }
    //Создали конструктор сдесь мы(пользователь) ОБЯЗАН создать объект с инициализированными полями

    public int getYearOfReleas(){
        return yearOfReleas;
    }
    public String getColor(){
        return  color;
    }
    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл " + getClass());
    }
    public static void yearDifference(Motorbike m1){
        int res = 2024 - m1.yearOfReleas;
        System.out.println("Возраст мото " + res);
    }

}
