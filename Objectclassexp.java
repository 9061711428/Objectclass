package objectclass;
//import java.util.Scanner;
public class Objectclassexp {
static int last_num=100;
int roll_no;
Objectclassexp()
{
	roll_no=last_num;
	
	
}
public int hashcode()
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
	System.gc();
	
	
		
}
protected  void finalize()
{
	System.out.println("Finalize method ");
	
}

	
}
