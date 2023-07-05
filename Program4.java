package Switch;
import  java.util.*;
public class Program4 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = s.next().charAt(0);
		int res =str.indexOf(ch);
		switch(res)
		{
		    case -1:
		    	System.out.println("Not present");
		    	break;
		    default:
		    	System.out.println("Present");
		}
		s.close();
	}
}
