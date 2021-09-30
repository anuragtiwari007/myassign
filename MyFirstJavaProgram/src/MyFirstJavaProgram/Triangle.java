package MyFirstJavaProgram;
class AreaPerimeterofTriangle{
	float side1=(float) 3;
	float side2=(float) 4;
	float side3=(float) 5;
	//areaoftriangle
	float Area(){
		float area=(float) ((side1*side3)/2);
		return area;
	}
		//perimeter
	float Perimeter() {
		float perimeter=(float) (side1+side2+side3);
		return perimeter; 
}

public class Triangle {
	public static void main(String args[]) {
		AreaPerimeterofTriangle areaperimeteroftriangle = new AreaPerimeterofTriangle();
		float area=areaperimeteroftriangle.Area();
		float perimeter=areaperimeteroftriangle.Perimeter();
		System.out.println("Area "+area);
		System.out.println("Perimeter "+perimeter);
	}
}
}