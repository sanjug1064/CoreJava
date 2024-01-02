package in.co.rays.basics;

public class Shape {

	private int borderwidth;
	private String color;

//    public Shape() {
//    	System.out.println("Default shape cons");
//    }
    
    public String getcolor( ) {
    	return color;
    }
    public void setColor(String color) {
    	this.color=color;
    }
    public int getBorderwidth() {
    	return borderwidth;
    }
      public void setBorderwidth(int borderwidth) {
    	this.borderwidth = borderwidth;
    }
    
   public void area() {   
     System.out.println ("shape area");
   }  
}    
    
    
    