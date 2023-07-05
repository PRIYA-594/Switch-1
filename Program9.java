package Switch;
import java.util.*;
import java.util.regex.Pattern;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] st = {"TN","KL","KA","AP"};
		int f=0;
		for(int i=0;i<st.length;i++) {
		if(str.substring(0,2).equals(st[i]))
		{
			System.out.println(str.substring(0,2).equals(st[i]));
			if(Pattern.matches("[0-9]{2}", str.substring(2,4)))
			{
				System.out.println(Pattern.matches("[0-9][0-9]", str.substring(2,4)));
				if(Pattern.matches("[A-Z]{2}", str.substring(4,6)))
				{
					System.out.println(Pattern.matches("[A-Z][A-Z]", str.substring(4,6)));
					if(Pattern.matches("[0-9]{4}", str.substring(6,str.length())))
					{
						System.out.println(Pattern.matches("[0-9]{4}", str.substring(6,str.length())));
						f=1;
					}
				}
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
