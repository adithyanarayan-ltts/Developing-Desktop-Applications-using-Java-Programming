package day_3;

import java.io.IOException;
import java.util.*;

abstract class Shape{
	private int value;
	abstract float calculateArea(int value);
}
class Circle extends Shape{
	public float calculateArea(int value){
        return (float)(3.14*value*value);
    }
}
class Square extends Shape {
    public float calculateArea(int value){
        return value*value;
    }
    
}
public class ShapeMain {
	public static void main(String[] args) throws IOException{
        try{
        	Scanner sc=new Scanner(System.in);
        	Shape sh;
            System.out.println("Circle");
            System.out.println("Square");
            System.out.println("Enter the shape");
            String shape=sc.next();
            if(shape.equals("Circle")||shape.equals("circle")){
            System.out.print("Enter the radius: ");
            int radius=sc.nextInt();
            Circle c=new Circle();
            sh=c;
            System.out.println("Area of circle is: " +sh.calculateArea(radius));
            }
            else if(shape.equals("Square")||shape.equals("square")){
                System.out.println("Enter the side: ");
                int side=sc.nextInt();
                Square s=new Square();
                sh=s;
                System.out.println("Area of square is: "+sh.calculateArea(side));
                
            }        
            else {
            	sc.close();
            	throw new IOException("Invalid Input");
            }
            sc.close();
        }catch(Exception e) {
        	System.out.println(e);
        	}
        
    }    
}
