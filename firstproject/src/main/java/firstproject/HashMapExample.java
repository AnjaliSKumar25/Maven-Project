package firstproject;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();   
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");  
		   map.put(3,"Grapes"); 
		       
		   System.out.println("Iterating Hashmap");  
		   for(Map.Entry m : map.entrySet())
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("Changes");  
	}

}
