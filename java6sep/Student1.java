package MyFirstJavaProgram;
class StudentRecord1{
	String getName(String name) {
		return name;
	}
	int getRollnumber(int rollno) {
		return rollno;
	}
	int getPhonenumber(int phonenumber) {
	return phonenumber;
	}
	String getAddress(String address) {
		return address;
	}
}
class StudentRecord2{
	String getName(String name) {
		return name;
	}
	int getRollnumber(int rollno) {
		return rollno;
	}
	int getPhonenumber(int phonenumber) {
	return phonenumber;
	}
	String getAddress(String address) {
		return address;
	}
}
public class Student1 {
	public static void main(String args[]) {
		StudentRecord1 studentRecord1= new StudentRecord1();
		String Name=studentRecord1.getName("John");
		int roll_no=studentRecord1.getRollnumber(1);
		int Phonenumber=studentRecord1.getPhonenumber(1234567890);
		String Address=studentRecord1.getAddress("Delhi");
		System.out.println("Details of Student1 "+ Name+" "+roll_no+" "+Phonenumber+" "+Address);
		StudentRecord2 studentRecord2= new StudentRecord2();
		String Name1=studentRecord2.getName("Sam");
		int roll_no1=studentRecord2.getRollnumber(2);
		int Phonenumber1=studentRecord2.getPhonenumber(1234567891);
		String Address1=studentRecord2.getAddress("Dubai");
		System.out.println("Details of Student2 "+ Name1+" "+roll_no1+" "+Phonenumber1+" "+Address1);
	}

}
