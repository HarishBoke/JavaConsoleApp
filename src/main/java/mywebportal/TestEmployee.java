package mywebportal;
import mywebportal.Employee;

public class TestEmployee {
	public static void main(String[] args){
		Employee harish = new Employee(null, null, null);
		harish.setName("Harish");
		harish.setEmpId(1625);
		harish.setRole("Engineer");
		
		System.out.println(" Name: " + harish.getEmpName() 
				+ "\n Employee Id: " + harish.getEmpId()
				+ "\n Role: " + harish.getEmpRole());
	}	
}
