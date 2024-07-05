package day2;

public class Greetingsmain {

	public static void main(String[] args) {
		
		Greetings gr= new Greetings();
		
		gr.m1(); //1
		
		 String s=gr.m2(); //2
		 System.out.println(s);
		 
		 gr.m3("john");
		 
		 String var =gr.m4("David");
		 System.out.println(var);
		 
	}

}
