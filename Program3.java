package Switch;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int f = (a>b)?1:0;
		switch(f)
		{
		    case 1:
		    	System.out.println(a);
		    	break;
		    case 2:
		    	System.out.println(b);
		    	break;
		}
		s.close();
	}
}
