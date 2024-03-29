package assessment19sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class Patient implements Comparable<Patient>{
	private int patientId;
	private String name;
	private int age;

	public Patient(int patientId,String name,int age) {
		super();
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
    //TreeSet
	@Override
	public int compareTo(Patient patient) {
		// TODO Auto-generated method stub
		if(this.patientId==patient.getPatientId()) {
			return 0;
		}
		else if(this.patientId>patient.getPatientId()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	
}
public class TestPatientList {
	
	public static int getPatientAge(String name,TreeSet listofpatient) {
		int age=0;
		Iterator<Patient> itr=listofpatient.iterator();
		while(itr.hasNext()) {
			Patient patient=itr.next();
			if(patient.getName()==name) {
				age=patient.getAge();
			}
		}
		return age;
	}
	
	public static void main(String args[]) {
	  
	   List<Patient> patientList=new ArrayList<Patient>();
	   patientList.add(new Patient(1, "Rahul", 21));
		patientList.add(new Patient(2, "Akshit", 28));
		patientList.add(new Patient(3, "Ashishh", 25));		
		patientList.add(new Patient(4, "Akshay", 26));
	   Collections.sort(patientList,new Comparator<Patient>(){
		   public int compare(Patient p1,Patient p2) {
			   return p1.getName().compareTo(p2.getName());
		   }
	   });
	   System.out.println("Sorting the patient by there name : ");
	   for(Patient patient:patientList) {
		   System.out.println("Patient id : "+patient.getPatientId()+", Patient name : "+patient.getName()+", Patient age : "+patient.getAge());
	   }
	   
	  
	   Collections.sort(patientList,new Comparator<Patient>(){
		   public int compare(Patient p1,Patient p2) {
			   return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());
		   }
	   });
	   System.out.println("\nSorting the patient by there age : ");
	   Iterator<Patient> iterator= patientList.iterator();
	   while(iterator.hasNext()) {
		   Patient p=iterator.next();
		   System.out.println("Patient id : "+p.getPatientId()+", Patient name : "+p.getName()+", Patient age : "+p.getAge());
	   }
	   TreeSet<Patient> listofpatientintreeset=new TreeSet<Patient>(patientList);
	 
	   System.out.println("\nTraversing patient list from tree set");
	   for(Patient patient1:listofpatientintreeset) {
		   System.out.println("Patient id : "+patient1.getPatientId()+", Patient name : "+patient1.getName()+", Patient age : "+patient1.getAge());
	   }
	   
	  int age=getPatientAge("Akshit",listofpatientintreeset);
	  System.out.println("\nAge of the given patient is : "+age);
	  
	}

}
