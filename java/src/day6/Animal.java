package day6;

public class Animal {

	String color="white";
	
	
void eat()
{
	System.out.println("eating..");
}
}

class Dog extends Animal
{
	String color="black";
			void displaycolor()
			{
			System.out.println(super.color);
			}
			void eat()
			{
				//System.out.println("eating bread..");
			super.eat();
			}
}
