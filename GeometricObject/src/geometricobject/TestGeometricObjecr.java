/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package geometricobject;

public class TestGeometricObjecr {

    public static void main(String[] args) {
        // create 5 array of GeometricObject
        GeometricObject[] objects ={new Square(3.5),new Circle(4.5)
                ,new Square(6),new Rectangle(2,5),new Square(5.5)}; 
        
        
        // Display each object
        display(objects); 
    }
    
    
    
    /*for (int i = 0; i < output.length; i++) {

System.out.println("The Area : " + output[i].getArea());

// for each loop
if (output[i] instanceof Colorable) {


((Colorable) output[i]).howToColor();
}}}}//*/
    /** A method for displaying a geometric object */
    public static void display(GeometricObject[] object){
        for(int i = 0; i < object.length; i++){ 
           
                // format the area to 2 decimals
                String s2 = String.format("%.2f",object[i].getArea());
                System.out.println(object[i]  + s2 );
            
            //check if object is an instanceof Colorable interface
            if(object[i] instanceof Colorable){
                System.out.println(((Colorable)object[i]).howToColor()); 
            }
        }
    }       
}
        
        
    
    


