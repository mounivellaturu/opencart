package day1;

public class employeemain {
	

	public static void main (String[] args)
	{
	employee emp1=new employee();
    emp1.empid=101;
    emp1.ename="john";
    emp1.job="Manager";
    emp1.sal=50000;
    emp1.display();
    
    
    employee emp2=new employee();
    emp1.empid=102;
    emp1.ename="david";
    emp1.job="engineer";
    emp1.sal=3000;
    emp2.display();
    

}
}