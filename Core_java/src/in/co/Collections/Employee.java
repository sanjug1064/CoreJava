package in.co.Collections;

public class Employee {

private int empId;
private String name;
private int phone;

public Employee(int empId,String name,int phone) {
this.empId=empId;
this.name=name;
this.phone=phone;	
}

public int getEmpId() {
	return empId;
}

 public void setEmpid(int EmpId) {
 this.empId=empId;
 }

public String getName() {
	return name;
}

public void setName(String name) {
  this.name=name;  
}

public int getphone() {
	return phone;
}

public void setphone(int phone) {
	this.phone=phone;
}
public String toString() {
	
	return empId+ "  "+ name + " " + phone;
}





}
 
 
 
 


