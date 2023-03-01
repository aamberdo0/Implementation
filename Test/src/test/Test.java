/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package test;

/**
 *
 * This class - insert class description
 * @author Amber Do
 */

import java.util.Scanner; 
public class Test {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter first number: "); 
       int num1 = input.nextInt(); 
       
       System.out.println("Enter second number: "); 
       int num2 = input.nextInt(); 
       
       System.out.println("Enter third number: "); 
       int num3 = input.nextInt(); 
       
       display(num1,num2,num3);
       
    }
    public static void display(int num1, int num2, int num3){
        int top; 
        int middle; 
        int last; 
        
        if(num1 > num2 && num1 > num3){
            top = num1; 
            if(num2 > num3){
                middle = num2; 
                last = num3; 
            }else{
                middle = num3; 
                last = num2; 
            }
            
        }else if(num2 > num1 && num2 > num3){
            top = num2; 
            if(num1 > num3){
                middle = num1; 
                last = num3;
                
            }else{
                middle = num3; 
                last = num1;
            }
        }else{
            top = num3; 
            if(num1 > num2){
                middle = num1; 
                last = num2;
            }else{
               middle = num2; 
               last = num1; 
            }
        }
        
        System.out.println("The descending order: " + top + " " +  middle + " " +last);
    }
    
    
    
    
    

}

