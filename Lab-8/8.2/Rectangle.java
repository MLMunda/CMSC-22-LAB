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
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        this(width, length);
        this.color = color;
        this.filled = filled;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return (width + length) * 2;
    }
    
    public String toString() {
        return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
    }
}
