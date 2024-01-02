package in.co.rays.basics;

public class Circle extends Shape {

	 private int Radius ;
	 
	 public Circle() {
		System.out.println("Default circle cons");
	 }
	public Circle(int radius) {
		this.Radius=radius;
	}
	
	
	public int getRadious() {
	return Radius;
	}	

	public void setRadius(int radius) {
	this.Radius=radius;
	}

	public void area() {
		double area=3.14 * Radius * Radius;

	
	
	System.out.println("Circle area="+area);
	}
	}
	
	
	
	
	
