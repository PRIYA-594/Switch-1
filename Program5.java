package Switch;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = s.next().charAt(0);
		System.out.println(str.indexOf(ch));
		s.close();
	}
}
