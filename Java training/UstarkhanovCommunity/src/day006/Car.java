package day006;

public class Car {

    private int yearOfReleas;
    private String color;
    private String model;
    //Создаем гетеры и сетеры для наших полей ( принцип инкапсуляции тк наши поля private )
    public void setYearOfReleas(int yearOfReleas){
        this.yearOfReleas = yearOfReleas;
    }
    public int getYearOfReleas(){
        return yearOfReleas;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return inputYear - yearOfReleas;

    }
}
