package day009;

public class Circle extends Figure{
    private int radiusCircle;
    public Circle(int radiusCircle, String color){
        super(color);
        this.radiusCircle = radiusCircle;
    }
    public double area(){
        //System.out.println("Площадь круга равна - " + (Math.pow(radiusCircle, 2) * Math.PI));
        return (Math.pow(radiusCircle, 2) * Math.PI);
    }
    public double perimetr(){
        //System.out.println("Периметр круга равен - " + (2 * Math.PI * radiusCircle));
        return (2 * Math.PI * radiusCircle);
    }
}
