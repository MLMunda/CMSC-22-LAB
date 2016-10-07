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
import java.math.*;

public class Circle extends Shape {
    protected double radius;
    
    public Circle() {
        radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return (radius * radius) * Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "A circle with a radius= " + radius + " which is a subclass of " + super.toString();
    }
}
