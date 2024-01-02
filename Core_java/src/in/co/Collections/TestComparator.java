package in.co.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
  public static void main(String []args) {
	  
    ArrayList<Employee>emp=new ArrayList();	  
	emp.add(new Employee(1,"Sanjana",1234));  
	emp.add(new Employee(3,"suraj",12345)) ;
	emp.add(new Employee(4,"Anni",123456)) ;
	emp.add(new Employee(2,"yatharth",123));
//	System.out.println(emp);  
    
	Collections.sort(emp,new OrderIdcomparator());
	  System.out.println(emp);
	  Collections.sort(emp,new Ordernamecomparator());
	  System.out.println(emp);
	  Collections.sort(emp,new Orderphonecomparator());
	  System.out.println(emp);
  }
}
