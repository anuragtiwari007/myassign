package MyFirstJavaProgram;
class Record{
	String getName(String name) {
		return name;
	}
	int getRollNumber(int Rollno) {
		return Rollno;
	}	
	}
public class Student {
	public static void main(String args[]) {
		Record studentrecord= new Record();
		String Name=studentrecord.getName("John");
		int roll_no=studentrecord.getRollNumber(2);
		System.out.println("Name "+Name);
		System.out.println("roll_no "+roll_no);
	}
}
