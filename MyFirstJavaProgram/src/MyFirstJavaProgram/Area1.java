package MyFirstJavaProgram;

import java.util.Scanner;

public class Area1
{
float length, breadth, area;

  void set_values(float length, float breadth)
  {  
     this.length = length;
     this.breadth = breadth;
     
     area = this.length * this.breadth;
  }
 
 float get_Area1()
 {
     return area; 
 }

public static void main(String[] args)
    {
        Area1 ar = new Area1();
        float l,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of rectangle : ");
        l=sc.nextFloat();
        
        System.out.println("Enter breadth of rectangle : ");
        b=sc.nextFloat();
        ar.set_values(l, b);
        System.out.println("Area of rectangle is = " +ar.get_Area1());
}
}