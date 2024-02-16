package day009;

public abstract class Figure {
    private String color;
    public Figure(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area(); //возвращает площадь фигуры
    public abstract double perimetr(); //возвращает периметр фигуры
}
