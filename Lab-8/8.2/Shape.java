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
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape() {
        color = "green";
        filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public String toString() {
        if(filled) {
            return "A shape with color of " + color + " and filled.";
        }
        else {
            return "A shape with color of " + color + " and not filled.";
        }
    }
}
