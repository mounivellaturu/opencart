package day11;

//A b=(c) d;



public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
		//Ex1
    //  Object o=new String("welcome");
      // StringBuffer sb=(StringBuffer) o; //rule1-yes rule2-yes rule3-failed
      
		//Ex2
		// String s=new String("welcome");
		// StringBuffer sb=(StringBuffer) s; // rule1-faied
		
		
		//Ex3
	//	Object o=new String("welcome");
	//	StringBuffer sb=(StringBuffer) o; //rule1-yes rule2-yes rule3-failed
		
		//Ex4
	//	String s=new String("welcome");
	//    StringBuffer sb=(String) o; //rule1-passed rule2-failed
	    
	    //Ex5
	   // String s=new String("welcome");
	   // StringBuffer sb=(String) s; //rule1-passed rule2-failed
	    
	    //Ex6
	   // Object o=new String("welcome");
	   // StringBuffer sb=(StringBuffer) o; //rule1-passed rule2-passed rule3-failed
	    
	    //Ex7
	    Object o=new String("welcome");
	    String s= (String) o; //rule1-paased rule2-passed rule3-passed
	    
	    System.out.println(s);
	    
	    
	    
	    
		
		
		
	}

}
