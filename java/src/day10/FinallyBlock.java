package day10;

public class FinallyBlock {

	public static void main(String[] args) {
		
		
         String s=null;
		 
		 try
		 {
		 System.out.println(s.length());
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("catch block HandledException....");
			 System.out.println(e.getMessage());
		 
		 }
		finally
		{
			 System.out.println("you entered into finally block...." );
			 
		}
		
		 System.out.println("program  finished..");
		 
		 
	




	}

}
