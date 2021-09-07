package MyFirstJavaProgram;

public class AreaOfRectangle {
	  int l1=4,b1=5,l2=5,b2=8;
	  public static void main(String[] args)
	    {
		  AreaOfRectangle rect=new AreaOfRectangle();
	            System.out.println("Area of rectangle 1 is :"+rect.Area(rect.l1,rect.b1));
	            System.out.println("Area of rectangle 2 is :"+rect.Area(rect.l2,rect.b2));
	     }
	     public int Area(int length,int breadth)
	     {
	               return length*breadth;   
	     }
}