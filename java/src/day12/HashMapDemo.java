package day12;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		
		// HashMap hm=new HashMap();
		// Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		// Adding pairs
		
		hm.put(101,"john");
		hm.put(102,"mary");
		hm.put(103,"scott");
		hm.put(104,"scott");
		hm.put(102,"david");
		
		System.out.println(hm);
	
	}

}
