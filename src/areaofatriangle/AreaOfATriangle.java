/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaofatriangle;

/**
 * Area Of A Triangle calculates the area of a scalene triangle
 * 
 * @author Aaron Mirotta
 * @since 19/02/2020
 */
import javax.swing.*;

public class AreaOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable delcaration
        double a;
        double b;
        double c;
        double s;
        double area;
        
        String input1;
        String input2;
        String input3;
       //open panel and input data
        input1 = JOptionPane.showInputDialog("Enter the length of side 1:");
        a = Double.parseDouble(input1);
        
        input2 = JOptionPane.showInputDialog("Enter the length of side 2:");
        b = Double.parseDouble(input2);
        
        input3 = JOptionPane.showInputDialog("Enter the length of side 3:");
        c = Double.parseDouble(input3); 
        //find the semi-perimiter
        s = (a + b + c)/2;
        //calculate the area of the triangle
        area = (s*(s-a)*(s-b)*(s-c));
        area = Math.sqrt(area);
        //print out the area
        System.out.println("The area of the triangle is: " +area);
    }
    
}
