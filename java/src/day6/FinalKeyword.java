package day6;
class Test
{
 final int x=100;

}







public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		
		t.x=200; //incorrect,because x is final variable
		System.out.println(t.x);
	}

}
