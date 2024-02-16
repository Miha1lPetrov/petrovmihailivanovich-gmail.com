package day009;

public class Rectangle extends Figure{
    private int width; //ширина
    private int height;//высота
    public Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    public double area(){
        //System.out.println("Площадь круга равна - " + (width * height);
        return (width * height);
    }
    public double perimetr(){
        //System.out.println("Периметр круга равен - " + ((width + height)*2));
        return ((width + height)*2);
    }
}
