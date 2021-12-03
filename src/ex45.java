import java.lang.Math;

public class ex45 {
    public static void main(String[] args){
        IShape[] s= new IShape[2];
        s[0]= new Rectangle(3.5, 2.1);
        s[1]= new Circle(9.9);
        for (int i=0; i<2; i++){
            System.out.println("Area of Shape " + (i+1) + " = " + s[i].getArea());
            System.out.println("Perimeter of Shape " + (i +1) +" = " + s[i].getPerimeter());
            System.out.println();
        }
        }
    }

interface IShape{
    double getArea();
    double getPerimeter();
}

class Rectangle implements IShape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length= length;
        this.width= width;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
}

class Circle implements IShape{
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    @Override
    public double getArea(){
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}