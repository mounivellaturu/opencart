package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		 ArrayList mylist=new ArrayList();
		// List mylist=new ArrayList();
		// ArrayList<String>mylist=new ArrayList<String>();
		
			// Adding data into arraylist
		    mylist.add(100);
		    mylist.add(10.5);
		    mylist.add("welcome");
		    mylist.add(true);
		    mylist.add(100);
		    mylist.add(null);
		    mylist.add(null);
		
		//Size of arraylist
		  System.out.println ("Size of an arraylist:"+mylist.size());
		
		//Printing arraylist
		  System.out.println("Printing data from arraylist:"+mylist);
		  
		 
		  //Remove element from arraylist
		   mylist.remove(4); //here 4 is index of element
		   System.out.println("After removing:"+mylist);
		  
		  //Insert element in the arraylist
		   mylist.add(2,"java");
		   System.out.println("After insertion:"+mylist);
		   
		   //Modify element in the arraylist
		   mylist.set(2, "python");
		   System.out.println("After replacing:"+mylist);
		   
		   //Access specific element from arraylist
		   System.out.println( mylist.get(3));
		   
		   //Reading all the elements from the arraylist
		   
		   //using normal for loop
		   
		 /*  for(int i=0;i<mylist.size();i++)
		   {
			   System.out.println(mylist.get(i));
		   }
		   */
		   
		   //using for.. each loop
		   
		/*   for(Object X:mylist)
		   {
			   
		   System.out.println(X);
		   }
		   */
		   
		   //using iterator
		   
		/*   Iterator it= mylist.iterator();
		   
		   while(it.hasNext())
		   
		   {
			System.out.println(it.next());   
			
		   }
		   */
		   //checking arraylist is empty or not
		   
	System.out.println( "Is arraylist empty?"  + mylist.isEmpty());
				   
		   
		   //remove all the elements from arraylist
	ArrayList mylist2=new ArrayList();
	mylist2.add(100);
	mylist2.add(null);
	
	mylist.removeAll(mylist2);
	
	
	System.out.println("After removing multiple elements:"+mylist);
	
	//remove all the elents/clear
	mylist.clear();
	System.out.println( "Is arraylist empty?"  + mylist.isEmpty());
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
