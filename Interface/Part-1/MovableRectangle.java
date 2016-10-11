package movable;

/**
 *
 * @author Munda, Hilaga, Unabia
 */
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    
    public String toString() {
        return "Rectangles topleft point is at: " + topLeft.x + ", " + topLeft.y + 
               "\nand its bottomright point is at: " + bottomRight.x + ", " + bottomRight.y;
    }
}
