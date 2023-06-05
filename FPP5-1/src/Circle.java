public class Circle extends Shape{
    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI* radius*radius;
    }

    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }
}
