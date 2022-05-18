package org.employee;

//           class
public class EmployeeDetails {
	
	//           method 1
	private void empName() {
		
		System.out.println("Employee name : Anand");
	}
	
	//           method 2
	private void empMobile() {
		
		System.out.println("Employee mobile : 8939278836");
	}
	
	private void empId() {
		
		System.out.println("Employee id : 12345");
	}
	
	//                main method
	public static void main(String[] args) {
		
		//             obj
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		
	}

}
