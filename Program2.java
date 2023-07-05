package Switch;
import java.util.*;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch(ch)
		{
		     case 'a':
		     case 'e':
		     case 'i':
		     case 'o':
		     case 'u':
		     case 'A':
		     case 'E':
		     case 'I':
		     case 'O':
		     case 'U':
		    	 System.out.println("Vowel");
		    	 break;
		     default:
		    	 System.out.println("Not a Vowel");
		}
		s.close();
	}
}
