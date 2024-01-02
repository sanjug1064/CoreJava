package in.co.Collections;

import java.util.Comparator;

public class Ordernamecomparator  implements Comparator<Employee>{

	public int compare(Employee o1,Employee o2) {
		return o1.getName(). compareTo(o2.getName());
	}
}
