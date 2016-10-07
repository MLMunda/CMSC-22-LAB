/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author MarcLeo
 */
public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    public Square(double side) {
        length = side;
        width = side;
    }
    
    public Square(double side, String color, boolean filled) {
        this(side);
        this.color = color;
        this.filled = filled;
    }
    
    public void setSide(double side) {
        width = side;
        length = side;
    }
    
    public double getSide() {
        return getWidth();
    }
    
    public void setLength(double length) {
        this.length = length;
        width = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }
    
    public String toString() {
        return "A Square with side= " + getWidth() + ", which is a subclass of " + super.toString();
    }
}
