package Switch;
import java.util.*;
import java.util.regex.*;
public class Program10 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] st = {"TN","KL","KA","AP"};
		int f=0;
		for(int i=0;i<st.length;i++) {
		if(str.substring(0,2).equals(st[i]))
		{
			if(Pattern.matches("[0-9]+[A-Z]{1,2}+[0-9]{1,4}", str.substring(2,str.length())))
			{
				f=1;
			}
		}
		}
		if(f==1)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		s.close();
	}
}
