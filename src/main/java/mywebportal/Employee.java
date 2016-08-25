package mywebportal;

public class Employee {
	private String name;
	private Integer empId;
	private String role;
	
	public Employee(String name, Integer empId, String role){
		this.name = name;
		this.empId = empId;
		this.role = role;
	}
	
	/*public void setName(String name){
		this.name = name;
	}
	public void setEmpId(Integer empId){
		this.empId = empId;
	}
	
	public void setRole(String role){
		this.role = role;
	}
	*/
	public String getEmpName(){
		return this.name;
	}
	public Integer getEmpId(){
		return this.empId;
	}
	public String getEmpRole(){
		return this.role;
	}
	public void printEmployeeDetails(){
		
	}
}



