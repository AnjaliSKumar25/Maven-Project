package firstproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;



public class FruitsCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Mango");
		ob.add("Orange");
		ob.add("Apple");
		System.out.println(ob);
		
		ArrayList ob1 = new ArrayList();
		ob1.add(0, "Pineapple");
		ob1.add("Carrot");
		System.out.println(ob1);
		
		ArrayList<String> ob2 = new ArrayList<String>();
		ob2.add("Grapes");
		ob2.add("Pear");
		System.out.println(ob2.addAll(ob1));
		System.out.println(ob2);
		System.out.println(ob2.addAll(ob));
		System.out.println(ob2);
		
		System.out.println(ob2.remove(2));
		System.out.println(ob2);
		
		for(String f:ob2)
		{
			System.out.println(f);
		}
		
		Collections.sort(ob2);
		System.out.println(ob2);
		
		Iterator itr = ob2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println("Hello");
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		System.out.println(set);
		
		LinkedList<Double> ls = new LinkedList<Double>();  
		ls.add(1.1);
		ls.add(2.2);
		ls.add(2.3);
		ls.add(1, 3.3);
	
		System.out.println(ls);
	}

}
