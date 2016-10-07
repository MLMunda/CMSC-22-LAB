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
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    
    public double getSide() {
        return getWidth();
    }
    
    public void setLength(double length) {
        setSide(length);
    }
    
    public void setWidth(double width) {
        setSide(width);
    }
    
    public String toString() {
        return "A Square with side= " + getWidth() + ", which is a subclass of " + super.toString();
    }
}
