package Switch;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			switch(ch)
			{
			    case 'a':case 'A':
			    case 'e':case 'E':
			    case 'i':case 'I':
			    case 'o':case 'O':
			    case 'u':case 'U':
			    	str=str.replace(ch,'@');
			    	break;
			}
		}
		System.out.println(str);
	    s.close();
	}
}
