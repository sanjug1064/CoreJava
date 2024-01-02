package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDatemethod {
     public static void main(String[]args) throws ParseException {
    	 Date d = new Date();
    	// System.out.println(d);
    	 
//simpleDateformat qrs=new simpleDateformat("dd/mm/yyyy");
    	 //String s=qrs.format(d);
    //System .out.println("" +s);
    	 
    	 String ros="08/12/2023";
    	 SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    	 d =sdf.parse(ros);
    	 System.out.println(d);
}
}
