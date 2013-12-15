package anagram;
import java.util.Arrays;


public class Signature {
	public static String sortString(String s)
	{
		char[] ar = s.toCharArray();
		Arrays.sort(ar);
		String str = new String(ar);
		return str; 
	}
}
