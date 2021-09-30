package MyFirstJavaProgram;

public class Trianglewithparameters {
	  int s1,s2,s3;
	    public Trianglewithparameters(int side1,int side2,int side3)
	     {
	        s1=side1;
	        s2=side2;
	        s3=side3;
	     }
	       public static void main(String[] args)
	       {
	    	   Trianglewithparameters trianglewithparameters=new Trianglewithparameters(3,4,5);
	             int perimeter=(trianglewithparameters.s1+trianglewithparameters.s2+trianglewithparameters.s3);
	             System.out.println("perimeter is:"+perimeter);
	             int sp=(perimeter/2);
	             int ar=((((sp*(sp-trianglewithparameters.s1))*(sp-trianglewithparameters.s2))*(sp-trianglewithparameters.s3)));       
	             int area=(int)Math.sqrt(ar);   
	             System.out.println("Area is:"+area);
	        }
}