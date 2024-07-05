package day11;

//upcasting-->converting value from smaller-->larger

//int-->long
//float-->double


//Downcasting-->converting value from larger-->smaller

//long-->int
//double-->float



public class TypeCastingConcept {

	public static void main(String[] args) {
		
           //  upcasting-automatic-->smaller to larger
            /*  int intvalue=100;
              long longvalue=intvalue;
              System.out.println(longvalue);
              
		*/
		
		// float floatvalue=10.5F;
	//	double doublevalue=floatvalue;
	//	System.out.println(doublevalue);
		
		//Downcasting-manually-->larger to smaller
		
		// long longvalue=10000;
		// int intvalue=(int)longvalue;
		
		// double doublevalue=125.55;
		// float floatvalue=(float)doublevalue;
		
		//Examle1
		//int i=100;
		//double d=i; //upcasting
		//System.out.println(d);
		
		
		//Example2
		
		double d=10.5;
		int i=(int)d; //downcasting
		
		System.out.println(i);
		
				
	}

}
