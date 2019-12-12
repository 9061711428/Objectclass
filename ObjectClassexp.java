package objectclass;
//import java.util.Scanner;
public class ObjectClassexp {
static int last_num=100;
int roll_no;
Objectclassexp()//Constuctor of Objectclassexp class
{
	roll_no=last_num;
	
	
}
public int hashcode() // Method in Objectclassexp class
{
	return roll_no;
	
}
public static void main(String args[])
{
	Objectclassexp s=new Objectclassexp();
	System.out.println(s);
	System.out.println(s.toString());
	Object obj=new String("FACE");
	Class c=obj.getClass();
	System.out.println("class of object obj is:"+ c.getName());
	s=null;
	System.gc();//Call Garbage collector
	
	
		
}
protected  void finalize() 
{
	System.out.println("Finalize method ");
	
}

	
}
