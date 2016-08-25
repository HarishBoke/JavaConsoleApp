package mywebportal;
import mywebportal.Employee;
import java.util.Scanner;
import java.util.ArrayList;

public class SetEmployee {	
	public static void main(String[] args){
		ArrayList<Employee> empList = new ArrayList<Employee>();		
		SetEmployee.flashOptions(empList);		
	}
	public static void confirmAction(ArrayList<Employee> eList){
		System.out.println("--------------------------- ");
		System.out.println("Press 'Y' for menu and 'N' for exit");
		System.out.println("--------------------------- ");
		Scanner confirmAction = new Scanner(System.in);
		String resAction = confirmAction.nextLine();
		System.out.println("ResAction:" + resAction);
		if(resAction == "Y" || resAction == "y"){
			System.out.println(resAction);
			SetEmployee.exitApp();
		}else{
			SetEmployee.flashOptions(eList);
		}
	}
	public static void flashOptions(ArrayList<Employee> eList){
		System.out.println("Select Menu: ");
		System.out.println("1. Add Employee: ");
		System.out.println("2. Show All Employee: ");
		System.out.println("3. Enter Employee Id to see Details of the Employee: ");
		System.out.println("4. Enter Employee Id to Delete the Employee: ");
		System.out.println("5. Show Count of all Employee: ");
		System.out.println("6. Search Employee by Name: ");
		System.out.println("7. Exit the App ");
		
		Scanner userInput = new Scanner(System.in); 
		System.out.println("\n Enter Your Choice by Number: ");
		int userSelection = -1;
	     try{
	    	  userSelection = Integer.parseInt(userInput.nextLine());
	     }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
            SetEmployee.flashOptions(eList);
	     }
	    //userInput.close();
	    	switch(userSelection){
		    	case 1:
		    		SetEmployee.addEmp(eList);
		    		System.out.println("\n");
		    		confirmAction(eList);
		    	break;
		    	case 2:
		    		SetEmployee.showAllEmp(eList);
		    		System.out.println("\n");
		    		confirmAction(eList);
		    		break;
		    	case 3:
		    		System.out.println("\n");
		    		SetEmployee.showEmpDetails(eList);
		    		confirmAction(eList);
		    		break;
		    	case 4:
		    		System.out.println("\n");
		    		SetEmployee.deleteEmp(eList);
		    		confirmAction(eList);
		    		break;
		    	case 5:
		    		System.out.println("\n");
		    		SetEmployee.showEmpTotalCount(eList);
		    		confirmAction(eList);
		    		break;
		    	case 6:
		    		System.out.println("\n");
		    		SetEmployee.searchEmpDetails(eList);
		    		confirmAction(eList);
		    		break;
		    	case 7:
		    		System.out.println("\n");
		    		SetEmployee.exitApp();
		    		break;
		    	default:
		    		//end the app
		    	break;
	    	}

	     
	}
	
	public static ArrayList<Employee> addEmp(ArrayList<Employee> myEmployeeList){
			Scanner empInput = new Scanner(System.in);
	        System.out.print("Enter Name: ");
	        String uname = empInput.nextLine();
	        System.out.print("Enter Employee Id:");
	        int empId = -1;
	        try{
	        	empId = Integer.parseInt(empInput.nextLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        System.out.println("Designation: ");
	        String designation = empInput.nextLine();
	        //empInput.close();
	         //new ArrayList<Employee>();
	        	Employee newEmp = new Employee(uname, empId, designation);
	        	myEmployeeList.add(newEmp);
		        return myEmployeeList;
	        	//return newEmp;
	}
	
	public static void showAllEmp(ArrayList<Employee> empList){
	    //System.out.println(empList.length);
		if(empList.size()>0){
			System.out.println("==================================================");
	        for(Employee em : empList) {
	            System.out.println(" Employee Name: " + em.getEmpName() + "\n Employee Id: " + em.getEmpId() + "\n Employee Designation: " + em.getEmpRole() + "\n");
	            //System.out.println("\n");
	        }
	        System.out.println("==================================================");
        }		
		else{
			System.err.println("No Users Added Yet!");
		}
	}
	
	public static void showEmpDetails(ArrayList<Employee> empList){
		//show employee details by employee Id:
		System.out.println("Enter employee Id to see details: ");
		Scanner getEmpId = new Scanner(System.in);
		 	try{
	        	int empId = Integer.parseInt(getEmpId.nextLine());
	        	if(empList.size()>0){
	        		System.out.println("--------------------------- ");
	        		for(int i = 0; i < empList.size(); ++i){
		        		if(empList.get(i).getEmpId() == empId){
		        			System.out.println("Employee id: " + empId + " is associated with below records: ");
		        			System.out.println(" Employee Name: " + empList.get(i).getEmpName() + "\n Employee Id: " + empList.get(i).getEmpId() + "\n Employee Designation: " + empList.get(i).getEmpRole() + "\n");
		        			break;        			
		        		}		        		
		        	}
	        		System.out.println("--------------------------- ");
	        	}
	        	else{
	        		System.err.println("Employee List is Empty!" );
	        	}
	        	
	        	
	        	//
        		
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	}
	
	public static ArrayList<Employee> deleteEmp(ArrayList<Employee> empList){
		System.out.println("Enter employee Id to delete Employee Record: ");
		Scanner getEmpId = new Scanner(System.in);
		int empId = Integer.parseInt(getEmpId.nextLine());
		for(Employee emp : empList){
			if(emp.getEmpId().equals(empId)){
				empList.remove(emp);
				System.out.println("--------------------------- ");
				System.out.println("Employee record of id:" + empId + " is deleted successfully!");
				System.out.println("--------------------------- ");
				break;
			}
		}
		return empList;
	}
	
	public static void showEmpTotalCount(ArrayList<Employee> empList){
		
		//Show Employee arrayLength
		if(empList.size() > 0){
			System.out.println("--------------------------- ");
			System.out.println("We have total " + empList.size() + " Emplyees record!");
		}
		else{
			System.err.println("We have no Emplyees record yet!");
			System.out.println("--------------------------- ");
		}	
		
	}	
	
	public static void searchEmpDetails(ArrayList<Employee> empList){
		System.out.println("Enter employee Name to find Employee Record: ");
		Scanner getEmpName = new Scanner(System.in);
		String empName = getEmpName.nextLine();
		// create a generic display function 
		if(empList.size()>0){
    		System.out.println("--------------------------- ");
    		System.out.println("Employee Records name:" + empName + " as below");
    		for(Employee emN: empList){
        		if(emN.getEmpName().equals(empName)){
        			System.out.println(" Employee Name: " + emN.getEmpName() + "\n Employee Id: " + emN.getEmpId() + "\n Employee Designation: " + emN.getEmpRole() + "\n");
        			//break;        			
        		}		        		
        	}
    		System.out.println("--------------------------- ");
    	}
    	else{
    		System.err.println("Employee List is Empty!" );
    	}
			
	}
	
	
	public static void exitApp(){
		System.out.println("GoodBye!");
		System.exit(0);
	}
	
}
