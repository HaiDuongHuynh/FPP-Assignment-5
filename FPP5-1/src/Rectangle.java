public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,double width,double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return 2*(width+height);
    }
}
