package in.co.rays.basics;

public class Rectangle  extends Shape{
 private int length;
 private int width;
 
 public Rectangle() {
	System.out.println("Default Rectangle cons"); 
 }
 
 public Rectangle(int length, int width) {
	this.length= length;
	this.width=width;
 }
 public int getlength() {
    return length;
 } 

 public void setLength(int length) {
	 this .length=length;
 }
 
public int getwidth() { 
return width;
}

public void setWidth(int width) {
this.width=width;
}

public void area() {
int area=length*width;
System.out.println("Rec area ="+ area);
}
}


	 
	 
	 
	 
	 
	 
 
 
 
 

