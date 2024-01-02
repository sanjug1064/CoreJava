 package in.co.rays.basics;

public class Tringle extends Shape {
private int height;
private int base;

// Tringle() {
//System.out.println("Default tringle cons");	
//}

public Tringle(int height,int base) {
this. base=base;
this.height=height;
}

public int getHeight() {
return height;
}

public void setHeight(int height) {
this .height=height;
}

public int getBase() {
	return base;
}	
	
public void  setbase (int base) {
	this.base=base;
}
	
public void area() {	
double area=(height*base)/2;
System.out.println("Tringle area="+ area);
}


	
	
	
	
}



