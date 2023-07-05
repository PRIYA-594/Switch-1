package Switch;
import java.util.*;
public class Program6 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		System.out.println(str.substring(len-2));
		s.close();	
	}
}
