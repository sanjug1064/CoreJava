package in.co.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapone {
public static void main(String[]args) {
    Map m1=new HashMap();
    m1.put(6,"sanjana patel");
    m1.put(2,"anjali ");
    m1.put(3,"kartik");
    m1.put(4,"mini");
    System.out.println("HashMap after adding elements:"+m1 );
    System.out.println("contains key (true or false):"+m1.containsKey(3));
    System.out.println("contain Value (true or false ):" +m1.containsValue("mini"));
    System.out.println("set view is:"+m1);
}
}
