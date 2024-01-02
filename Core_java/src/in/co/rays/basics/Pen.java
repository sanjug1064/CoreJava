package in.co.rays.basics;
class pen{
	String color;
	String type;
	public void write() {
		System.out.println("writing something");
	}
}
public class Pen {
public static void main(String[]args) {
	pen penone=new pen();
	penone.color="blue";
	penone.type="gel";
	penone.write();
	
}
}