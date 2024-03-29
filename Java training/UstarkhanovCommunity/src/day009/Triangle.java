package day009;

public class Triangle extends Figure{
    private int lengthSide1;
    private int lengthSide2;
    private int lengthSide3;
    public Triangle(int lengthSide1, int lengthSide2, int lengthSide3, String color){
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }
    public double area(){
        double p = (lengthSide1 + lengthSide2 + lengthSide3)/2;
        //System.out.println("Площадь треугольника равна - " + (Math.sqrt(p*(p - lengthSide1) * (p-lengthSide2) * (p-lengthSide3))));
        return Math.sqrt(p*(p - lengthSide1) * (p-lengthSide2) * (p-lengthSide3));
    }
    public double perimetr(){
        //System.out.println("Периметр круга равен - " + (lengthSide1 + lengthSide2 + lengthSide3));
        return (lengthSide1 + lengthSide2 + lengthSide3);
    }


}
