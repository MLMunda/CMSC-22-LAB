package geometricobject;

/**
 *
 * @author Munda, Hilaga, Unabia
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    
    public void resize(int percent) {
        radius += (radius * ((double) percent / 100));
    }
}
