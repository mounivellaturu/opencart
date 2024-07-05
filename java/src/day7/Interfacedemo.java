package day7;

interface Shape
{
	int length=10; //final&static 
	int width=20; //final&static 
	 
	
	void circle(); //abstract method
	
	default void square()
	{
		System.out.println("this is square-defaut method");
		
		}

 static void rectangle()
 {
	 
	System.out.println("this is rectangle-static method");
	
 }


}













public class Interfacedemo implements Shape
{
	 public void circle()
	{
		System.out.println("this is circle - abstract method");
	}

	 void triangle()
	 {
		 System.out.println("this is triangle");
	 }
	 
	 int x=100,y=200;
	 
	public static void main(String[] args) {
		
		//scenario1
		
		Interfacedemo idobj= new Interfacedemo();
		idobj.circle();//abstract
		idobj.square();//default
		idobj.triangle();
		
		System.out.println(idobj.x+idobj.y);
		
		Shape.rectangle();//static method can directly access from interface
		
		//scenario2
		
		Shape sh= new Interfacedemo();
		
		
		sh.circle();//abstract
		sh.square();//default
		
		Shape.rectangle();
		
		
		System.out.println(Shape.length*Shape.width);//accessing static variables directly
		
		//sh.triangle();//we cannot access
	//	System.out.prinln(sh.x+sh.y); //we cannot access
	}

}
