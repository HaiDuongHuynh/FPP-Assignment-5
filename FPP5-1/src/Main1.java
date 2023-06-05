public class Main1 {
    public static void printTotal(Shape[] shapes){
        for(Shape e: shapes){
            System.out.println("Shape's color: " + e.color + ", total area: " + e.calculateArea() + ", total perimeter: " + e.calculatePerimeter());
        }
    }

    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle("Blue", 4.0,6.0);
        Square shape2 = new Square("Green", 2.0,2.0);
        Circle shape3 = new Circle("Red", 5.0);
        Rectangle shape4 = new Rectangle("Cyan", 12.0,3.5);
        Circle shape5 = new Circle("White", 6.5);
        Shape[] shapes = new Shape[5];
        shapes[0] = shape1;
        shapes[1] = shape2;
        shapes[2] = shape3;
        shapes[3] = shape4;
        shapes[4] = shape5;
        printTotal(shapes);
    }
}