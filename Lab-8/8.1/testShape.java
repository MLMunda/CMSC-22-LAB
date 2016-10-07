package testshape;

public class testShape {

    public static void main(String[] args){
        //VERSION 1
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // getArea is not present in Shape
        System.out.println(s1.getPerimeter());     // getPerimeter is not present in Shape
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());        //getRadius is not present in Shape
   
        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);                   //get methods can be accessed because of downcasting
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
   
        Shape s2 = new Shape();
   
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        
        System.out.println(s3);                    // cant access get methods in rectangle because s3 is upcasted to shape
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);         //get methods can be accessed because of downcasting
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);         // cant access get methods in square because s3 is upcasted to shape
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Rectangle, 
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;  // cant access getside method because the method is only available if instance is square
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}