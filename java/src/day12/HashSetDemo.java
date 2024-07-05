package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		
	    HashSet myset=new HashSet();
		
		// Set myset=new HashSet();
		 
		// HashSet <String>myset=new HashSet<String>();
		
		//adding elements into hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing hashset
		
		System.out.println(myset);
		//size of hashset
		 System.out.println("size of hashset:"+ myset.size());
		
		//removing element
		myset.remove(10.5);
		System.out.println("After removing:"+myset); //[null, A, 100, welcome, true]
		
		//Inserting element-not possible
		
		//Access specific element-not possible
		 
		//Convert HashSet to ArrayList
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		//Read all the elements using for..each loop
		/*for(Object x:myset)
		{
			System.out.println(x);
		}
		*/
		//using iterator
		
		
		Iterator  it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
			
			
			
			
		
		//clearing all the elements in hashset
		myset.clear();
		
		System.out.println(myset());
		
		
		
		
		
	}

}
