package day005;

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
        return this.yearOfReleas;
    }
    public String getColor(){
        return  this.color;
    }
    public String getModel(){
        return this.model;
    }

}
