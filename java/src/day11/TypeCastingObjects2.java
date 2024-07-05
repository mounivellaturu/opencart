package day11;

// Cat ct=(Cat) an;




class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}



public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		//Rule1:conversion is valid or not
		// The type of 'd' and 'c' must have some relationship(either parent to child or child to parent)
		
		
		Animal an=new Dog();
		Cat ct=(Cat)an; //valid  as per rule1
		
		Dog dg=new Dog();
		Cat ct=(Cat) dg; //invalid as per rule
		
		//Rule2: assignment is valid or not
		//'c' must be either same or child of'A'
		
		// Animal an =new Dog();
		// Cat ct=(Cat)an; //valid as per rule1
		
		// Animal an =new Dog();
		// Cat ct=(Dog)an;//invalid as per rule2
	
		//Rule3:
		// The  underlying object type of 'd' must be either same or chid of 'c'
		
		// Animal an=new Dog();
		// Cat ct=(Cat)an; //invalid as per rule3
		
		//rule1 rule2 rule3
		Animal an =new Dog();
		Dog dg=(Dog)an; //rule1-yes rule2-yes rule3-yes
		
		
		
		
		
		
	}

}
