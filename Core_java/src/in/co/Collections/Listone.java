package in.co.Collections;

import java.util.ArrayList;
import java.util.List;

public class Listone {
public static void main(String[]args) {	
	List a1=new ArrayList();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	a1.add(6);
	System.out.println("List after adding elements" +a1);
	System .out .println("Get element of 3rd index=" +a1.get(3));
	a1.remove(3);
	System.out.println("List after removing 3rd elements" + a1);
	System.out.println("index of 6 is="+a1.lastIndexOf(6));
	System.out.println("Sublist from 1-4="+a1.subList(1,4));
}
}
