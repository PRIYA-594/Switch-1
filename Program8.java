package Switch;
import java.util.*;
import java.lang.Math;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int last = num%10;
		int d = (int)Math.log10(num);
		int first = num/(int)Math.pow(10,d);
		int r = Math.max(first,last);
		System.out.println(r);
		s.close();
	}
}
