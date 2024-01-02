package in.co.Collections;

import java.util.Comparator;

public class Orderphonecomparator implements Comparator<Employee> {
	
	
	public int compare(Employee o1,Employee o2) {
return o1.getphone()- o2.getphone();
}
}