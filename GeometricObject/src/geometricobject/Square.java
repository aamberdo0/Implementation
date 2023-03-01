/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package geometricobject;

public class Square extends GeometricObject implements Colorable {
    private double side;
    
    
    public Square(){
        this(1.0);
    }

     /** return side */
    public double getSide() {
        return side;
    }
 /** Set a new side */
    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    @Override  /** Return area */
    public double getArea() {
        return( Math.pow(side,2));
    
    }
    @Override /** Return perimeter */
    public double getPerimeter() {
        return side * 4;
    }
    
    @Override // return howToColor
    public String howToColor(){
        return "Color all four sides";
    }
    
    @Override  /** Return a string representation of a Square object */
    public String toString() {
        return super.toString()+ "Square with side " + side + " is : " ;
    }
} 
