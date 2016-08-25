package mywebportal;
import mywebportal.Employee;

public class TestEmployee {
	public static void main(String[] args){
		Employee Harish = new Employee();
		Harish.setName("Harish");
		Harish.setEmpId(1625);
		Harish.setRole("Engineer");
		
		System.out.println(" Name: " + Harish.getName() 
				+ "\n Employee Id: " + Harish.getEmpId()
				+ "\n Role: " + Harish.getRole());
		
	}	
}
