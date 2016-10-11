package geometricobject;

/**
 *
 * @author Munda, Hilaga, Unabia
 */
public class testResizeableCircle {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(10);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.resize(70);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        
    }
}
